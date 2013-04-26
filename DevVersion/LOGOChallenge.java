import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.geom.AffineTransform;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

class LOGOChallenge extends JComponent {
    private int height;
    private int width;
    private int[][] bitmap;
    private LOGOPP windowOn;
    private boolean challengeOn = false;

    public int[][] getBitmap() {return bitmap;}
    public int getHeight() {return height;}
    public int getWidth() {return width;}

    public void loadChallenge(String path, LOGOPP window) {
        bitmap = BMPIO.getBitmapFromBMP(path);
        challengeOn = (bitmap != null);
        if (bitmap != null) {
            windowOn = window;
            height = bitmap.length;
            width = bitmap[0].length;
            this.repaint();
            windowOn.addChallenge();
            windowOn.changeWindowSize(true);
        }
    }

    public void match() {
        if (challengeOn) {
            LOGOPP.io.out("Matching score is: " + 
                LOGOCanvas.bitmapCompare(bitmap, LOGOPP.canvas.getBitmap())*100
                + "%");
        }
    }

    public void closeChallenge() {
        if (challengeOn) {
            challengeOn = false;
            windowOn.changeWindowSize(false);
            windowOn.removeChallenge();
        }
    }

    public void paint(Graphics g) {
        BMPIO.saveBMP("challenge.bmp",bitmap, null);
        try {
            File imageFile = new File("challenge.bmp");
            Image image = ImageIO.read(imageFile);
            ImageIcon icon = new ImageIcon(image);
            Graphics2D g2 = (Graphics2D) g;
            g2.drawImage(icon.getImage(), 0, 0, width, height, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}