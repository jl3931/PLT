import java.util.*;

class LOGOEventQueue {
	private final static double EPSILON = 0.001;
	public double getRestSteps() {return restSteps;}

	private double restSteps = 0.;

	private enum movementType {MOVE, TURN, TELE, ORIGIN, SPEED, COLOR, DISPLAY, DRAW, WRAP, TURTLE};

	class Events {
		LOGOTurtle turtle = null;
		double rest = 0.;
		public Events(LOGOTurtle tur) {turtle = tur;}
		public boolean isFinished() {return rest < EPSILON;}
		public double execute(double step) {return 0.;}
	}

	class MoveEvent extends Events {
		double argX = (double)(LOGOPP.canvas.getWidth() / 2);
		double argY = (double)(LOGOPP.canvas.getHeight() / 2);
		public MoveEvent(LOGOTurtle tur, double x, double y) {
			super(tur);
			argX = x;
			argY = y;
			rest = Math.sqrt(x * x + y * y);
			restSteps += rest;
		}
		public double execute(double step) {
			double dis = Math.sqrt(argX * argX + argY * argY);
			if (turtle.moveForward(argX, argY, step)) { //clear this move
				rest = 0.;
				return dis;
			}
			else {
				argX -= step * argX / dis;
				argY -= step * argY / dis;
				rest -= step;
				return step;
			}
		}
	}

	class TurnEvent extends Events {
		double argA = LOGOTurtle.INIT_ANGLE;
		public TurnEvent(LOGOTurtle tur, double a) {
			super(tur);
			argA = a;
			rest = Math.abs(a) / LOGOTurtle.ANGLE_RATIO;
			restSteps += rest;
		}
		public double execute(double step) {
			if (turtle.turnTurtle(argA, step)) {//clear this move
				rest = 0.;
				return Math.abs(argA) / LOGOTurtle.ANGLE_RATIO;
			}
			else {
				if (argA > 0)
					argA -= step * LOGOTurtle.ANGLE_RATIO;
				else
					argA += step * LOGOTurtle.ANGLE_RATIO;
				rest -= step;
				return step;
			}
		}
	}

	class TeleEvent extends Events {
		double argX;
		double argY;
		public TeleEvent (LOGOTurtle tur, double x, double y) {
			super(tur);
			turtle = tur;
			argX = x;
			argY = y;
			rest = LOGOTurtle.MAX_SPEED;
			restSteps += rest;
		}
		public double execute(double step) {
			turtle.teleport(argX, argY);
			rest = 0.;
			return LOGOTurtle.MAX_SPEED;
		}
	}

	class OriginEvent extends Events {
		public OriginEvent(LOGOTurtle tur) {
			super(tur);
			rest = LOGOTurtle.MAX_SPEED;
			restSteps += rest;
		}
		public double execute(double step) {
			turtle.teleport((double)(LOGOPP.canvas.getWidth() / 2), 
								(double)(LOGOPP.canvas.getHeight() / 2));
			turtle.setAngle(LOGOTurtle.INIT_ANGLE);
			rest = 0.;
			return LOGOTurtle.MAX_SPEED;
		}
	}

	class SpeedEvent extends Events {
		double argS = LOGOTurtle.INIT_SPEED;
		public SpeedEvent(LOGOTurtle tur, double s) {
			super(tur);
			argS = s;
			rest = 0.;
			restSteps += rest;
		}
		public double execute(double step) {
			turtle.setSpeed(argS);
			rest = 0.;
			return 0.;
		}
	}

	class ColorEvent extends Events {
		String argC = "Black";
		public ColorEvent(LOGOTurtle tur, String c) {
			super(tur);
			argC = c;
			rest = 0.;
			restSteps += rest;
		}
		public double execute(double step) {
			turtle.changeColor(argC);
			rest = 0.;
			return 0.;
		}
	}

	class ColorsEvent extends Events {
		int argC = 0;
		public ColorsEvent(LOGOTurtle tur, int c) {
			super(tur);
			argC = c;
			rest = 0.;
			restSteps += rest;
		}
		public double execute(double step) {
			turtle.setColor(argC);
			rest = 0.;
			return 0.;
		}
	}

	class FillEvent extends Events {
		public FillEvent(LOGOTurtle tur) {
			super(tur);
			rest = LOGOTurtle.MAX_SPEED;
			restSteps += rest;
		}
		public double execute(double step) {
			turtle.fill();
			rest = 0.;
			return LOGOTurtle.MAX_SPEED;
		}
	}

	class DisplayEvent extends Events {
		boolean argB = true;
		public DisplayEvent(LOGOTurtle tur, boolean show) {
			super(tur);
			argB = show;
			rest = LOGOTurtle.MAX_SPEED;
			restSteps += rest;
		}
		public double execute(double step) {
			turtle.setShowTurtle(argB);
			rest = 0.;
			return LOGOTurtle.MAX_SPEED;
		}
	}

	class DrawEvent extends Events {
		boolean argB = true;
		public DrawEvent(LOGOTurtle tur, boolean draw) {
			super(tur);
			argB = draw;
			rest = LOGOTurtle.MAX_SPEED;
			restSteps += rest;
		}
		public double execute(double step) {
			turtle.setPenDown(argB);
			rest = 0.;
			return LOGOTurtle.MAX_SPEED;
		}
	}

