import java.util.Scanner;
import java.io.IOException;
import java.io.File;
public class LOGOBasic {
	/*
	 * Move turtle forward/backward with arg0.run() length
	 * @arg0: LOGONode returning value of step size
	 * @isForward: true for forward, flase for backward
	 */
	public void forward(LOGONode arg0, boolean isForward) {
		Object ret = arg0.run();
		if (ret instanceof Double) {
			double step = (isForward) ? ((Double)ret).doubleValue() :
										-((Double)ret).doubleValue();
			System.out.println("step size:" + step);
			//double startX = LOGOPP.canvas.getCurTurtle().getXPos();
			//double startY = LOGOPP.canvas.getCurTurtle().getYPos();
			double directX = Math.cos(Math.toRadians(LOGOPP.canvas.getCurTurtle().getAngleBack()));
			double directY = Math.sin(Math.toRadians(LOGOPP.canvas.getCurTurtle().getAngleBack()));
			LOGOPP.canvas.getCurTurtle().pendingMoves.add("MOVE", directX * step, directY * step);
			LOGOPP.canvas.getCurTurtle().clearPending(false);
			
			
		} else {
			LOGOPP.io.err("Incorrect type of argument of FD. Numeric value expected.");
		}
	}

	/*
	 * Rotate the turtle
	 * @arg0: LOGONode returning value of rotation degree
	 * @isLeft: true for turning left, false for turning right
	 */
	public void turn(LOGONode arg0, boolean isLeft) {
		Object ret = arg0.run();
		if (ret instanceof Double) {
			double turn = (isLeft) ? ((Double)ret).doubleValue() :
									-((Double)ret).doubleValue();
			//LOGOPP.canvas.getCurTurtle().setAngle(LOGOPP.canvas.getCurTurtle().getAngle() - turn);
			LOGOPP.canvas.getCurTurtle().pendingMoves.add("TURN", turn);
			LOGOPP.canvas.getCurTurtle().clearPending(false);
			//System.out.println("basic:turn finished");	
		} else {
			LOGOPP.io.err("Incorrect type of argument of FD. Numeric value expected.");
		}
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
			Object retx = argx.run();
			Object rety = argy.run();
			if (retx instanceof Double && rety instanceof Double) {
				double valuex = ((Double)retx).doubleValue();
				double valuey = ((Double)rety).doubleValue();
				//LOGOPP.canvas.getCurTurtle().teleport(valuex, valuey);
				LOGOPP.canvas.getCurTurtle().pendingMoves.add("TELE", valuex, valuey);
				LOGOPP.canvas.getCurTurtle().clearPending(false);
			} else {

			}
		} else if (setX) {
			Object ret = argx.run();
			if (ret instanceof Double) {
				double value = ((Double)ret).doubleValue();
				LOGOPP.canvas.getCurTurtle().pendingMoves.add("TELE", value, LOGOPP.canvas.getCurTurtle().getYPos());
				LOGOPP.canvas.getCurTurtle().clearPending(false);
				//LOGOPP.canvas.getCurTurtle().teleport(value, LOGOPP.canvas.getCurTurtle().getYPos());
			} else {

			}
		} else { //setY
			Object ret = argy.run();
			if (ret instanceof Double) {
				double value = ((Double)ret).doubleValue();
				LOGOPP.canvas.getCurTurtle().pendingMoves.add("TELE", LOGOPP.canvas.getCurTurtle().getXPos(), value);
				LOGOPP.canvas.getCurTurtle().clearPending(false);
				//LOGOPP.canvas.getCurTurtle().teleport(value, LOGOPP.canvas.getCurTurtle().getYPos());
			} else {

			}
		}
	}
	
	public void origin() {
		LOGOPP.canvas.getCurTurtle().pendingMoves.add("ORIGIN");
		LOGOPP.canvas.getCurTurtle().clearPending(false);
	}

	public void clearScreen() {
		LOGOPP.canvas.clean();
		origin();
	}

	public void print(LOGONode arg) {
		Object ret = arg.run();
		if (ret == null) {
			LOGOPP.io.err("Cannot print the expressions, please check what you want to print");
		} else if (ret instanceof Double) {
			LOGOPP.io.out(((Double)ret).toString());
		} else if (ret instanceof String){
			LOGOPP.io.out((String)ret);
		}
	}

	public void setSpeed(LOGONode arg) {
		Object ret = arg.run();
		if (ret != null && ret instanceof Double) {
			double value = ((Double)ret).doubleValue();
			LOGOPP.canvas.getCurTurtle().setSpeed(value);
		}
	}

	public void saveImage(LOGONode arg) {
		Object ret = arg.run();
		if (ret != null && ret instanceof String) {
			BMPIO.saveBMP((String)ret, LOGOPP.canvas.bitmap, null);
		}
	}

	public void changeColor(LOGONode arg) {
		Object ret = arg.run();
		if (ret != null && ret instanceof String) {
			LOGOPP.canvas.getCurTurtle().changeColor((String)ret);
		}
	}
	
	public void load(LOGONode arg) {
		Object ret = arg.run();
		if (ret != null && ret instanceof String) {
			String filestring = null;
			try {
				File file = new File((String)ret);
				Scanner sc = new Scanner(file);
				filestring = sc.useDelimiter("\\Z").next();
			}
			catch (IOException e) {
				LOGOPP.errorhandler.setRunTime("LOAD", e.toString());
			}
			LOGOPP.execute(filestring);
		}
	}

	/*
	 * Check LOGONode return value's type
	 * In fact, we could check in functions, and let errorhandler
	 * print the error messages, so this function could be ignored
	 * @arg0: target node for checking
	 * @checkclass: an instance of expected class
	 * @return: if correct, return object returned by node
	 * 			if not, return null
	 */
	public Object checkType(LOGONode arg0, Object checkclass) {
		Object var = arg0.run();
		try {
			if (var.getClass().equals(checkclass.getClass()))
				return var;
			System.out.println("Expected type:" + checkclass.getClass().getName() + 
						"but given type:" + var.getClass().getName());
		} catch (Exception e) {
			
		}
		return null;
	} 
}
