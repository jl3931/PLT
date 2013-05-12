/*Written by Xinyuan Wang*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.geom.AffineTransform;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.awt.geom.*;

public class LOGOChallenge extends JComponent {
    private int height;
    private int width;
    private int[][] bitmap;
    private LOGOPP windowOn;
    private enum challengeType {CHLG_OFF, CHLG_RECORD, CHLG_PLAY};
    private challengeType status = challengeType.CHLG_OFF;
    private LOGOHintList hintList = null;
    private boolean isShowingHint = false;

    public int[][] getBitmap() {return bitmap;}
    public int getHeight() {return height;}
    public int getWidth() {return width;}

    /*******************FOR RECORDING**********************/
    public void record() {
        if (LOGOPP.errorhandler.error())
            return;
        if (status == challengeType.CHLG_RECORD)
            LOGOPP.errorhandler.setRunTime("RECORD CHALLENGE", 
                "You're already recording a challenge");
        else if (status == challengeType.CHLG_PLAY)
            LOGOPP.errorhandler.setRunTime("RECORD CHALLENGE", 
                "Cannot record a challenge during playing challenge.");
        else {
            status = challengeType.CHLG_RECORD;
            hintList = new LOGOHintList();
            LOGOPP.io.out("Now start recording your challenge.");
            LOGOPP.io.setChallengeStatus("RECORD");
            LOGOPP.io.showState();
        }
    }

    public void resume(LOGONode arg) {
        if (status != challengeType.CHLG_OFF) {
            LOGOPP.errorhandler.setRunTime("RECORD CHALLENGE", 
                "You can only resume to record a challenge when you are not in challenge mode.");
            return;
        }
        String path = runAndCheckString(arg, "RECORD CHALLENGE");
        if (LOGOPP.errorhandler.error())
            return;
        int[][] map = BMPIO.getBitmapFromBMP(path);
        if (map != null) {
            Object o = BMPIO.getHiddenObject(path);
            if (o instanceof LOGOHintList)
                hintList = (LOGOHintList)o;
            else
                hintList = new LOGOHintList();
            status = challengeType.CHLG_RECORD;
            LOGOPP.canvas.setBitmap(map);
            LOGOPP.io.out("Now continue recording challenge.");
            LOGOPP.io.setChallengeStatus("RECORDING");
            LOGOPP.io.showState();
            LOGOPP.canvas.repaint();
        }
        else {
            LOGOPP.errorhandler.setRunTime("RECORD CHALLENGE", "Failed to resume challenge!");
        }
    }

    public void writeHint(LOGONode arg) {
        if (status != challengeType.CHLG_RECORD) {
            LOGOPP.errorhandler.setRunTime("WRITE HINT", 
                "You can only write hint during recording a challenge.");
            return;
        }
        String ret = runAndCheckString(arg, "WRITE HINT");
        if (LOGOPP.errorhandler.error())
            return;
        hintList.addHint(ret, (int)(LOGOPP.canvas.getCurTurtle().getXPos()),
                                (int)(LOGOPP.canvas.getCurTurtle().getYPos()));
    }

    public void writeHint(LOGONode args, LOGONode argx, LOGONode argy) {
        if (status != challengeType.CHLG_RECORD) {
            LOGOPP.errorhandler.setRunTime("WRITE HINT", 
                "You can only write hints during recording a challenge.");
            return;
        }
        String content = runAndCheckString(args, "WRITE HINT");
        if (LOGOPP.errorhandler.error())
            return;
        Double retx = runAndCheckDouble(argx, "WRITE HINT");
        if (LOGOPP.errorhandler.error())
            return;
        Double rety = runAndCheckDouble(argy, "WRITE HINT");
        if (LOGOPP.errorhandler.error())
            return;
        int x = (int)(retx.doubleValue());
        int y = (int)(rety.doubleValue());
        hintList.addHint(content, x, y);
    }

    public void removeHint(LOGONode arg) {
        if (status != challengeType.CHLG_RECORD) {
            LOGOPP.errorhandler.setRunTime("REMOVE HINT", 
                "You can only remove hints during recording a challenge.");
            return;
        }
        Double ret = runAndCheckDouble(arg, "WRITE HINT");
        if (LOGOPP.errorhandler.error())
            return;
        int index = (int)(ret.doubleValue());
        hintList.removeHint(index);
        if (LOGOPP.errorhandler.error())
            return;
        LOGOPP.canvas.repaint();
    }

    public void removeAllHint() {
        if (LOGOPP.errorhandler.error())
            return;
        if (status != challengeType.CHLG_RECORD) {
            LOGOPP.errorhandler.setRunTime("REMOVE HINT", 
                "You can only remove hints during recording a challenge.");
            return;
        }
        hintList.clear();
        LOGOPP.canvas.repaint();
    }

    public void saveChallenge(LOGONode arg) {
        if (status != challengeType.CHLG_RECORD) {
            LOGOPP.errorhandler.setRunTime("SAVE CHALLENGE", 
                "You can only save challenge recording one.");
            return;
        }
        String filename = runAndCheckString(arg, "SAVE CHALLENGE");
        if (LOGOPP.errorhandler.error())
            return;
        LOGOPP.io.debug("saving challenge!");
        LOGOHintList hl = hintList;
        if (hintList.hintNumber() == 0)
            hl = null;
        if (BMPIO.saveBMP(filename, LOGOPP.canvas.getBitmap(), hl)) {
            LOGOPP.io.out("Challenge saved!");
        } else {
             LOGOPP.errorhandler.setRunTime("SAVE CHALLENGE", "Failed to save challenge!");
        }
    }

    public void printHints(Graphics g) {
        if (status != challengeType.CHLG_RECORD)
            return;
        hintList.printHints(g, true);
    }


    /*******************FOR PLAYING**********************/
      public void showHint() {
        if (LOGOPP.errorhandler.error())
            return;
        if (status == challengeType.CHLG_PLAY) {
            isShowingHint = !isShowingHint;
            repaint();
        }
    }

    public void loadChallenge(LOGONode arg, LOGOPP window) {
        String path = runAndCheckString(arg, "LOAD CHALLENGE");
        if (LOGOPP.errorhandler.error())
            return;
        bitmap = BMPIO.getBitmapFromBMP(path);
        if (LOGOPP.errorhandler.error())
            return;
        if (bitmap != null) {
            Object o = BMPIO.getHiddenObject(path);
            if (o instanceof LOGOHintList)
                hintList = (LOGOHintList)o;
            else
                hintList = null;
            isShowingHint = false;
            status = challengeType.CHLG_PLAY;
            windowOn = window;
            height = bitmap.length;
            width = bitmap[0].length;
            this.repaint();
            windowOn.addChallenge();
            windowOn.changeWindowSize(true);
            LOGOPP.io.setChallengeStatus("PLAY");
            LOGOPP.io.showState();
        }
        else {
            LOGOPP.errorhandler.setRunTime("LOAD CHALLENGE", "Failed to load challenge!");
        }
    }

    public void match() {
        if (LOGOPP.errorhandler.error())
            return;
        if (status == challengeType.CHLG_PLAY) {
            LOGOPP.io.out("Matching score is: " + 
                LOGOCanvas.bitmapCompare(bitmap, LOGOPP.canvas.getBitmap())*100
                + "%");
        }
        else {
             LOGOPP.errorhandler.setRunTime("MATCH", "You need to load a challenge first.");
        }
    }

    public void closeChallenge() {
        if (LOGOPP.errorhandler.error())
            return;
        if (status == challengeType.CHLG_PLAY) {
            windowOn.changeWindowSize(false);
            windowOn.removeChallenge();
        }
        status = challengeType.CHLG_OFF;
        hintList = null;
        LOGOPP.io.setChallengeStatus("");
        LOGOPP.io.showState();
    }

    public void paint(Graphics g) {
        BMPIO.saveBMP("for_the_sake_of_display_challenge.bmp",bitmap, null);
        try {
            File imageFile = new File("for_the_sake_of_display_challenge.bmp");
            Image image = ImageIO.read(imageFile);
            ImageIcon icon = new ImageIcon(image);
            Graphics2D g2 = (Graphics2D) g;
            g2.drawImage(icon.getImage(), 0, 0, width, height, this);
            if (status == challengeType.CHLG_PLAY && hintList != null && isShowingHint) {
                hintList.printHints(g, false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Double runAndCheckDouble(LOGONode node, String id) {
        if (LOGOPP.errorhandler.error())
            return null;
        if (LOGOPP.isInterrupted) {
            LOGOPP.errorhandler.setRunTime(id, "Execution interrupted here.");
            return null;
        }
        if (node == null) {
            LOGOPP.errorhandler.setRunTime(id, "no argument");
            return null;
        }
        Object nodeVal = node.run();
        if (LOGOPP.errorhandler.error())
            return null;
        if (nodeVal == null) {
            LOGOPP.errorhandler.setRunTime(id, "null argument");
            return null;
        }
        if (!(nodeVal instanceof Double)) {
            LOGOPP.errorhandler.setRunTime(id, "wrong argument type");
            return null;
        }
        return (Double) nodeVal;
    }

    String runAndCheckString(LOGONode node, String id) {
        if (LOGOPP.errorhandler.error())
            return null;
        if (LOGOPP.isInterrupted) {
            LOGOPP.errorhandler.setRunTime(id, "Execution interrupted here.");
            return null;
        }
        if (node == null) {
            LOGOPP.errorhandler.setRunTime(id, "no argument");
            return null;
        }
        Object nodeVal = node.run();
        if (LOGOPP.errorhandler.error())
            return null;
        if (nodeVal == null) {
            LOGOPP.errorhandler.setRunTime(id, "null argument");
            return null;
        }
        if (!(nodeVal instanceof String)) {
            LOGOPP.errorhandler.setRunTime(id, "wrong argument type");
            return null;
        }
        return (String) nodeVal;
    }
}