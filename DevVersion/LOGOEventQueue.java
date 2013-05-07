import java.util.*;

class LOGOEventQueue {

	public double getRestSteps() {return restSteps;}

	private double restSteps = 0.;

	private enum movementType {MOVE, TURN, TELE, ORIGIN, SPEED, COLOR, DISPLAY, DRAW, WRAP, TURTLE};

	class Movements {
		LOGOTurtle turtle;
		movementType type;
		double argX = (double)(LOGOPP.canvas.getWidth() / 2);
		double argY = (double)(LOGOPP.canvas.getHeight() / 2);
		String argS = "";
		boolean argB = true;
		double curAngle = LOGOTurtle.INIT_ANGLE;
		public Movements(LOGOTurtle tur) {
			turtle = tur;
		}
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
			restSteps += LOGOTurtle.MAX_SPEED;
		}
		public void setOrigin() {
			type = movementType.ORIGIN;
			restSteps += LOGOTurtle.MAX_SPEED;
		}
		public void setSpeed(double s) {
			type = movementType.SPEED;
			argX = s;
			restSteps += 0.;
		}
		public void setColor(String color) {
			type = movementType.COLOR;
			argS = color;
			restSteps += 0.;
		}
		public void setDisplay(boolean show) {
			type = movementType.DISPLAY;
			argB = show;
			restSteps += LOGOTurtle.MAX_SPEED;
		}
		public void setDraw(boolean draw) {
			type = movementType.DRAW;
			argB = draw;
			restSteps += LOGOTurtle.MAX_SPEED;
		}
		public void setWrap(boolean wrap) {
			type = movementType.WRAP;
			argB = wrap;
			restSteps += LOGOTurtle.MAX_SPEED;
		}
		public void setTurtle() {
			type = movementType.TURTLE;
			restSteps += 0.;
		}
	}

	ArrayList<Movements> movements = new ArrayList<Movements>();

	public void add(LOGOTurtle tur, String type, double... args) {
		if (null == tur || null == type)
			return;
		Movements move = new Movements(tur);
		if (type.equals("MOVE") && args.length == 2) {
			move.setMove(args[0], args[1]);
			tur.setXPosBack(tur.xPosBack + args[0]);
			tur.setYPosBack(tur.yPosBack + args[1]);
		}
		else if (type.equals("TURN") && args.length == 1) {
			move.setTurn(args[0]);
			tur.setAngleBack(tur.angleBack - args[0]);
		}
		else if (type.equals("TELE") && args.length == 2) {
			move.setTele(args[0], args[1]);
			tur.setXPosBack(args[0]);
			tur.setYPosBack(args[1]);
		}
		else if (type.equals("ORIGIN") && args.length == 0) {
			move.setOrigin();
			tur.setXPosBack((double)(LOGOPP.canvas.getWidth() / 2));
			tur.setYPosBack((double)(LOGOPP.canvas.getHeight() / 2));
			tur.setAngleBack(LOGOTurtle.INIT_ANGLE);
		}
		else if (type.equals("SPEED") && args.length == 1) {
			move.setSpeed(args[0]);
		}
		else if (type.equals("TURTLE") && args.length == 0) {
			move.setTurtle();
		}
		else {
			LOGOPP.io.debug("Wrong arg type for event queue.");
			return;
		}
		movements.add(move);
	}

	public void add(LOGOTurtle tur, String type, String arg) {
		if (null == tur || null == type || arg == null)
			return;
		if (type.equals("COLOR")) {
			Movements move = new Movements(tur);
			move.setColor(arg);
			movements.add(move);
		}
		else
			LOGOPP.io.debug("Wrong arg type for event queue.");
	}

	public void add(LOGOTurtle tur, String type, boolean arg) {
		if (null == tur || null == type)
			return;
		Movements move = new Movements(tur);
		if (type.equals("DISPLAY")) {
			move.setDisplay(arg);
		}
		else if (type.equals("DRAW")) {
			move.setDraw(arg);
		}
		else if (type.equals("WRAP")) {
			move.setWrap(arg);
		}
		else {
			LOGOPP.io.debug("Wrong arg type for event queue.");
			return;
		}
		movements.add(move);
	}

	public void clearPending(boolean lastTime) {
		if (movements.size() == 0)
			return;
		if ((restSteps >= movements.get(0).turtle.getSpeed() || lastTime)
			&& LOGOPP.hasAnimation) {
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

	public void tick() {
		if (LOGOPP.errorhandler.error() || movements.size() == 0) {
			LOGOPP.timer.stop();
			synchronized(LOGOPP.timer){
				try {     
		            LOGOPP.timer.notify();  
		        }
		        catch (Exception e) {     
		        }
	    	}
			return;
		}
		double speed = movements.get(0).turtle.getSpeed();
		if (move(speed)) {
			LOGOPP.timer.stop();
			synchronized(LOGOPP.timer){
				try {     
		            LOGOPP.timer.notify();  
		        }
		        catch (Exception e) {     
		        }
	    	}
    	}
    	LOGOPP.io.showState();
	}

	public void clearAllPending() {
		for (Movements move : movements) {
			if (LOGOPP.errorhandler.error())
				break;
			if (move.type == movementType.TELE) {
				move.turtle.teleport(move.argX, move.argY);
			}
			else if (move.type == movementType.ORIGIN) {
				move.turtle.teleport((double)(LOGOPP.canvas.getWidth() / 2), 
								(double)(LOGOPP.canvas.getHeight() / 2));
				move.turtle.setAngle(LOGOTurtle.INIT_ANGLE);
			}
			else if (move.type == movementType.MOVE) {
				move.turtle.moveForward(move.argX, move.argY);
			}
			else if (move.type == movementType.TURN) {
				move.turtle.turnTurtle(move.argX);
			}
			else if (move.type == movementType.SPEED) {
				move.turtle.setSpeed(move.argX);
			}
			else if (move.type == movementType.COLOR) {
				move.turtle.changeColor(move.argS);
			}
			else if (move.type == movementType.DISPLAY) {
				move.turtle.setShowTurtle(move.argB);
			}
			else if (move.type == movementType.DRAW) {
				move.turtle.setPenDown(move.argB);
			}
			else if (move.type == movementType.WRAP) {
				LOGOPP.canvas.wrap = move.argB;
			}
			else if (move.type == movementType.TURTLE) {
				//do nothing here
			}
		}
		movements.clear();
		restSteps = 0.;
	}

	public boolean move(double step) {
		double rest = step;
		while (movements.size() > 0 && rest > LOGOTurtle.EPSILON) {
			Movements move = movements.get(0);
			LOGOPP.canvas.changeToTurtle(move.turtle.getName());
			if (move.type == movementType.TELE) {
				move.turtle.teleport(move.argX, move.argY);
				rest -= LOGOTurtle.MAX_SPEED;
				movements.remove(0);
			} else if (move.type == movementType.ORIGIN) {
				move.turtle.teleport((double)(LOGOPP.canvas.getWidth() / 2), 
								(double)(LOGOPP.canvas.getHeight() / 2));
				move.turtle.setAngle(LOGOTurtle.INIT_ANGLE);
				rest -= LOGOTurtle.MAX_SPEED;
				movements.remove(0);
			} else if (move.type == movementType.MOVE) {
				if (move.turtle.moveForward(move.argX, move.argY)) { //clear this move
					double dis = Math.sqrt(move.argX * move.argX + move.argY * move.argY);
					rest -= dis;
					movements.remove(0);
				}
				else {
					double dis = Math.sqrt(move.argX * move.argX + move.argY * move.argY);
					move.argX -= rest * move.argX / dis;
					move.argY -= rest * move.argY / dis;
					rest = 0.;
				}
			} else if (move.type == movementType.TURN) {
				if (move.turtle.turnTurtle(move.argX)) {//clear this move
					rest -= Math.abs(move.argX) / LOGOTurtle.ANGLE_RATIO;
					movements.remove(0);
				}
				else {
					rest = 0.;
					if (move.argX > 0)
						move.argX -= move.turtle.getSpeed() * LOGOTurtle.ANGLE_RATIO;
					else
						move.argX += move.turtle.getSpeed() * LOGOTurtle.ANGLE_RATIO;
				}
			}
			else if (move.type == movementType.SPEED) {
				move.turtle.setSpeed(move.argX);
				rest -= 0.;
				movements.remove(0);
			}
			else if (move.type == movementType.COLOR) {
				move.turtle.changeColor(move.argS);
				rest -= 0.;
				movements.remove(0);
			}
			else if (move.type == movementType.DISPLAY) {
				move.turtle.setShowTurtle(move.argB);
				rest -= LOGOTurtle.MAX_SPEED;
				movements.remove(0);
			}
			else if (move.type == movementType.DRAW) {
				move.turtle.setPenDown(move.argB);
				rest -= LOGOTurtle.MAX_SPEED;
				movements.remove(0);
			}
			else if (move.type == movementType.WRAP) {
				LOGOPP.canvas.wrap = move.argB;
				rest -= LOGOTurtle.MAX_SPEED;
				movements.remove(0);
			}
			else if (move.type == movementType.TURTLE) {
				rest -= 0.;
				movements.remove(0);
			}
		}
		restSteps -= step - rest;
		if (movements.size() == 0) {
			restSteps = 0.;
			return true;
		}
		return false;
	}

	public void interrupt() {
		restSteps = 0.;
		movements.clear();
	}
}