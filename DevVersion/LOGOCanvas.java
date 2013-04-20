import java.awt.*;
import java.awt.geom.AffineTransform;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class LOGOCanvas extends JComponent {
	final static public int DEFAULT_WIDTH = 500;
	final static public int DEFAULT_HEIGHT = 500;
	
	public HashMap<String, LOGOTurtle> turtlePool = new HashMap<String, LOGOTurtle>();
	private LOGOTurtle curTurtle;
	public boolean wrap;
	public int[][] bitmap;
	private static BMP bmpGenerator = new BMP();
	private int width;
	private int height;	

	public int getWidth() {return width;}
	public int getHeight() {return height;}

	public LOGOCanvas(String str) {
		init(str, DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}

	public LOGOCanvas(String str, int w, int h) {
		init(str, w, h);
	}
	
	public void clean() {
		for (int i = 0; i < height; i++)
			for (int j = 0; j < width; j++)
				bitmap[i][j] = 255|255<<8|255<<16;
	
	}

	private void init(String str, int w, int h) {
		height = h;
		width = w;
		if (str != null)
			title = str;
		bitmap = new int[height][width];
		clean();
	}

	public LOGOTurtle getCurTurtle() {return curTurtle;}

	public boolean changeToTurtle(String name) {
		if (turtlePool.containsKey(name)) {
			curTurtle = turtlePool.get(name);
			return true;
		}
		else
			return false;
	}

	public void putTurtle(LOGOTurtle tur) {
		tur.canvasOn = this;
		turtlePool.put(tur.getName(), tur);
		curTurtle = tur;
	}


	public void paint(Graphics g) {
		bmpGenerator.saveBMP(title+".bmp",bitmap);
		try {
			File imageFile = new File(title+".bmp");
			Image image = ImageIO.read(imageFile);
			ImageIcon icon = new ImageIcon(image);
			Graphics2D g2 = (Graphics2D) g;
			g2.drawImage(icon.getImage(), 0,0, width, height, this);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Iterator it = turtlePool.entrySet().iterator();
    	while (it.hasNext()) {
        	Map.Entry pairs = (Map.Entry)it.next();
        	LOGOTurtle tur = (LOGOTurtle)pairs.getValue();
        	tur.paint(g);
        	//it.remove();
        	//it.next(); // avoids a ConcurrentModificationException
    	}
	}
	
	private String title = "untitled canvas";
}
