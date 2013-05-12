/*Written by Jiao Li*/
import java.util.*;

public class LOGONode {
	ArrayList<LOGONode> children;
	String id;
	public LOGONode(String id, LOGONode... args) {
		this.id = id;
		//children = args;
		children = new ArrayList<LOGONode>();
		LOGOPP.io.debug(id);
		for (LOGONode node : args) {
			children.add(node);
			LOGOPP.io.debug("child: " + node.id);
		}
	}
	public Object run() {
		return null;
	};
}