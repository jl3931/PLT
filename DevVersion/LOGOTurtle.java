import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class LOGOTurtle{
	public static final double EPSILON = 0.001;
	public static final double INIT_ANGLE = -90.;
	public static final double CIRCLE_DEGREE = 360.;
	public static final double ANGLE_RATIO = 1.;
	private double xPos        = 0;
	private double yPos        = 0;
	private double angle       = INIT_ANGLE;
	private double speed       = 10.;
	private boolean penDown    = true;
	private boolean showTurtle = true;
	private int[] color = new int[] {0, 0, 255}; //{R,G,B}
	private String name;
	public PendingMovements pendingMoves;
	public LOGOCanvas canvasOn;
	//private static Image turtleImg = Toolkit.getDefaultToolkit().getImage("logo_turtle.png");
	private static ImageIcon turtleImg = new ImageIcon("logo_turtle_color.png");
	/*
	 * Constructor
	 * @id: name
	 */
	LOGOTurtle(String id) {
		name = id;
		pendingMoves = new PendingMovements(this);
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

	public void move() {
		if (pendingMoves.clearPending(speed)) {
			LOGOPP.timer.stop();
			synchronized(LOGOPP.timer){
				try {     
		            LOGOPP.timer.notify();  
		        }
		        catch (Exception e) {     
		        }
	    	}
    	}
	}

	public void clearPending(boolean lastTime) {
		if ((pendingMoves.getRestSteps() >= speed || lastTime) && LOGOPP.hasAnimation) {
			LOGOPP.timer.start();
			synchronized(LOGOPP.timer){
				try {     
                    LOGOPP.timer.wait();  
                } 
                catch (Exception e) {         
                }  
			}
		}
	}

	public void clearAllPending() {
		pendingMoves.clearAllPending();
	}

	public boolean moveForward(double restXPos, double restYPos) {
		double dis = Math.sqrt(restXPos * restXPos + restYPos * restYPos);
		if (dis <= speed) {
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
		if (Math.abs(deltaAngle) > speed * ANGLE_RATIO) {
			if (deltaAngle > 0)
				setAngle(angle - speed * ANGLE_RATIO);
			else
				setAngle(angle + speed * ANGLE_RATIO);
			canvasOn.repaint();
			return false;
		} else {
			setAngle(angle - deltaAngle);
			if (LOGOPP.hasAnimation)
				canvasOn.repaint();
			return true;
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

class PendingMovements {
	LOGOTurtle turtle;
	public PendingMovements(LOGOTurtle tur) {
		turtle = tur;
		restSteps = 0.;
	}

	public double getRestSteps() {return restSteps;}

	private double restSteps;

	private enum movementType {MOVE, TURN, TELE};

	class Movements {
		movementType type;	//Move 	Turn 	Tele
		double argX;		//restX restA	tarX
		double argY;		//restY n/a 	tarY
		double curX;
		double curY;
		double curAngle;
		public void setMove(double x, double y) {
			type = movementType.MOVE;
			argX = x;
			argY = y;
			restSteps += Math.sqrt(x * x + y * y);
		}
		public void setTurn(double a) {
			type = movementType.TURN;
			argX = a;
			
			restSteps += Math.abs(a) / LOGOTurtle.ANGLE_RATIO;
		}
		public void setTele(double x, double y) {
			type = movementType.TELE;
			argX = x;
			argY = y;
			restSteps += turtle.getSpeed();
		}
		public void setCurPos(double x, double y, double a) {
			curX = x;
			curY = y;
			curAngle = a;
		}
	}

	ArrayList<Movements> movements = new ArrayList<Movements>();

	public void add(String type, double... args) {
		if (type.equals("MOVE") && args.length == 2) {
			Movements move = new Movements();
			move.setMove(args[0], args[1]);
			move.setCurPos(turtle.getXPos(), turtle.getYPos(), turtle.getAngle());
			turtle.setXPos(turtle.getXPos() + args[0]);
			turtle.setYPos(turtle.getYPos() + args[1]);
			movements.add(move);
		}
		else if (type.equals("TURN") && args.length == 1) {
			Movements move = new Movements();
			move.setTurn(args[0]);
			move.setCurPos(turtle.getXPos(), turtle.getYPos(), turtle.getAngle());
			turtle.setAngle(turtle.getAngle() - args[0]);
			movements.add(move);

		}
		else if (type.equals("TELE") && args.length == 2) {
			Movements move = new Movements();
			move.setTele(args[0], args[1]);
			move.setCurPos(turtle.getXPos(), turtle.getYPos(), turtle.getAngle());
			movements.add(move);
			turtle.setXPos(args[0]);
			turtle.setYPos(args[1]);
		}
	}

	public void clearAllPending() {
		clearPending(restSteps);
		restSteps = 0.;
	}

	public boolean clearPending(double step) {
		double rest = step;
		while (movements.size() > 0 && rest > LOGOTurtle.EPSILON) {
			Movements move = movements.get(0);
			turtle.setXPos(move.curX);
			turtle.setYPos(move.curY);
			turtle.setAngle(move.curAngle);
			if (move.type == movementType.TELE) {
				turtle.teleport(move.argX, move.argY);
				rest -= turtle.getSpeed();
				movements.remove(0);
			} else if (move.type == movementType.MOVE) {
				if (turtle.moveForward(move.argX, move.argY)) { //clear this move
					double dis = Math.sqrt(move.argX * move.argX + move.argY * move.argY);
					rest -= dis;
					movements.remove(0);
				}
				else {
					double dis = Math.sqrt(move.argX * move.argX + move.argY * move.argY);
					move.argX -= rest * move.argX / dis;
					move.argY -= rest * move.argY / dis;
					rest = 0.;
					move.curX = turtle.getXPos();
					move.curY = turtle.getYPos();
				}
			} else if (move.type == movementType.TURN) {
				if (turtle.turnTurtle(move.argX)) {//clear this move
					rest -= Math.abs(move.argX) / LOGOTurtle.ANGLE_RATIO;
					movements.remove(0);
				}
				else {
					rest = 0.;
					if (move.argX > 0)
						move.argX -= turtle.getSpeed() * LOGOTurtle.ANGLE_RATIO;
					else
						move.argX += turtle.getSpeed() * LOGOTurtle.ANGLE_RATIO;
					move.curAngle = turtle.getAngle();
				}
			}
		}
		restSteps -= step - rest;
		if (movements.size() == 0) {
			restSteps = 0.;
			return true;
		}
		return false;
	}

}