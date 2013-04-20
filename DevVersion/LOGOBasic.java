
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
			double startX = LOGOPP.canvas.getCurTurtle().getXPos();
			double startY = LOGOPP.canvas.getCurTurtle().getYPos();
			double directX = Math.cos(Math.toRadians(LOGOPP.canvas.getCurTurtle().getAngle()));
			double directY = Math.sin(Math.toRadians(LOGOPP.canvas.getCurTurtle().getAngle()));
			moveTurtle(startX + directX * step, startY + directY * step, 
							LOGOPP.canvas.getCurTurtle().getPenDown());
		} else {
			//TODO: errorhandler
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
			LOGOPP.canvas.getCurTurtle().setAngle(LOGOPP.canvas.getCurTurtle().getAngle() - turn);
			System.out.println("basic:turn finished");	
		} else {
			//TODO:errorhandler
		}
	}

	/*
	 * Move turtle from current place to target place
	 * TODO: wrap or fence
	 * @endX: target X pos
	 * @endY: target Y pos
	 * @isDraw: true for pendown, false for penup
	 */
	private void moveTurtle(double endX, double endY, boolean isDraw) {
		if (isDraw) {
			double startX = LOGOPP.canvas.getCurTurtle().getXPos();
			double startY = LOGOPP.canvas.getCurTurtle().getYPos();
			double length = Math.sqrt((endX - startX) * (endX - startX) +
										(endY - startY) * (endY - startY));
			double deltaX = (endX - startX) / length;
			double deltaY = (endY - startY) / length;
			int count = (int)length;
			for (int cnt = 0; cnt < count; cnt++) {
				LOGOPP.canvas.getCurTurtle().paintPoint((int)(startX + cnt * deltaX),
										(int)(startY + cnt * deltaY));
				LOGOPP.canvas.getCurTurtle().setXPos(startX + cnt * deltaX);
				LOGOPP.canvas.getCurTurtle().setYPos(startY + cnt * deltaY);
				double speed = 0.;
				while (speed < LOGOTurtle.SPEED_ITR_MAX) {
					LOGOPP.canvas.repaint();
					speed += LOGOPP.canvas.getCurTurtle().getSpeed();
				}
			}
			LOGOPP.canvas.getCurTurtle().paintPoint((int)endX, (int)endY);
		}
		LOGOPP.canvas.getCurTurtle().setXPos(endX);
		LOGOPP.canvas.getCurTurtle().setYPos(endY);
		LOGOPP.canvas.repaint();
	}

	/*
	 * Directly move target to a certain place
	 * @arg0: LOGONode returning coordinate(s) of target position
	 * @setX, @setY: true flase for only setting X pos
	 * 				 flase true for only setting Y pos
	 * 				 true true for setting both, arg0 should be a pair
	 */
	public void teleport(LOGONode arg0, boolean setX, boolean setY) {
		if (!setX && !setY)
			return;
		if (setX && setY);
			//TODO: handle pair
		else { //setX or setY
			Object ret = arg0.run();
			if (ret instanceof Double) {
				double value = ((Double)ret).doubleValue();
				if (setX)
					moveTurtle(value, LOGOPP.canvas.getCurTurtle().getYPos(), false);
				else //setY
					moveTurtle(LOGOPP.canvas.getCurTurtle().getXPos(), value, false);
			} else {
				//TODO:error handling
			}
		}
	}
	
	public void origin() {
		moveTurtle((double)LOGOPP.canvas.getWidth() / 2, 
					(double)LOGOPP.canvas.getHeight() / 2, false);
		LOGOPP.canvas.getCurTurtle().setAngle(LOGOTurtle.INIT_ANGLE);
		LOGOPP.canvas.repaint();
	}

	public void clearScreen() {
		LOGOPP.canvas.clean();
		origin();
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
