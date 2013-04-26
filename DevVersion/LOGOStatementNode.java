
public class LOGOStatementNode extends LOGONode{
	public LOGOStatementNode(String id, LOGONode... args) {
		super(id, args);
		System.out.println("statement node");
	}
	
	public Object run() {
		Object ret = null;
		if (id.equals("statement_list")) {
			for (LOGONode node : children)
					ret = node.run();
		}
		return ret;
	}
}
