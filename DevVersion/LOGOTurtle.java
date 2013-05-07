import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class LOGOTurtle{
	public static final double EPSILON = 0.001;
	public static final double INIT_ANGLE = 270.;
	public static final double CIRCLE_DEGREE = 360.;
	public static final double ANGLE_RATIO = 1.;
	public static final double MAX_SPEED = 20.;
	public static final double MIN_SPEED = 1.;
	private double xPos        = 0;
	private double yPos        = 0;
	public double xPosBack	   = 0;
	public double yPosBack 	   = 0;
	public double angleBack    = INIT_ANGLE;
	private double angle       = INIT_ANGLE;
	private double speed       = 10.;
	private boolean penDown    = true;
	private boolean showTurtle = true;
	private int[] color = new int[] {0, 0, 0}; //{R,G,B}
	private String name;
	public LOGOCanvas canvasOn;
	//private static Image turtleImg = Toolkit.getDefaultToolkit().getImage("logo_turtle.png");
	private static ImageIcon turtleImg = new ImageIcon("logo_turtle_color.png");
	private static final HashMap<String, int[]> colorValues = new HashMap<String, int[]>();
	{
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
	public double getXPos() {return xPos;}
	public double getYPos() {return yPos;}
	public double getXPosBack() {return xPosBack;}
	public double getYPosBack() {return yPosBack;}
	public double getAngle() {return angle;}
	public double getAngleBack() {return angleBack;}
	public boolean getPenDown() {return penDown;}
	public boolean getShowTurtle() {return showTurtle;}
	public double getSpeed() {return speed;}
	public String getName() {return name;}

	// seters
	public void setAngle(double a) {
		angle = a % CIRCLE_DEGREE;
		if (angle < 0.)
			angle += CIRCLE_DEGREE;
	}
	public void setAngleBack(double a) {
		angleBack = a % CIRCLE_DEGREE;
		if (angleBack < 0.)
			angleBack += CIRCLE_DEGREE;
	}
	public void setPenDown(boolean p) {penDown = p;}
	public void setShowTurtle(boolean s) {showTurtle = s;}
	public void setSpeed(double s) {
		if (s < MIN_SPEED || s > MAX_SPEED) {
			LOGOPP.errorhandler.setRunTime("SET SPEED", "Wrong value for speed, should be between "
				+ new Integer((int)MIN_SPEED).toString() + " and " 
				+ new Integer((int)MAX_SPEED).toString() + ".");
			return;
		}
		speed = s;
	}
	public void setXPos(double x) {
		if (null == canvasOn)
			return;
		if (canvasOn.wrap) {
			// Wrap Mode
			xPos = x % canvasOn.getWidth();
			xPos = (xPos < 0) ? xPos + (double)canvasOn.getWidth() : xPos;
		} else {
			// Fence Mode
			xPos = (x < 0) ? 0 : x;
			xPos = (x > (double)canvasOn.getWidth()) ? (double)canvasOn.getWidth() : xPos;
		}
	}

	public void setYPos(double y) {
		if (null == canvasOn)
			return;
		if (canvasOn.wrap) {
			// Wrap Mode
			yPos = y % canvasOn.getHeight();
			yPos = (yPos < 0) ? yPos + (double)canvasOn.getHeight() : yPos;
		} else {
			// Fence Mode
			yPos = (y < 0) ? 0 : y;
			yPos = (y > (double)canvasOn.getHeight()) ? (double)canvasOn.getHeight() : yPos;
		}
	}
	public void setXPosBack(double x) {
		if (null == canvasOn)
			return;
		if (canvasOn.wrap) {
			// Wrap Mode
			xPosBack = x % canvasOn.getWidth();
			xPosBack = (xPosBack < 0) ? xPosBack + (double)canvasOn.getWidth() : xPosBack;
		} else {
			// Fence Mode
			xPosBack = (x < 0) ? 0 : x;
			xPosBack = (x > (double)canvasOn.getWidth()) ? (double)canvasOn.getWidth() : xPosBack;
		}
	}

	public void setYPosBack(double y) {
		if (null == canvasOn)
			return;
		if (canvasOn.wrap) {
			// Wrap Mode
			yPosBack = y % canvasOn.getHeight();
			yPosBack = (yPos < 0) ? yPosBack + (double)canvasOn.getHeight() : yPosBack;
		} else {
			// Fence Mode
			yPosBack = (y < 0) ? 0 : y;
			yPosBack = (y > (double)canvasOn.getHeight()) ? (double)canvasOn.getHeight() : yPosBack;
		}
	}

	/*
	 * get color value of current color for BMP file
	 * not consider alpha value
	 */
	public int colorValue() {
		return color[0]|color[1]<<8|color[2]<<16;
	}

	public void changeColor(String c) {
		if (colorValues.containsKey(c.toUpperCase())) {
			int [] targetColor = colorValues.get(c.toUpperCase());
			color[0]=targetColor[0];
			color[1]=targetColor[1];
			color[2]=targetColor[2];
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
		canvasOn.bitmap[canvasOn.getHeight() - 1 - y][x] = colorValue();
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
		canvasOn.bitmap[canvasOn.getHeight() - 1 - y][x] = colorValue();
	}

	public boolean moveForward(double restXPos, double restYPos) {
		double dis = Math.sqrt(restXPos * restXPos + restYPos * restYPos);
		if (dis <= speed || !LOGOPP.hasAnimation) {
			moveTurtle(restXPos, restYPos, penDown);
			//System.out.println("stop!");
			return true;
		} else {
			moveTurtle(speed * restXPos / dis, speed * restYPos / dis, penDown);
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
			int count = (int)length;
			for (int cnt = 0; cnt < count; cnt++) {
				setXPos(xPos + (double)stepX);
				setYPos(yPos + (double)stepY);
				paintPoint();
			}
			setXPos(tarX);
			setYPos(tarY);
			paintPoint();
		}
		setXPos(tarX);
		setYPos(tarY);
		if (LOGOPP.hasAnimation)
			canvasOn.repaint();
	}

	public boolean turnTurtle(double deltaAngle) {
		if (Math.abs(deltaAngle) <= speed * ANGLE_RATIO || !LOGOPP.hasAnimation) {
			setAngle(angle - deltaAngle);
			if (LOGOPP.hasAnimation)
				canvasOn.repaint();
			return true;
		} else {
			if (deltaAngle > 0)
				setAngle(angle - speed * ANGLE_RATIO);
			else
				setAngle(angle + speed * ANGLE_RATIO);
			canvasOn.repaint();
			return false;
		}
	}

	public void teleport(double x, double y) {
		setXPos(x);
		setYPos(y);
		if (LOGOPP.hasAnimation)
			canvasOn.repaint();
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