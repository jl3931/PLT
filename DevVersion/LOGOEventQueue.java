import java.util.*;

class LOGOEventQueue {

	public double getRestSteps() {return restSteps;}

	private double restSteps = 0.;

	private enum movementType {MOVE, TURN, TELE, ORIGIN};

	class Movements {
		LOGOTurtle turtle;
		movementType type;	//Move 	Turn 	Tele
		double argX;		//restX restA	tarX
		double argY;		//restY n/a 	tarY
		double curX;
		double curY;
		double curAngle;
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
		public void setCurPos(double x, double y, double a) {
			curX = x;
			curY = y;
			curAngle = a;
		}
	}

	ArrayList<Movements> movements = new ArrayList<Movements>();

	public void add(LOGOTurtle tur, String type, double... args) {
		if (type.equals("MOVE") && args.length == 2) {
			Movements move = new Movements(tur);
			move.setMove(args[0], args[1]);
			tur.setXPosBack(tur.xPosBack + args[0]);
			tur.setYPosBack(tur.yPosBack + args[1]);
			movements.add(move);
		}
		else if (type.equals("TURN") && args.length == 1) {
			Movements move = new Movements(tur);
			move.setTurn(args[0]);
			tur.setAngleBack(tur.angleBack - args[0]);
			movements.add(move);
		}
		else if (type.equals("TELE") && args.length == 2) {
			Movements move = new Movements(tur);
			move.setTele(args[0], args[1]);
			tur.setXPosBack(args[0]);
			tur.setYPosBack(args[1]);
			movements.add(move);
		}
		else if (type.equals("ORIGIN") && args.length == 0) {
			Movements move = new Movements(tur);
			move.setOrigin();
			tur.setXPosBack((double)(LOGOPP.canvas.getWidth() / 2));
			tur.setYPosBack((double)(LOGOPP.canvas.getHeight() / 2));
			tur.setAngleBack(LOGOTurtle.INIT_ANGLE);
			movements.add(move);
		}
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
		if (movements.size() == 0)
			return;
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
	}

	public void clearAllPending() {
		for (Movements move : movements) {
			if (move.type == movementType.TELE) {
				move.turtle.teleport(move.argX, move.argY);
			} else if (move.type == movementType.ORIGIN) {
				move.turtle.teleport((double)(LOGOPP.canvas.getWidth() / 2), 
								(double)(LOGOPP.canvas.getHeight() / 2));
				move.turtle.setAngle(LOGOTurtle.INIT_ANGLE);
			} else if (move.type == movementType.MOVE) {
				move.turtle.moveForward(move.argX, move.argY);
			} else if (move.type == movementType.TURN) {
				move.turtle.turnTurtle(move.argX);
			}
		}
		movements.clear();
		restSteps = 0.;
	}

	public boolean move(double step) {
		double rest = step;
		while (movements.size() > 0 && rest > LOGOTurtle.EPSILON) {
			Movements move = movements.get(0);
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