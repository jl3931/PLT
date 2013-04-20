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
		int commandID = findCommand(id);	//commandID is the number of arguments taken
		if (id.equals("commandList")) {
			for (LOGONode node : children)
				//if (node != null)
					node.run();
		} else {
			if (commandID < 0) {
				LOGOPP.io.err("invalid command");
				return null;
			}
			if (commandID == 0) {
				command(id);
				System.out.println("command received:" + id + " with 0 arguments");
			} else if (commandID == 1) {
				command(id, children.get(0));
				System.out.println("command received:" + id + " with 1 arguments");
			}
		}
		return null;
	}
	
	private final static HashSet<String> CommandList0 = new HashSet<String>(
					Arrays.asList(new String[] {"ORIGIN", "CLEARSCREEN", 
							"GETX", "GETY", "GETXY", "SHOWTURTLE", "HIDETURTLE", 
							"WRAP", "FENCE", "PENUP", "PENDOWN"}));
	private final static HashSet<String> CommandList1 = new HashSet<String>(
					Arrays.asList(new String[] {"FORWARD", "BACK", "LEFT", 
							"RIGHT","SPEED", "SETX", "SETY", "SETXY"}));
	
	private int findCommand(String id) {
		if (CommandList0.contains(id))
				return 0;
		if (CommandList1.contains(id))
				return 1;
		return -1;
	}

	public void command(String id, LOGONode... args) {
		if (args.length == 0) {
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

		} else if (args.length == 1) {
			// command with 1 arguments
			if (id.equals("FORWARD"))
				LOGOPP.basic.forward(args[0], true);
			else if (id.equals("BACK"))
				LOGOPP.basic.forward(args[0], false);
			else if (id.equals("LEFT"))
				LOGOPP.basic.turn(args[0], true);
			else if (id.equals("RIGHT"))
				LOGOPP.basic.turn(args[0], false);
			else if (id.equals("SETX"))
				LOGOPP.basic.teleport(args[0], true, false);
			else if (id.equals("SETY"))
				LOGOPP.basic.teleport(args[0], false, true);
			else if (id.equals("SETXY"))
				;//LOGOPP.basic.teleport(args[0], true, true);
		} else
			System.out.println(">= 2 arguments");	
	}	
}
