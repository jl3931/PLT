import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class LOGOCanvas extends JComponent {

	final static public int WHITE_COLOR = 255|255<<8|255<<16;
	final static public int DEFAULT_WIDTH = 500;
	final static public int DEFAULT_HEIGHT = 500;
	
	private String title = "untitled canvas";
	public HashMap<String, LOGOTurtle> turtlePool = new HashMap<String, LOGOTurtle>();
	private LOGOTurtle curTurtle;
	public boolean wrap = true;
	public int[][] bitmap;
	private int width;
	private int height;	
	private LOGOPP windowOn;

	// geters
	public int getWidth() {return width;}
	public int getHeight() {return height;}
	public LOGOTurtle getCurTurtle() {return curTurtle;}
	public LOGOPP getWindow() {return windowOn;}
	public void setWindow(LOGOPP window) {windowOn = window;}
	public int[][] getBitmap() {return bitmap;}

	/*
	 * Constructor using default size
	 * @name: name of this canvas
	 */
	public LOGOCanvas(String name) {
		init(name, DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}

	/*
	 * Constructor with customized size
	 * @name: name of this canvas
	 * @w: width
	 * @h: height
	 */
	public LOGOCanvas(String name, int w, int h) {
		init(name, w, h);
	}
	
	/*
	 * Clean the bitmap
	 */
	public void clean() {
		for (int i = 0; i < height; i++)
			for (int j = 0; j < width; j++)
				bitmap[i][j] = WHITE_COLOR;
	}

	/*
	 * Initialize canvas with given name and size
	 * @name: name of this canvas
	 * @w: width
	 * @h: height
	 */
	private void init(String name, int w, int h) {
		height = h;
		width = w;
		if (name != null)
			title = name;
		bitmap = new int[height][width];
		clean();
	}

	/*
	 * Change current control turtle by its name
	 * @name: name of turtle to switch to
	 * @return: true if switch successfully
	 */
	public boolean changeToTurtle(String name) {
		if (turtlePool.containsKey(name)) {
			curTurtle = turtlePool.get(name);
			return true;
		}
		else
			return false;
	}

	/*
	 * Put a turtle on this canvas
	 * @tur: reference to turtle
	 * @x, @y: position on canvas, origin at left-top corner
	 *			if size is invalid, will move it to proper region
	 */
	public void putTurtle(LOGOTurtle tur, int x, int y) {
		tur.canvasOn = this;
		tur.setXPos((double)x);
		tur.setYPos((double)y);
		turtlePool.put(tur.getName(), tur);
		curTurtle = tur;
	}

	/*
	 * Compare two bitmap
	 * @bitmap1, @bitmap2: two bitmaps
	 * @return: 0. if size not same or nothing on both bitmaps
	 *			ratio of intersection / union
	 *			only consider "hasDrawnOnThisPixel", colors not concerned
	 */ 
	static public double bitmapCompare(int[][] bitmap1, int[][] bitmap2) {
		if (bitmap1 == null || bitmap2 == null
			|| bitmap1.length != bitmap2.length)
			return 0.;
		for (int r = 0; r < bitmap1.length; r++)
			if (bitmap1[r].length != bitmap2[r].length)
				return 0.;
		int height = bitmap1.length;
		int width = bitmap1[0].length;
		int intersection = 0;
		int union = 0;
		for (int r = 0; r < height; r++) {
			for (int c = 0; c < width; c++) {
				if (bitmap1[r][c] != WHITE_COLOR) {
					union++;
					if (bitmap2[r][c] != WHITE_COLOR)
						intersection++;
				} else if (bitmap2[r][c] != WHITE_COLOR)
					union++;
			}
		}
		return (union != 0) ? ((double)intersection) / ((double)union) : 0;
	}

	/*
	 * Paint this Component, called by using paint() or repaint()
	 * @g
	 */
	public void paint(Graphics g) {
		BMPIO.saveBMP(title+".bmp",bitmap, null);
		try {
			File imageFile = new File(title+".bmp");
			//////////FOR BITMAP COMPARISON TEST
			//int[][] forTest = getBitmapFromBMP(title+".bmp");
			//System.out.println(bitmapCompare(forTest, bitmap));
			//////////END BITMAP COMPARISON TEST
			Image image = ImageIO.read(imageFile);
			ImageIcon icon = new ImageIcon(image);
			Graphics2D g2 = (Graphics2D) g;
			g2.drawImage(icon.getImage(), 0,0, width, height, this);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Iterator it = turtlePool.entrySet().iterator();
    	while (it.hasNext()) {
        	Map.Entry pairs = (Map.Entry)it.next();
        	LOGOTurtle tur = (LOGOTurtle)pairs.getValue();
        	tur.paint(g);
    	}
	}
	

}
