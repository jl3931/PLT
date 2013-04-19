public class LOGOConditionalNode extends LOGONode{
	public LOGOConditionalNode(String id, LOGONode... args) {
		super(id, args);
	}
	
	Double runAndCheck(LOGONode node) {
		if (LOGOPP.errorhandler.error())
			return null;
		if (node == null) {
			LOGOPP.errorhandler.setRunTime(id, "no argument");
			return null;
		}
		Object nodeVal = node.run();
		if (LOGOPP.errorhandler.error())
			return null;
		if (nodeVal == null) {
			LOGOPP.errorhandler.setRunTime(id, "null argument in if...");
			return null;
		}
		if (!(nodeVal instanceof Double)) {
			LOGOPP.errorhandler.setRunTime(id, "wrong argument type for the expression in if...");
			return null;
		}
		return (Double) nodeVal;
	}
	public Object run() {
		double bool;
		double true_ = (double) 1;
		if (id.equals("if")) {
			bool = runAndCheck(children[0]);
			if (bool == true_)
				children[1].run();
			return null;
		}
		if (id.equals("if_else")) {
			bool = runAndCheck(children[0]);
			if (bool == true_)
				children[1].run();
			else
				children[2].run();
			return null;
		}
		return null;		

	}
	

}
