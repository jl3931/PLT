class LOGOExprListNode extends LOGONode {
	public LOGOExprListNode(LOGONode... exprs) {
		super("expressionList", exprs);
	}

	public Object run() {
		Object[] ret = new Object[children.size()];
		//for (int i = 0; i < numExpr; i++)
			//ret[i] = children[i].run();
		int i = 0;
		for (LOGONode node : children)
			ret[i++] = node.run();
		LOGOPP.io.debug("Evaluting expression list");
		LOGOPP.io.debug(ret.toString());
		return ret;
	}
}