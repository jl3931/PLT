import java.util.ArrayList;
class LOGOIdList {
	private ArrayList<String> ids;
	public LOGOIdList(String id) {
		ids = new ArrayList<String>();
		ids.add(id);
	}
	public LOGOIdList(String id, LOGOIdList idList) {
		ids = idList.ids;
		ids.add(0, id);
	}
	public String[] getList() {
		return (String[])ids.toArray();
	}
}