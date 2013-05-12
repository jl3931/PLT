/*Written by Jiao Li*/
import java.util.*;
public class LOGOSymbolTable {
	private Stack<HashMap<String, Object> > st;
	private int depth = 0;
	LOGOSymbolTable() {
		st = new Stack<HashMap<String, Object> >();
		st.push(new HashMap<String, Object>());
		depth = 1;
	}

	int checkname(String id) {
		return 1;
	}
	
	public void push() {
		st.push(new HashMap<String, Object>());
		depth++;
	}

	public void clearAll() {
		while (!st.isEmpty())
			st.pop();
		push();
		depth = 1;
	}

	public void pop() {
		if (st.size() <= 1)
			LOGOPP.errorhandler.setRunTime("Symbol Table", "Cannot pop");
		st.pop();
		depth--;
	}
	
	public void set(String id, Object value) {
		if (checkname(id) == 0) {
			LOGOPP.errorhandler.setRunTime("SET", "invalid ID");
			return;
		}
		HashMap<String, Object> hm = st.peek();
		hm.put(id, value);
		LOGOPP.io.debug("ST: " + id + " " + value);
		LOGOPP.io.debug(hm.toString());
	}

	public void unset(String id) {
		HashMap<String, Object> hm = st.peek();
		hm.remove(id);
		LOGOPP.io.debug("ST unset: " + id);
		LOGOPP.io.debug(hm.toString());
	}

	public Object get(String id) {
		HashMap<String, Object> hm = st.peek();
		LOGOPP.io.debug("LOCAL ST");
		LOGOPP.io.debug(hm.toString());
		if (hm.containsKey(id))
			return hm.get(id);
		hm = st.elementAt(0);
		LOGOPP.io.debug("GLOBAL ST");
		LOGOPP.io.debug(hm.toString());
		if (hm.containsKey(id))
			return hm.get(id);
		LOGOPP.errorhandler.setRunTime("Symbol Table", "Cannot find symbol");
		return null;
	}
}