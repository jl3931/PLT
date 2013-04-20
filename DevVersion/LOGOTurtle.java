import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class LOGOTurtle{
	public static final double SPEED_ITR_MAX = 100000.;
	public static final double INIT_ANGLE = -90.;
	public static final double CIRCLE_DEGREE = 360.;
	private double xPos = 0;
	private double yPos = 0;
	private double angle = INIT_ANGLE;
	private double speed = 5.;
	private boolean penDown = true;
	private boolean showTurtle = true;
	private int[] color = new int[] {0, 0, 255}; //{R,G,B}
	private String name;
	public LOGOCanvas canvasOn;

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
	public double getAngle() {return angle;}
	public boolean getPenDown() {return penDown;}
	public boolean getShowTurtle() {return showTurtle;}
	public double getSpeed() {return speed;}
	public String getName() {return name;}

	// seters
	public void setAngle(double a) {angle = a % CIRCLE_DEGREE;}
	public void setPenDown(boolean p) {penDown = p;}
	public void setShowTurtle(boolean s) {showTurtle = s;}
	public void setSpeed(double s) {speed = s;}
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

	

	/*
	 * get color value of current color for BMP file
	 * not consider alpha value
	 */
	public int colorValue() {
		return color[0]|color[1]<<8|color[2]<<16;
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
			g2.setComposite(AlphaComposite.SrcAtop.derive(0.2f));//transparent
			ImageIcon turtleImg = new ImageIcon("logo_turtle.png");
			g2.drawImage(turtleImg.getImage(), -turtleImg.getIconWidth() / 2, -turtleImg.getIconHeight() / 2,
					turtleImg.getIconWidth(), turtleImg.getIconHeight(), canvasOn);
			g2.setTransform(saveAt);
			g2.setComposite(AlphaComposite.SrcAtop.derive(1.f));//transparent
			g.drawString(name, (int)xPos, (int)yPos);
		}
	}
}