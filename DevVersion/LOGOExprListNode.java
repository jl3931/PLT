class LOGOExprListNode extends LOGONode {
	//int numExpr;
	public LOGOExprListNode(LOGONode... exprs) {
		super("expressionList", exprs);
		//numExpr = 1;
		//children = new LOGONode[numExpr];
		//children[0] = expr;
	}
	/*public LOGOExprListNode(LOGONode expr, LOGOExprListNode exprList) {
		super("");
		numExpr = exprList.numExpr + 1;
		children = new LOGONode[numExpr];
		children.get(0) = expr;
		for (int i = 1; i < numExpr; i++)
			children[i] = exprList.children[i-1];
	}*/

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