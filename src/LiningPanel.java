// Modified by Jorge Ezequiel Garcia Lopez
// Student ID: 200863135
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class LiningPanel extends javax.swing.JPanel{

    public LiningPanel() {}

    Random rand = new Random();
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();

        double lines = 15.0;

        for(int i = 0; i < lines; i++)
        {
            int w2 = (int)((i/lines)*w);
            int h2 = (int)((i/lines)*h);

            // creates Color object 15 (lines) times
            Color randomColor = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());

            g.setColor(randomColor);
            g.drawLine(0,  h2, w2, h);
            g.drawLine(w, h2, w - w2, h);
            g.drawLine(w, h - h2, w - w2, 0);
            g.drawLine(0, h - h2, w2, 0);
        }

    }
}
