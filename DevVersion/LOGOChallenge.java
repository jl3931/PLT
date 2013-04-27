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
        if (status == challengeType.CHLG_RECORD) 
            LOGOPP.io.err("You're already recording a challenge");
        else if (status == challengeType.CHLG_PLAY)
            LOGOPP.io.err("Cannot record a challenge during playing challenge");
        else {
            status = challengeType.CHLG_RECORD;
            hintList = new LOGOHintList();
            LOGOPP.io.out("Now start recording you challenge.");
        }
    }

    public void writeHint(String content) {
        if (status != challengeType.CHLG_RECORD)
            return;
        hintList.addHint(content, (int)(LOGOPP.canvas.getCurTurtle().getXPos()),
                            (int)(LOGOPP.canvas.getCurTurtle().getYPos()));
    }

    public void writeHint(String content, LOGONode argx, LOGONode argy) {
        if (status != challengeType.CHLG_RECORD)
            return;
        Object objx = argx.run();
        Object objy = argy.run();
        if (objx != null && objy != null && objx instanceof Double && objy instanceof Double) {
            int x = (int)(((Double)objx).doubleValue());
            int y = (int)(((Double)objy).doubleValue());
            hintList.addHint(content, x, y);
        }
    }

    public void removeHint(LOGONode arg) {
        if (status != challengeType.CHLG_RECORD)
            return;
        Object ret = arg.run();
        if (ret != null && ret instanceof Double) {
            int index = (int)(((Double)ret).doubleValue());
            hintList.removeHint(index);
            LOGOPP.canvas.repaint();
        }
    }

    public void removeAllHint() {
        if (status != challengeType.CHLG_RECORD)
            return;
        hintList.clear();
        LOGOPP.canvas.repaint();
    }

    public void saveChallenge(String filename) {
        if (status != challengeType.CHLG_RECORD)
            return;
        LOGOPP.io.debug("saving challenge!");
        LOGOHintList hl = hintList;
        if (hintList.hintNumber() == 0)
            hl = null;
        if (BMPIO.saveBMP(filename, LOGOPP.canvas.getBitmap(), hl)) {
            LOGOPP.io.out("challenge saved!");
        } else {
            LOGOPP.io.err("Failed to save challenge!");
        }
    }

    public void printHints(Graphics g) {
        if (status != challengeType.CHLG_RECORD)
            return;
        hintList.printHints(g, true);
    }


    /*******************FOR PLAYING**********************/
      public void showHint() {
        if (status == challengeType.CHLG_PLAY) {
            isShowingHint = !isShowingHint;
            repaint();
        }
    }

    public void loadChallenge(String path, LOGOPP window) {
        bitmap = BMPIO.getBitmapFromBMP(path);
        if (bitmap != null) {
            Object o = BMPIO.getHiddenObject(path);
            if (o instanceof LOGOHintList) {
                hintList = (LOGOHintList)o;
                hintList.debugHint();
            }
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
        }
    }

    public void match() {
        if (status == challengeType.CHLG_PLAY) {
            LOGOPP.io.out("Matching score is: " + 
                LOGOCanvas.bitmapCompare(bitmap, LOGOPP.canvas.getBitmap())*100
                + "%");
        }
    }

    public void closeChallenge() {
        if (status == challengeType.CHLG_PLAY) {
            windowOn.changeWindowSize(false);
            windowOn.removeChallenge();
        }
        status = challengeType.CHLG_OFF;
        hintList = null;
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
}