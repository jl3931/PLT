import java.util.Scanner;
import java.awt.*;
import javax.swing.text.*; 
import javax.swing.*;

public class LOGOIO {
	public LOGOIO() {
		//scanner = new Scanner(System.in);
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

	public void in() {
		LOGOPP.cmd = LOGOPP.cur.getText();
		new Thread(){
			public void run() {
				LOGOPP.execute(LOGOPP.cmd);
			}
		}.start();
		LOGOPP.commandHistory.add(LOGOPP.cur.getText());
		LOGOPP.curCmdIndex = LOGOPP.commandHistory.size();
		LOGOPP.io.out(">" + LOGOPP.cur.getText());
		LOGOPP.cur.setText("");
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
		int a = (int)(LOGOPP.canvas.getCurTurtle().getAngle());
		String angleString = Integer.toString(a) + "o";
		if (a == 270) {
			angleString = "N";
		}
		else if (a == 0) {
			angleString = "E";
		}
		else if (a == 90) {
			angleString = "S";
		}
		else if (a == 180) {
			angleString = "W";
		}
		else if (a > 270 && a < 360) {
			angleString = "NtoE" + Integer.toString(a - 270) + "o";
		}
		else if (a > 180 && a < 270) {
			angleString = "NtoW" + Integer.toString(270 - a) + "o";
		}
		else if (a > 90 && a < 180) {
			angleString = "StoW" + Integer.toString(a - 90) + "o";
		}
		else if (a > 0 && a < 90) {
			angleString = "StoE" + Integer.toString(90 - a) + "o";
		}
		String content = "[Current Turtle: " +
						LOGOPP.canvas.getCurTurtle().getName() +
						", X:" + Integer.toString((int)(LOGOPP.canvas.getCurTurtle().getXPos())) +
						", Y:" + Integer.toString((int)(LOGOPP.canvas.getCurTurtle().getYPos())) +
						", Angle: " + angleString +
						"]\n";

		if (challengeStatus != null && !challengeStatus.equals(""))
			content += "[CHALLENGE: " + challengeStatus+ "]";
		content += status;
		LOGOPP.noti.setText(content);
	}
}