/*Written by Jiao Li*/
public class LOGOLeaf extends LOGONode{
	public LOGOLeaf(String id) {
		super(id);
	}
	public Object run() {
		LOGOPP.io.debug(id);
		if (Character.isDigit(id.charAt(0))) {
			LOGOPP.io.debug("is Double");
			return Double.parseDouble(id);
		}
		else if (id.charAt(0) == '"') {
			LOGOPP.io.debug("is String");
			return id.substring(1,id.length() - 1);
		}
		else {
			LOGOPP.io.debug("is ID");
			Object ret = LOGOPP.symboltable.get(id);
			LOGOPP.io.debug("value " + ret.toString());
			return ret;
		}
	}
}
