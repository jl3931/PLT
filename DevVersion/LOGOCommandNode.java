import java.util.*;

public class LOGOCommandNode extends LOGONode {
	public LOGOCommandNode(String id) {
		super(id);
		System.out.println("new command node no arg");
	}

	public LOGOCommandNode(String id, LOGONode... args) {
		super(id, args);
		System.out.println("new command node with arg");
	}

	public Object run() {
		if (LOGOPP.errorhandler.error())
			return null;
		if (children.size() != findCommand(id)) {
			if (findCommand(id) == -1)
				LOGOPP.io.err("Cannot found command:" + id);
			else
				LOGOPP.io.err("Wrong number of arguments of command " + id + "\n"
							 + "Expect to get " + findCommand(id)
							 + ", but get " + children.size());
		} else {
			if (children.size() == 0) {
			// commands with 0 arguments
				if (id.equals("ORIGIN"))
					LOGOPP.basic.origin();
				else if (id.equals("CLEARSCREEN"))
					LOGOPP.basic.clearScreen();
				else if (id.equals("SHOWTURTLE"))
					LOGOPP.canvas.getCurTurtle().setShowTurtle(true);
				else if (id.equals("HIDETURTLE"))
					LOGOPP.canvas.getCurTurtle().setShowTurtle(false);
				else if (id.equals("WRAP"))
					LOGOPP.canvas.wrap = true;
				else if (id.equals("FENCE"))
					LOGOPP.canvas.wrap = false;
				else if (id.equals("PENUP"))
					LOGOPP.canvas.getCurTurtle().setPenDown(false);
				else if (id.equals("PENDOWN"))
					LOGOPP.canvas.getCurTurtle().setPenDown(true);

			} else if (children.size() == 1) {
				// command with 1 arguments
				if (id.equals("FORWARD"))
					LOGOPP.basic.forward(children.get(0), true);
				else if (id.equals("BACK"))
					LOGOPP.basic.forward(children.get(0), false);
				else if (id.equals("LEFT"))
					LOGOPP.basic.turn(children.get(0), true);
				else if (id.equals("RIGHT"))
					LOGOPP.basic.turn(children.get(0), false);
				else if (id.equals("SETX"))
					LOGOPP.basic.teleport(children.get(0), null, true, false);
				else if (id.equals("SETY"))
					LOGOPP.basic.teleport(null, children.get(0), false, true);
				else if (id.equals("PRINT"))
					LOGOPP.basic.print(children.get(0));
				else if (id.equals("SETSPEED"))
					LOGOPP.basic.setSpeed(children.get(0));
				else if (id.equals("SAVEIMAGE"))
					LOGOPP.basic.saveImage(children.get(0));
				else if (id.equals("CHANGECOLOR"))
					LOGOPP.basic.changeColor(children.get(0));
				else if (id.equals("LOAD"))
					LOGOPP.basic.load(children.get(0));

			} else if (children.size() == 2)
				if (id.equals("SETXY"))
					LOGOPP.basic.teleport(children.get(0), children.get(1), true, true);
		}
		return null;
	}
	
	private final static HashSet<String> CommandList0 = new HashSet<String>(
					Arrays.asList(new String[] {"ORIGIN", "CLEARSCREEN", 
							"GETX", "GETY", "GETXY", "SHOWTURTLE", "HIDETURTLE", 
							"WRAP", "FENCE", "PENUP", "PENDOWN"}));
	private final static HashSet<String> CommandList1 = new HashSet<String>(
					Arrays.asList(new String[] {"FORWARD", "BACK", "LEFT", 
							"RIGHT", "SPEED", "SETX", "SETY", "PRINT", "SETSPEED",
								    "SAVEIMAGE", "CHANGECOLOR", "LOAD"}));
	private final static HashSet<String> CommandList2 = new HashSet<String>(
					Arrays.asList(new String[] {"SETXY"}));
	
	private int findCommand(String id) {
		if (CommandList0.contains(id))
			return 0;
		if (CommandList1.contains(id))
			return 1;
		if (CommandList2.contains(id))
			return 2;
		return -1;
	}
}