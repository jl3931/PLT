public class LOGOChallengeNode extends LOGONode {
	public LOGOChallengeNode(String id) {
		super(id);
	}

	public LOGOChallengeNode(String id, LOGONode... args) {
		super(id, args);
	}

	public Object run() {
		if (LOGOPP.errorhandler.error())
			return null;
		if (id.equals("CHALLENGE") && children.size() == 1)
			LOGOPP.challenge.loadChallenge(children.get(0), LOGOPP.canvas.getWindow());
		else if (id.equals("MATCH") && children.size() == 0)
			LOGOPP.challenge.match();
		else if (id.equals("QUIT") && children.size() == 0)
			LOGOPP.challenge.closeChallenge();
		else if (id.equals("RECORD") && children.size() == 0)
			LOGOPP.challenge.record();
		else if (id.equals("RECORD") && children.size() == 1)
			LOGOPP.challenge.resume(children.get(0));
		else if (id.equals("SHOWHINT") && children.size() == 0)
			LOGOPP.challenge.showHint();
		else if (id.equals("SAVE") && children.size() == 1)
			LOGOPP.challenge.saveChallenge(children.get(0));
		else if (id.equals("WRITEHINT") && children.size() == 1 )
			LOGOPP.challenge.writeHint(children.get(0));
		else if (id.equals("WRITEHINT") && children.size() == 3 )
			LOGOPP.challenge.writeHint(children.get(0), children.get(1), children.get(2));
		else if (id.equals("REMOVEHINT") && children.size() == 1 )
			LOGOPP.challenge.removeHint(children.get(0));
		else if (id.equals("REMOVEALLHINT") && children.size() == 0)
			LOGOPP.challenge.removeAllHint();
		return null;
	}
}