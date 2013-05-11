
public class LOGOStatementNode extends LOGONode{
	public LOGOStatementNode(String id, LOGONode... args) {
		super(id, args);
	}
	
	public Object run() {
		Object ret = null;
		if (id.equals("statement_list")) {
			for (LOGONode node : children) {
				if (LOGOPP.errorhandler.error())
					return null;
				ret = node.run();
			}
		}
		return ret;
	}
}
