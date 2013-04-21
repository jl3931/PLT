
public class LOGOStatementNode extends LOGONode{
	public LOGOStatementNode(String id, LOGONode... args) {
		super(id, args);
		System.out.println("statement node");
	}
	
	public Object run() {
		if (id.equals("statement_list")) {
			for (LOGONode node : children)
					node.run();
		}
		return null;
	}
}
