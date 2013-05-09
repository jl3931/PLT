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
	final static private String DISPLAY_IMG_POSTFIX = "_for_the_sake_of_output.bmp";
	
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
	public void setBitmap(int[][] b) {bitmap = b;}

	public boolean outOfBound(int x, int y) {
		return (x < 0|| x >= width || y < 0 || y >= height);
	}
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
		hisNum = DEFAULT_HIS_NUM;
		curHis = 0;
	}

	/*
	 * Change current control turtle by its name
	 * @name: name of turtle to switch to
	 * @return: true if switch successfully
	 */
	public void changeToTurtle(String name) {
		if (turtlePool.containsKey(name)) {
			curTurtle = turtlePool.get(name);
		}
		else {
			LOGOPP.errorhandler.setRunTime("TURTLE", "Cannot find turtle with name:" + name);
		}
			
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
		tur.setXPosBack((double)x);
		tur.setYPosBack((double)y);
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
		BMPIO.saveBMP(title + DISPLAY_IMG_POSTFIX, bitmap, null);
		try {
			File imageFile = new File(title + DISPLAY_IMG_POSTFIX);
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
    	LOGOPP.challenge.printHints(g);
	}

	public void interrupt() {
		Iterator it = turtlePool.entrySet().iterator();
    	while (it.hasNext()) {
        	Map.Entry pairs = (Map.Entry)it.next();
        	LOGOTurtle tur = (LOGOTurtle)pairs.getValue();
        	tur.setXPosBack(tur.getXPos());
			tur.setYPosBack(tur.getYPos());
			tur.setAngleBack(tur.getAngle());
   		}
	}

	public void clearScreen() {
		clean();
		Iterator it = turtlePool.entrySet().iterator();
		LOGOTurtle curTur = getCurTurtle();
		while (it.hasNext()) {
        	Map.Entry pairs = (Map.Entry)it.next();
        	LOGOTurtle tur = (LOGOTurtle)pairs.getValue();
        	if (tur.getName().equals(curTur.getName()))
        		continue;
        	LOGOPP.basic.origin(tur);
   		}
   		LOGOPP.basic.origin(curTur);
	}



	/////////////////////HITORY FOR UNDO AND REDO
	private static final int DEFAULT_HIS_NUM = 10;
	private int hisNum;
	private int curHis;	//#previous history we have

	class CanvasStatus {
		public int[][] bitmap;
		public HashMap<String, TurtleStatus> turtles;
		public boolean wrap;

		public CanvasStatus(int[][] b, HashMap<String, LOGOTurtle> t, boolean w) {
			wrap = w;
			bitmap = copyBitmap(b);
			turtles = new HashMap<String, TurtleStatus>();
			Iterator it = t.entrySet().iterator();
	    	while (it.hasNext()) {
	        	Map.Entry pairs = (Map.Entry)it.next();
	        	LOGOTurtle tur = (LOGOTurtle)pairs.getValue();
	        	TurtleStatus tp = new TurtleStatus(tur.getXPos(), tur.getYPos(), tur.getAngle(), tur.getSpeed(),
	        										tur.getColor(), tur.getPenDown(), tur.getShowTurtle());
	        	turtles.put(tur.getName(), tp);
	   		}
		}
	}

	class TurtleStatus {
		double xPos;
		double yPos;
		double angle;
		double speed;
		int color;
		boolean pendown;
		boolean showturtle;
		public TurtleStatus(double x, double y, double a, double s, int c, boolean pd, boolean st) {
			xPos = x;
			yPos = y;
			angle = a;
			speed = s;
			color = c;
			pendown = pd;
			showturtle = st;
		}
	}

	public static int[][] copyBitmap(int[][] b) {
			int[][] res = new int[b.length][b[0].length];
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b[0].length; j++)
					res[i][j] = b[i][j];
			}
			return res;
		}

	private ArrayList<CanvasStatus> history = new ArrayList<CanvasStatus>();

	public void addHistory() {
		LOGOPP.io.debug("add history");
		addHistory(bitmap, turtlePool, wrap);
	}

	private void addHistory(int[][] b, HashMap<String, LOGOTurtle> t, boolean w) {
		CanvasStatus cs = new CanvasStatus(b, t, w);
		if (curHis == history.size()) {
			if (history.size() == hisNum) {
				history.remove(0);
				curHis--;
			}
		}
		else {
			for (int i = history.size(); i > curHis; i--) {
				history.remove(i - 1);
			}
		}
		curHis++;
		history.add(cs);
		System.out.println(history.size());
	}

	public void undo () {
		LOGOPP.io.debug("undo");
		if (curHis == 1) {
			String noti = "Cannot undo further. ";
			if (history.size() == hisNum)
				noti += "LOGO++ only stores previous " + new Integer(hisNum).toString() + " steps.";
			else
				noti += "This is your initial canvas";
			LOGOPP.io.setStatus(noti);
			LOGOPP.io.showState();
			return;
		}
		curHis--;
		loadHistory(curHis);
		System.out.println(curHis + "/" + history.size());
		LOGOPP.canvas.repaint();
	}

	public void redo () {
		LOGOPP.io.debug("redo");
		if (curHis == history.size()) {
			String noti = "Cannot redo further. This is your newest version of canvas.";
			LOGOPP.io.setStatus(noti);
			LOGOPP.io.showState();
			return;
		}
		curHis++;
		loadHistory(curHis);
		System.out.println(curHis + "/" + history.size());
		LOGOPP.canvas.repaint();
	}

	public void loadHistory(int index) {
		if (index <= 0 || index > history.size())
			return;
		int i = index - 1;
		bitmap = copyBitmap(history.get(i).bitmap);
		wrap = history.get(i).wrap;
		Iterator it = turtlePool.entrySet().iterator();
    	while (it.hasNext()) {
        	Map.Entry pairs = (Map.Entry)it.next();
        	LOGOTurtle tur = (LOGOTurtle)pairs.getValue();
        	if (history.get(i).turtles.containsKey(tur.getName())) {
	        	TurtleStatus tp = history.get(i).turtles.get(tur.getName());
	        	tur.setXPos(tp.xPos);
	        	tur.setYPos(tp.yPos);
	        	tur.setAngle(tp.angle);
	        	tur.setXPosBack(tp.xPos);
	        	tur.setYPosBack(tp.yPos);
	        	tur.setAngleBack(tp.angle);
	        	tur.setSpeed(tp.speed);
	        	tur.setSpeedBack(tp.speed);
	        	tur.setColor(tp.color);
	        	tur.setPenDown(tp.pendown);
	        	tur.setShowTurtle(tp.showturtle);
	        }
    	}
	}
}