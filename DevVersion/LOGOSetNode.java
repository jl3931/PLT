/*Written by Jiao Li*/
public class LOGOSetNode extends LOGONode{
	public LOGOSetNode(String id, LOGONode... args) {
		super(id, args);
	}

	Object runAndCheck(LOGONode node) {
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
			LOGOPP.errorhandler.setRunTime(id, "null argument");
			return null;
		}
		return nodeVal;
	}

	public Object run() {
		Object arg0 = runAndCheck(children.get(0));
		if (LOGOPP.errorhandler.error())
			return null;
		LOGOPP.symboltable.set(id, arg0);
		if (LOGOPP.errorhandler.error())
			return null;
		LOGOPP.io.debug("Set "+ id);
		LOGOPP.io.debug(arg0.toString());
		return arg0;
	}
}