import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class LOGOPP extends JFrame implements KeyListener {
	JTextArea prev;
    JTextField cur;
    static final int PREV_HEIGHT = 100;
    static final int CUR_HEIGHT = 25;
    static final int MARGIN_HEIGHT = 5;
    String cmd;
	static LOGOIO io = new LOGOIO();
	static LOGOSymbolTable symboltable = new LOGOSymbolTable();
	static LOGOErrorHandler errorhandler = new LOGOErrorHandler(io);
	static LOGOCanvas canvas = new LOGOCanvas("LOGO++", 600, 400);
	static LOGOInterpreter interpreter = new LOGOInterpreter();
	static LOGOBasic basic = new LOGOBasic();
	static HashMap<String, Object> variableTable = new HashMap<String, Object>();
	//TODO:static HashMap<String, LOGOFunc> functionTable = new HashMap<String, LOGOFunc>();


	public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               createAndShowGUI();
            }
        });
	}
	
	public LOGOPP(String name) {
		super(name);
	}

	private static void createAndShowGUI() {
        LOGOPP logoPP = new LOGOPP("LOGOGUI");
        logoPP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logoPP.addComponentsToPane();
        logoPP.pack();
        logoPP.setSize(canvas.getWidth() + 2 * MARGIN_HEIGHT ,canvas.getHeight() 
        				+ PREV_HEIGHT +  CUR_HEIGHT * 2 + MARGIN_HEIGHT * 2);
        logoPP.setVisible(true);
    }

    private void addComponentsToPane() {
        cur = new JTextField(20);
        cur.addKeyListener(this);
        prev = new JTextArea();
        prev.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(prev);
        scrollPane.setPreferredSize(new Dimension(canvas.getWidth(), 200));
        getContentPane().add(cur);
        getContentPane().add(scrollPane);
        getContentPane().add(canvas);
        scrollPane.setBounds(1, canvas.getHeight() + MARGIN_HEIGHT, canvas.getWidth(), PREV_HEIGHT);
		cur.setBounds(1, canvas.getHeight() + PREV_HEIGHT + 2 * MARGIN_HEIGHT, 
						canvas.getWidth(), CUR_HEIGHT);
		repaint();
    }

    public void keyTyped(KeyEvent e) {
    }
     
    public void keyPressed(KeyEvent e) {
    	if (e.getKeyCode() == 10) {
    		cmd = cur.getText();
    		new Thread(){
            	public void run() {
               		ProcessCommand(cmd);
            	}
        	}.start();
        	prev.append(cur.getText()+"\n");
        	cur.setText("");
    	}
    }
     
    public void keyReleased(KeyEvent e) {
    }

	public void ProcessCommand (String str) {
		if (!str.equals("exit") && !errorhandler.error()) {
			execute(str);
			canvas.repaint();
		} else {
			if (errorhandler.error())
				errorhandler.errorOut();
		}
	}

	public void execute(String str) {
		errorhandler.reset();
		try {
			LOGONode root = interpreter.parse(str);
			root.run();
		}
		catch (Exception e) {
			errorhandler.set(e.toString());
		}
	}
}
