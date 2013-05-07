import java.util.Scanner;
import java.awt.*;
import javax.swing.text.*; 
import javax.swing.*;

public class LOGOIO {
	private Scanner scanner;
	public LOGOIO() {
		scanner = new Scanner(System.in);
	}

	public void out(String str) {
		SimpleAttributeSet set = new SimpleAttributeSet(); 
		StyleConstants.setForeground(set, Color.black);
		Document doc = LOGOPP.prev.getStyledDocument(); 
		try { 
			doc.insertString(doc.getLength(), str + "\n", set);
		} 
		catch (BadLocationException e) { 
		}
		LOGOPP.prev.setCaretPosition(LOGOPP.prev.getDocument().getLength());
	}

	public void debug(String str) {
		System.out.println(str);
	}

	public void err(String str) {
		SimpleAttributeSet set = new SimpleAttributeSet(); 
		StyleConstants.setForeground(set, Color.red);
		Document doc = LOGOPP.prev.getStyledDocument(); 
		try { 
			doc.insertString(doc.getLength(), "Error:" + str + "\n", set);
		} 
		catch (BadLocationException e) { 
		}
		LOGOPP.prev.setCaretPosition(LOGOPP.prev.getDocument().getLength());
	}
	
	/*public String in() {
		return scanner.nextLine();
	}*/

	public void in() {
		if (LOGOPP.cur.getText().length() >=5 && 
			LOGOPP.cur.getText().substring(0,5).equals("tur2:")) {
			LOGOPP.cmd = LOGOPP.cur.getText().substring(5);
			LOGOPP.canvas.changeToTurtle("tur2");
		} else {
			LOGOPP.cmd = LOGOPP.cur.getText();
			LOGOPP.canvas.changeToTurtle("local");
		}
		new Thread(){
			public void run() {
				LOGOPP.execute(LOGOPP.cmd);
			}
		}.start();
		LOGOPP.commandHistory.add(LOGOPP.cur.getText());
		LOGOPP.curCmdIndex = LOGOPP.commandHistory.size();
		LOGOPP.io.out(">" + LOGOPP.cur.getText());
		LOGOPP.cur.setText("");
		//LOGOPP.prev.setCaretPosition(LOGOPP.prev.getText().length()-1);


	}

	private String challengeStatus = "";
	private String status = "";

	public void setChallengeStatus(String str) {
		if (null == str)
			return;
		challengeStatus = str;
	}
	public void setStatus(String str) {
		if (null == str)
			return;
		status = str;
	}
	public void showState() {
		LOGOPP.noti.setText("");
		String content = "[Current Turtle: " +
						LOGOPP.canvas.getCurTurtle().getName() +
						", X:" + Integer.toString((int)(LOGOPP.canvas.getCurTurtle().getXPos())) +
						", Y:" + Integer.toString((int)(LOGOPP.canvas.getCurTurtle().getYPos())) +
						", Angle: " + Integer.toString((int)(LOGOPP.canvas.getCurTurtle().getAngle())) +
						"]\n";
		if (challengeStatus != null && !challengeStatus.equals(""))
			content += "[CHALLENGE: " + challengeStatus+ "]";
		content += status;
		LOGOPP.noti.setText(content);
	}
}