import java.util.Scanner;
import java.io.IOException;
import java.io.File;

/*
 * Functions for basic commands, which are:
 * FORWARD, BACK, LEFT, RIGHT, HOME, LOAD, SPEED, COLOR
 * These commands are not actually executed, but put to event queue
 */
public class LOGOBasic {
	/*
	 * Move turtle forward/backward with arg0.run() length
	 * @arg0: LOGONode returning value of step size
	 * @isForward: true for forward, flase for backward
	 */
	public void forward(LOGONode arg0, boolean isForward) {
		Double ret = runAndCheckDouble(arg0, (isForward?"FORWARD":"BACK"));
		if (LOGOPP.errorhandler.error())
			return;
		double step = (isForward) ? ret.doubleValue() :
									-(ret.doubleValue());
		double directX = Math.cos(Math.toRadians(LOGOPP.canvas.getCurTurtle().getAngleBack()));
		double directY = Math.sin(Math.toRadians(LOGOPP.canvas.getCurTurtle().getAngleBack()));
		LOGOPP.eventQueue.add(LOGOPP.canvas.getCurTurtle(), "MOVE", directX * step, directY * step);
		LOGOPP.eventQueue.clearPending(false);
	}

	/*
	 * Rotate the turtle
	 * @arg0: LOGONode returning value of rotation degree
	 * @isLeft: true for turning left, false for turning right
	 */
	public void turn(LOGONode arg0, boolean isLeft) {
		Double ret = runAndCheckDouble(arg0, (isLeft?"TURN LEFT":"TURN RIGHT"));
		if (LOGOPP.errorhandler.error())
			return;
		double turn = (isLeft) ? ret.doubleValue() :
								-(ret.doubleValue());
		LOGOPP.eventQueue.add(LOGOPP.canvas.getCurTurtle(), "TURN", turn);
		LOGOPP.eventQueue.clearPending(false);
	}

	public void front() {
		double turn = 0.;
		double angle = LOGOPP.canvas.getCurTurtle().getAngleBack();
		if (angle > 90. && angle < 270.) {
			turn = angle - 270.;
		}
		else if (angle > 270.) {
			turn = angle - 270.;
		}
		else if (angle <= 90.){
			turn  = angle + 90.;
		}
		LOGOPP.eventQueue.add(LOGOPP.canvas.getCurTurtle(), "TURN", turn);
		LOGOPP.eventQueue.clearPending(false);
	}

	/*
	 * Directly move target to a certain place
	 * @arg0: LOGONode returning coordinate(s) of target position
	 * @setX, @setY: true flase for only setting X pos
	 * 				 flase true for only setting Y pos
	 * 				 true true for setting both, arg0 should be a pair
	 */
	public void teleport(LOGONode argx, LOGONode argy, boolean setX, boolean setY) {
		if (!setX && !setY)
			return;
		if (setX && setY) {
			Double retx = runAndCheckDouble(argx, "SETXY");
			if (LOGOPP.errorhandler.error())
				return;
			Double rety = runAndCheckDouble(argy, "SETXY");
			if (LOGOPP.errorhandler.error())
				return;
			double valuex = retx.doubleValue();
			double valuey = rety.doubleValue();
			LOGOPP.eventQueue.add(LOGOPP.canvas.getCurTurtle(), "TELE", valuex, valuey);
			LOGOPP.eventQueue.clearPending(false);
		}
		else if (setX) {
			Double ret = runAndCheckDouble(argx, "SETX");
			if (LOGOPP.errorhandler.error())
				return;
			double value = ret.doubleValue();
			LOGOPP.eventQueue.add(LOGOPP.canvas.getCurTurtle(), "TELE", value, LOGOPP.canvas.getCurTurtle().getYPos());
			LOGOPP.eventQueue.clearPending(false);
		}
		else { //setY
			Double ret = runAndCheckDouble(argy, "SETY");
			if (LOGOPP.errorhandler.error())
				return;
			double value = ret.doubleValue();
			LOGOPP.eventQueue.add(LOGOPP.canvas.getCurTurtle(), "TELE", LOGOPP.canvas.getCurTurtle().getXPos(), value);
			LOGOPP.eventQueue.clearPending(false);
		}
	}
	
