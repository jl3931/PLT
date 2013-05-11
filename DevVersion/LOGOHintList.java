import java.io.*;
import java.util.*;
import java.awt.*;

public class LOGOHintList implements Serializable {
    class Hint implements Serializable{
        String content;
        int x;
        int y;
        public Hint(String c, int xp, int yp) {
            content = c;
            x = xp;
            y = yp;
        }
    }

    ArrayList<Hint> hints = new ArrayList<Hint>();

    public void addHint(String content, int x, int y) {
        hints.add(new Hint(content, x, y));
    }

    public int hintNumber() {
        return hints.size();
    }

    public void printHints(Graphics g, boolean showIndex) {
        int cnt = 1;
        for (Hint h : hints) {
            String str = (showIndex?(Integer.toString(cnt) + ":"):"") + h.content;
            g.drawString(str, h.x ,h.y);
            cnt++;
        }
    }

    public void removeHint(int index) {
        if (index <= 0 || index > hints.size()) {
            LOGOPP.errorhandler.setRunTime("REMOVE HINT", "Wrong index of hint!");
            return;
        }
        hints.remove(index-1);
    }

    public void clear() {
        hints.clear();
    }
}