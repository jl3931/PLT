public class LOGOIterationNode extends LOGONode{

	public LOGOIterationNode(String id, LOGONode... args) {
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
			LOGOPP.errorhandler.setRunTime(id, "null argument in iteration condition...");
			return null;
		}
		if (!(nodeVal instanceof Double)) {
			LOGOPP.errorhandler.setRunTime(id, "wrong argument type for the expression in iteration condition...");
			return null;
		}
		return (Double) nodeVal;
	}
	public Object run() {
		double bool;
		double true_ = (double) 1;
		if (id.equals("while")) {
			bool = runAndCheck(children.get(0));
			while (bool == true_) {
				children.get(1).run();
				bool = runAndCheck(children.get(0));
			}
			return null;
		}
		
		return null;		

	}

}
