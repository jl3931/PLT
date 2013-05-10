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
		//System.out.println(str);
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
		String content = "";
		//if (challengeStatus != null && !challengeStatus.equals(""))
		//	content += "[CHALLENGE: " + challengeStatus+ "]";
		content += status;
		for (int i=0; i< 35 - content.length();i++) {
			content += " ";
		}
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
			angleString = "N " + Integer.toString(a - 270) + " E";
		}
		else if (a > 180 && a < 270) {
			angleString = "N " + Integer.toString(270 - a) + " W";
		}
		else if (a > 90 && a < 180) {
			angleString = "S " + Integer.toString(a - 90) + " W";
		}
		else if (a > 0 && a < 90) {
			angleString = "S " + Integer.toString(90 - a) + " E";
		}
		content += "\t[Current Turtle: " +
						LOGOPP.canvas.getCurTurtle().getName() +
						", X:" + Integer.toString((int)(LOGOPP.canvas.getCurTurtle().getXPos())) +
						", Y:" + Integer.toString((int)(LOGOPP.canvas.getCurTurtle().getYPos())) +
						", Angle: " + angleString +
						", Speed: " + Integer.toString((int)(LOGOPP.canvas.getCurTurtle().getSpeed())) +
						"]";

		
		LOGOPP.noti.setText(content);
	}
}