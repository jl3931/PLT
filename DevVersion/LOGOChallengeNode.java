public class LOGOChallengeNode extends LOGONode {
	public LOGOChallengeNode(String id) {
		super(id);
		System.out.println("new command node no arg");
	}

	public LOGOChallengeNode(String id, LOGONode... args) {
		super(id, args);
		System.out.println("new command node with arg");
	}

	public Object run() {
		if (id.equals("CHALLENGE") && children.size() == 1)
			LOGOPP.challenge.loadChallenge((String)(children.get(0).run()),
										LOGOPP.canvas.getWindow());
		else if (id.equals("MATCH") && children.size() == 0)
			LOGOPP.challenge.match();
		else if (id.equals("QUIT") && children.size() == 0)
			LOGOPP.challenge.closeChallenge();
		return null;
	}
}