	class WrapEvent extends Events {
		boolean argB = true;
		public WrapEvent(LOGOTurtle tur, boolean wrap) {
			super(tur);
			argB = wrap;
			rest = 0.;
			restSteps += rest;
		}
		public double execute(double step) {
			LOGOPP.canvas.wrap = argB;
			rest = 0.; 
			return 0.;
		}
	}

	class TurtleEvent extends Events {
		public TurtleEvent(LOGOTurtle tur) {
			super(tur);
			rest = 0.;
			restSteps += rest;
		}
		public double execute(double step) {
			rest = 0.;
			return 0.;
		}
	}

	class ResetEvent extends Events {
		boolean argB = true;
		public ResetEvent(LOGOTurtle tur, boolean show) {
			super(tur);
			argB = show;
			rest = 0.;
			restSteps += rest;
		}
		public double execute(double step) {
			turtle.reset(argB);
			rest = 0.;
			return 0.;
		}
	}

	Queue<Events> queue = new LinkedList<Events>();

	public void add(LOGOTurtle tur, String type, double... args) {
		if (null == tur || null == type)
			return;
		Events event;
		if (type.equals("MOVE") && args.length == 2) {
			event = new MoveEvent(tur, args[0], args[1]);
			tur.setXPosBack(tur.xPosBack + args[0]);
			tur.setYPosBack(tur.yPosBack + args[1]);
		}
		else if (type.equals("TURN") && args.length == 1) {
			event = new TurnEvent(tur, args[0]);
			tur.setAngleBack(tur.angleBack - args[0]);
		}
		else if (type.equals("TELE") && args.length == 2) {
			event = new TeleEvent(tur, args[0], args[1]);
			tur.setXPosBack(args[0]);
			tur.setYPosBack(args[1]);
		}
		else if (type.equals("ORIGIN") && args.length == 0) {
			event = new OriginEvent(tur);
			tur.setXPosBack((double)(LOGOPP.canvas.getWidth() / 2));
			tur.setYPosBack((double)(LOGOPP.canvas.getHeight() / 2));
			tur.setAngleBack(LOGOTurtle.INIT_ANGLE);
		}
		else if (type.equals("SPEED") && args.length == 1) {
			event = new SpeedEvent(tur, args[0]);
			tur.setSpeedBack(args[0]);
		}
		else if (type.equals("TURTLE") && args.length == 0) {
			event = new TurtleEvent(tur);
		}
		else if (type.equals("FILL") && args.length == 0) {
			event = new FillEvent(tur);
		}
		else {
			LOGOPP.io.debug("Wrong arg type for event queue.");
			return;
		}
		queue.offer(event);
	}
	public void add(LOGOTurtle tur, String type, int arg) {
		if (null == tur || null == type)
			return;
		if (type.equals("COLORS")) {
			Events event = new ColorsEvent(tur, arg);
			queue.offer(event);
		}
		else
			LOGOPP.io.debug("Wrong arg type for event queue.");
	}

	public void add(LOGOTurtle tur, String type, String arg) {
		if (null == tur || null == type || arg == null)
			return;
		if (type.equals("COLOR")) {
			Events event = new ColorEvent(tur, arg);
			queue.offer(event);
		}
		else
			LOGOPP.io.debug("Wrong arg type for event queue.");
	}

	public void add(LOGOTurtle tur, String type, boolean arg) {
		if (null == tur || null == type)
			return;
		Events event;
		if (type.equals("DISPLAY"))
			event = new DisplayEvent(tur, arg);
		else if (type.equals("DRAW"))
			event = new DrawEvent(tur, arg);
		else if (type.equals("WRAP"))
			event = new WrapEvent(tur, arg);
		else if (type.equals("RESET"))
			event = new ResetEvent(tur, arg);
		else {
			LOGOPP.io.debug("Wrong arg type for event queue.");
			return;
		}
		queue.offer(event);
	}

	public void clearPending(boolean lastTime) {
		if (queue.size() == 0)
			return;
		if ((restSteps >= queue.peek().turtle.getSpeed() || lastTime)
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
		LOGOPP.io.showState();
	}

	public void tick() {
		if (LOGOPP.errorhandler.error() || queue.size() == 0
			|| move(queue.peek().turtle.getSpeed())) {
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
    	LOGOPP.io.showState();
	}

	public void clearAllPending() {
		for (Events event : queue) {
			if (LOGOPP.errorhandler.error())
				break;
			event.execute(Double.MAX_VALUE);
		}
		queue.clear();
		restSteps = 0.;
		LOGOPP.io.showState();
	}

	public boolean move(double step) {
		double rest = step;
		while (queue.size() > 0 && rest > LOGOTurtle.EPSILON) {
			Events event = queue.peek();
			LOGOPP.canvas.changeToTurtle(event.turtle.getName());
			rest -= event.execute(rest);
			if (event.isFinished())
				queue.poll();
			if (LOGOPP.hasAnimation)
				LOGOPP.canvas.repaint();
		}
		restSteps -= step - rest;
		if (queue.size() == 0) {
			restSteps = 0.;
			return true;
		}
		return false;
	}

	public void interrupt() {
		restSteps = 0.;
		queue.clear();
		LOGOPP.io.showState();
	}
}