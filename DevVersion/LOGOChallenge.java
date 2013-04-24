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
        bitmap = getBitmapFromBMP(path);
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

    /*
     * Get a 2D-bitmap from BMP file
     * @filename:  name of BMP file
     * @return: 2D array of int values
     *          origin seems to be left bottom corner
     *          value = R|G<<8|B<<16|alpha<<24
     */
    public int[][] getBitmapFromBMP(String filename) {
        try {
            File imageFile = new File(filename);
            BufferedImage image = ImageIO.read(imageFile);
            int[][] ret = new int[image.getHeight()][image.getWidth()];
            for (int y = 0; y < ret.length; y++)
                for (int x = 0; x < ret[y].length; x++) {
                    int rgb = image.getRGB(x, y) & 0x00FFFFFF;
                    int red = (rgb & 0x00FF0000) >> 16;
                    int green = (rgb & 0x0000FF00) >> 8;
                    int blue = (rgb & 0x000000FF);
                    ret[ret.length - 1 - y][x] = red|green<<8|blue<<16;
                }
            return ret;
        }
        catch (Exception e) {
            LOGOPP.io.err("Fail to load file, please check the path");
        }
        return null;
    }

    public void paint(Graphics g) {
        LOGOCanvas.bmpGenerator.saveBMP("challenge.bmp",bitmap);
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