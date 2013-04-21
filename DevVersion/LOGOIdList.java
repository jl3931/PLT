import java.util.ArrayList;
class LOGOIdList {
	public ArrayList<String> ids;
	public LOGOIdList(String id) {
		ids = new ArrayList<String>();
		ids.add(id);
	}
	public LOGOIdList(String id, LOGOIdList idList) {
		ids = idList.ids;
		ids.add(0, id);
	}
	public Object[] getList() {
		LOGOPP.io.debug(ids.toString());
		return ids.toArray();
	}
}