	/*
	 * Put a turtle to origin
	 * @tur: target turtle
	 */
	public void origin(LOGOTurtle tur) {
		LOGOPP.eventQueue.add(tur, "ORIGIN");
		LOGOPP.eventQueue.clearPending(false);
	}

	/*
	 * Print out an expression/string
	 * @arg: LOGONode containing the content to print
	 */
	public void print(LOGONode arg) {
		String ret = runAndCheckString(arg, "PRINT", false);
		if (LOGOPP.errorhandler.error())
			return;
		LOGOPP.io.out(ret);
	}

	public void setSpeed(LOGONode arg) {
		Double ret = runAndCheckDouble(arg, "SET SPEED");
		if (LOGOPP.errorhandler.error())
			return;
		double value = ret.doubleValue();
		LOGOPP.eventQueue.add(LOGOPP.canvas.getCurTurtle(), "SPEED", value);
		LOGOPP.eventQueue.clearPending(false);
	}

	public void saveImage(LOGONode arg) {
		String ret = runAndCheckString(arg, "SAVE IMAGE", true);
		if (LOGOPP.errorhandler.error())
			return;
		BMPIO.saveBMP(ret, LOGOPP.canvas.bitmap, null);
	}

	public void changeColor(LOGONode arg) {
		String ret = runAndCheckString(arg, "COLOR", true);
		if (LOGOPP.errorhandler.error())
			return;
		LOGOPP.eventQueue.add(LOGOPP.canvas.getCurTurtle(), "COLOR", ret);
		LOGOPP.eventQueue.clearPending(false);
	}
	
	public void load(LOGONode arg) {
		String ret = runAndCheckString(arg, "LOAD", true);
		if (LOGOPP.errorhandler.error())
			return;
		String filestring = null;
		try {
			File file = new File(ret);
			Scanner sc = new Scanner(file);
			filestring = sc.useDelimiter("\\Z").next();
			LOGOPP.execute(filestring);
		}
		catch (IOException e) {
			LOGOPP.errorhandler.setRunTime("LOAD", e.toString());
		}
	}

	public void changeTurtle(LOGONode arg) {
		String ret = runAndCheckString(arg, "TURTLE", true);
		if (LOGOPP.errorhandler.error())
			return;
		LOGOPP.canvas.changeToTurtle(ret);
		if (LOGOPP.errorhandler.error())
			return;
		LOGOPP.eventQueue.add(LOGOPP.canvas.getCurTurtle(), "TURTLE");
		LOGOPP.eventQueue.clearPending(false);
	}

	private static Double runAndCheckDouble(LOGONode node, String id) {
		if (LOGOPP.errorhandler.error())
			return null;
		if (LOGOPP.isInterrupted) {
			LOGOPP.errorhandler.setRunTime(id, "Execution interrupted here.");
			return null;
		}
		if (node == null) {
			LOGOPP.errorhandler.setRunTime(id, "no argument");
			return null;
		}
		Object nodeVal = node.run();
		if (LOGOPP.errorhandler.error())
			return null;
		if (nodeVal == null) {
			LOGOPP.errorhandler.setRunTime(id, "null argument");
			return null;
		}
		if (!(nodeVal instanceof Double)) {
			LOGOPP.errorhandler.setRunTime(id, "wrong argument type");
			return null;
		}
		return (Double) nodeVal;
	}

	private static String runAndCheckString(LOGONode node, String id, boolean onlyString) {
		if (LOGOPP.errorhandler.error())
			return null;
		if (node == null) {
			LOGOPP.errorhandler.setRunTime(id, "no argument");
			return null;
		}
		if (LOGOPP.isInterrupted) {
			LOGOPP.errorhandler.setRunTime(id, "Execution interrupted here.");
			return null;
		}
		Object nodeVal = node.run();
		if (LOGOPP.errorhandler.error())
			return null;
		if (nodeVal == null) {
			LOGOPP.errorhandler.setRunTime(id, "null argument");
			return null;
		}
		boolean isString = (nodeVal instanceof String);
		boolean isDouble = (nodeVal instanceof Double);
		if (!isString && !isDouble || !isString && onlyString) {
			LOGOPP.errorhandler.setRunTime(id, "wrong argument type");
			return null;
		}
		if (isDouble) {
			return ((Double)nodeVal).toString();
		}
		return (String) nodeVal;
	}
	
}
