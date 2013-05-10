import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class LOGOTurtle{
	public static final double EPSILON = 0.001;
	public static final double INIT_ANGLE = 270.;
	public static final double CIRCLE_DEGREE = 360.;
	public static final double ANGLE_RATIO = 1.;
	public static final double MAX_SPEED = 50.;
	public static final double MIN_SPEED = 1.;
	public static final double INIT_SPEED = 20.;

	private double xPos        = 0;
	private double yPos        = 0;
	private double angle       = INIT_ANGLE;
	public double xPosBack	   = 0;
	public double yPosBack 	   = 0;
	public double angleBack    = INIT_ANGLE;

	private double speed       = INIT_SPEED;
	private double speedBack   = INIT_SPEED;

	private boolean penDown    = true;
	private boolean showTurtle = true;
	private int color = 0;
	private String name;
	public LOGOCanvas canvasOn;
	//private static Image turtleImg = Toolkit.getDefaultToolkit().getImage("logo_turtle.png");
	private static ImageIcon turtleImg = new ImageIcon("logo_turtle_color.png");
	private static final HashMap<String, int[]> colorValues = new HashMap<String, int[]>();
	{
		//				R    G    B
		int[] red    = {255,   0,   0};
		int[] blue   = {  0,   0, 255};
		int[] green  = {  0, 255,   0};
		int[] white  = {255, 255, 255};
		int[] black  = {  0,   0,   0};
		int[] yellow = {255, 255,   0};
		int[] orange = {255, 165,   0};
		int[] pink   = {255, 192, 203};
		int[] purple = {160,  32, 240};
		int[] brown  = {162,  42,  42};
		int[] gray   = {190, 190, 190};
		colorValues.put(   "RED",    red);
		colorValues.put(  "BLUE",   blue);
		colorValues.put( "GREEN",  green);
		colorValues.put( "WHITE",  white);
		colorValues.put( "BLACK",  black);
		colorValues.put("YELLOW", yellow);
		colorValues.put("ORANGE", orange);
		colorValues.put(  "PINK",   pink);
		colorValues.put("PURPLE", purple);
		colorValues.put( "BROWN",  brown);
		colorValues.put(  "GRAY",   gray);
	}

	/*
	 * Constructor
	 * @id: name
	 */
	LOGOTurtle(String id) {
		name = id;
	}

	// geters
	public String  getName() 		{return name;}
	public double  getXPos() 		{return xPos;}
	public double  getYPos() 		{return yPos;}
	public double  getXPosBack() 	{return xPosBack;}
	public double  getYPosBack() 	{return yPosBack;}
	public double  getAngle() 		{return angle;}
	public double  getAngleBack() 	{return angleBack;}
	public double  getSpeed() 		{return speed;}
	public double  getSpeedBack() 	{return speedBack;}
	public int     getColor()		{return color;}
	public boolean getPenDown() 	{return penDown;}
	public boolean getShowTurtle() 	{return showTurtle;}

	// seters
	public void setXPos(double x) 		 { xPos = calXPos(x);}
	public void setXPosBack(double x) 	 { xPosBack = calXPos(x);}
	public void setYPos(double y) 		 { yPos = calYPos(y);}
	public void setYPosBack(double y) 	 { yPosBack = calYPos(y);}
	public void setAngle(double a) 		 { angle = calAngle(a);}
	public void setAngleBack(double a) 	 { angleBack = calAngle(a);}
	public void setSpeed(double s) 		 { if (calSpeed(s) > 0.) speed = s;}
	public void setSpeedBack(double s) 	 { if (calSpeed(s) > 0.) speedBack = s;}
	public void setColor(int c) 		 { color = c;}
	public void setPenDown(boolean p) 	 { penDown = p;}
	public void setShowTurtle(boolean s) { showTurtle = s;}

	private double calXPos(double x) {
		if (null == canvasOn)
			return 0.;
		double ret;
		if (canvasOn.wrap) {
			// Wrap Mode
			ret = x % canvasOn.getWidth();
			ret = (ret < 0) ? ret + (double)canvasOn.getWidth() : ret;
		} else {
			// Fence Mode
			ret = (x < 0) ? 0 : x;
			ret = (x > (double)canvasOn.getWidth()) ? (double)canvasOn.getWidth() : ret;
		}
		return ret;
	}

	private double calYPos(double y) {
		if (null == canvasOn)
			return 0.;
		double ret;
		if (canvasOn.wrap) {
			// Wrap Mode
			ret = y % canvasOn.getHeight();
			ret = (ret < 0) ? ret + (double)canvasOn.getHeight() : ret;
		} else {
			// Fence Mode
			ret = (y < 0) ? 0 : y;
			ret = (y > (double)canvasOn.getHeight()) ? (double)canvasOn.getHeight() : ret;
		}
		return ret;
	}

	private double calAngle(double a) {
		double ret = a % CIRCLE_DEGREE;
		if (ret < 0.)
			ret += CIRCLE_DEGREE;
		return ret;
	}

	private double calSpeed(double s) {
		if (s < MIN_SPEED || s > MAX_SPEED) {
			LOGOPP.errorhandler.setRunTime("SET SPEED", "Wrong value for speed, should be between "
				+ new Integer((int)MIN_SPEED).toString() + " and " 
				+ new Integer((int)MAX_SPEED).toString() + ".");
			return -1.;
		}
		return s;
	}

	/*
	 * get color value of current color for BMP file
	 * not consider alpha value
	 */
	public static int colorValue(int[] c) {
		if (c.length != 3)
			return 0;
		return c[0]|c[1]<<8|c[2]<<16;
	}

	public void changeColor(String c) {
		if (colorValues.containsKey(c.toUpperCase())) {
			int [] targetColor = colorValues.get(c.toUpperCase());
			color = colorValue(targetColor);
		}
		else {
			LOGOPP.errorhandler.setRunTime("COLOR", "Invalid content of color.");
		}
	}

	/*
	 * Paint point on canvas at given position using current color
	 * @x: origin on left-top corner, horizontally towards right
	 * @y: origin on left-top corner, vertically towards down
	 */
	public void paintPoint(int x, int y) {
		x = (x < 0) ? 0 : x;
		x = (x > canvasOn.getWidth() - 1) ? canvasOn.getWidth() - 1 : x;
		y = (y < 0) ? 0 : y;
		y = (y > canvasOn.getHeight() - 1) ? canvasOn.getHeight() - 1 : y;
		//LOGOPP.io.debug("draw to"+x + "," +y);
		canvasOn.bitmap[canvasOn.getHeight() - 1 - y][x] = color;
	}

	/*
	 * Paint point on canvas at current position using current color
	 */
	public void paintPoint() {
		int x = ((int)xPos < 0) ? 0 : (int)xPos;
		x = (x > canvasOn.getWidth() - 1) ? canvasOn.getWidth() - 1 : x;
		int y = ((int)yPos < 0) ? 0 : (int)yPos;
		y = (y > canvasOn.getHeight() - 1) ? canvasOn.getHeight() - 1 : y;
		//LOGOPP.io.debug("draw to"+x + "," +y);
		canvasOn.bitmap[canvasOn.getHeight() - 1 - y][x] = color;
	}

	private int[][] direction = {{-1,0},{0,-1},{1,0},{0,1},{1,1},{1,-1},{-1,1},{-1,-1}};

	public void fill() {
		int oldColor = canvasOn.getBitmap()[canvasOn.getHeight() - 1 - (int)yPos][(int)xPos];
		if (oldColor == color)
			return;
		floodFill((int)xPos, (int)yPos, oldColor);
	}

	private void floodFill(int x, int y, int oldColor) {
		class Pixel {
			int x;
			int y;
			public Pixel(int x_, int y_) {
				x = x_;
				y = y_;
			}
		}
		Stack<Pixel> stack = new Stack<Pixel>();
		Pixel p = new Pixel(x, y);
		stack.push(p);
		while (!stack.empty()) {
			Pixel p_ = stack.pop();
			canvasOn.getBitmap()[canvasOn.getHeight() - 1 - p_.y][p_.x] = color;
			for (int i = 0; i < 4; i++) {
				int x_ = p_.x + direction[i][0];
				int y_ = p_.y + direction[i][1];
				if (!canvasOn.outOfBound(x_, y_) && canvasOn.getBitmap()[canvasOn.getHeight() - 1 - y_][x_] == oldColor) {
					Pixel p__ = new Pixel(x_, y_);
					stack.push(p__);
				}
			}
		}
	}

	public boolean moveForward(double restXPos, double restYPos, double step) {
		double dis = Math.sqrt(restXPos * restXPos + restYPos * restYPos);
		if (dis <= step || !LOGOPP.hasAnimation) {
			moveTurtle(restXPos, restYPos, penDown);
			return true;
		} else {
			moveTurtle(step * restXPos / dis, step * restYPos / dis, penDown);
			return false;
		}
	}

	/*
	 * Move turtle from current place to target place
	 * TODO: wrap or fence
	 * @deltaX: delta X pos
	 * @deltaY: delta Y pos
	 * @isDraw: true for pendown, false for penup
	 */
	private void moveTurtle(double deltaX, double deltaY, boolean isDraw) {
		double tarX = xPos + deltaX;
		double tarY = yPos + deltaY;
		if (isDraw) {
			double length = Math.sqrt (deltaX * deltaX + deltaY * deltaY);
			double stepX = deltaX / length;
			double stepY = deltaY / length;
			int count = (int)length * 2;
			for (int cnt = 0; cnt < count; cnt++) {
				setXPos(xPos + (double)stepX / 2);
				setYPos(yPos + (double)stepY / 2);
				paintPoint();
			}
			setXPos(tarX);
			setYPos(tarY);
			paintPoint();
		}
		setXPos(tarX);
		setYPos(tarY);
	}

	public boolean turnTurtle(double deltaAngle, double step) {
		if (Math.abs(deltaAngle) <= step * ANGLE_RATIO || !LOGOPP.hasAnimation) {
			setAngle(angle - deltaAngle);
			return true;
		} else {
			if (deltaAngle > 0)
				setAngle(angle - step * ANGLE_RATIO);
			else
				setAngle(angle + step * ANGLE_RATIO);
			return false;
		}
	}

	public void teleport(double x, double y) {
		setXPos(x);
		setYPos(y);
	}

	public void reset() {
		setXPos((double)(canvasOn.getWidth() / 2));
		setYPos((double)(canvasOn.getHeight() / 2));
		setAngle(INIT_ANGLE);
		setSpeed(INIT_SPEED);
		setPenDown(true);
		setShowTurtle(true);
		setColor(0);
	}

	public void resetBack() {
		setXPosBack((double)(canvasOn.getWidth() / 2));
		setYPosBack((double)(canvasOn.getHeight() / 2));
		setAngleBack(INIT_ANGLE);
		setSpeedBack(INIT_SPEED);
	}

	/*
	 * paint this turtle on canvas
	 *@g
	 */
	public void paint(Graphics g) {
		if (showTurtle) {
			Graphics2D g2 = (Graphics2D) g;
			AffineTransform saveAt = g2.getTransform();
			AffineTransform at = AffineTransform.getTranslateInstance(xPos, yPos);
			at.rotate(Math.toRadians(angle + 90));
			g2.setTransform(at);
			g2.drawImage(turtleImg.getImage(), -turtleImg.getIconWidth() / 2, -turtleImg.getIconHeight() / 2,
					turtleImg.getIconWidth(), turtleImg.getIconHeight(), canvasOn);
			g2.setTransform(saveAt);
			g.drawString(name, (int)xPos -turtleImg.getIconWidth() / 2, 
								(int)yPos - turtleImg.getIconHeight() / 2);
		}
	}
}