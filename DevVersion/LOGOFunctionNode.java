class LOGOFunctionNode extends LOGONode {
	Object[] arguments;
	public LOGOFunctionNode(String id, String type, Object argList, LOGONode... args) {
		super(id, args);
		arguments = new Object[2];
		arguments[0] = type;
		arguments[1] = argList;
	}
	public Object run() {
		if (arguments[0].equals("define")) {
			LOGOFunction function = new LOGOFunction(id, (LOGOIdList)arguments[1], (LOGOCommandNode)children.get(0));
			LOGOPP.symboltable.set(id, function);
			return null;
		}
		if (arguments[0].equals("execute")) {
			Object function = LOGOPP.symboltable.get(id);
			if (function instanceof LOGOFunction)
				return ((LOGOFunction)function).run((LOGOExprListNode)arguments[1]);
			LOGOPP.errorhandler.setRunTime(id, "cannot find function definition.");
			return null;
		}
		LOGOPP.io.err("LOGOFunctionNode: unreachable location");
		return null;
	}
}

class LOGOFunction {
	String id;
	LOGOIdList args;
	LOGOCommandNode cmd;
	LOGOFunction(String id, LOGOIdList args, LOGOCommandNode cmd) {
		this.id = id;
		this.args = args;
		this.cmd = cmd;
	}

	void setArg(LOGOExprListNode args) {
		String[] idList = this.args.getList();
		Object[] argList = (Object[])args.run();
		if (LOGOPP.errorhandler.error())
			return;
		if (idList.length != argList.length) {
			LOGOPP.errorhandler.setRunTime(id, "unmatched number of arguments");
			return;
		}
		for (int i = 0; i < idList.length; i++) {
			LOGOPP.symboltable.set(idList[i], argList[i]);
		}
	}
	
	Object run(LOGOExprListNode args) {
		if (LOGOPP.errorhandler.error())
			return null;
		LOGOPP.symboltable.push();
		setArg(args);
		if (LOGOPP.errorhandler.error())
			return null;
		Object ret = cmd.run();
		LOGOPP.symboltable.push();
		return ret;
	}
}