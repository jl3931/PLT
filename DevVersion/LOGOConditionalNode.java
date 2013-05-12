/*Written by Bohong Zhao*/
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
		Object ret = null;
		int we_run_it = 0;
		if (id.equals("if")) {
			bool = runAndCheck(children.get(0));
			if (LOGOPP.errorhandler.error())
				return null;
			if (bool == true_) {
				we_run_it = 1;
				ret = children.get(1).run();
				if (LOGOPP.errorhandler.error())
					return null;
			}
			if (we_run_it == 1) {
				return ret;
			}
			return null;
		}
		if (id.equals("if_else")) {
			bool = runAndCheck(children.get(0));
			if (LOGOPP.errorhandler.error())
				return null;
			if (bool == true_) {
				we_run_it = 1;
				ret = children.get(1).run();
				if (LOGOPP.errorhandler.error())
					return null;
			} else {
				we_run_it = 1;
				ret = children.get(2).run();
				if (LOGOPP.errorhandler.error())
					return null;
			}
			if (we_run_it == 1) {
				return ret;
			}
		}
		LOGOPP.errorhandler.setRunTime(id, "unrecognised condition command");
		return null;
	}
}
