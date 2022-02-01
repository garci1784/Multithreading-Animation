import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class LiningPanel extends javax.swing.JPanel {

    public LiningPanel() { }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();
        
        double lines = 15.0;

        Random rand = new Random();
        float red = rand.nextFloat();
        float green = rand.nextFloat();
        float blue = rand.nextFloat();

        Color randomColor = new Color(red, green, blue);


        // bottom left
        for(int i = 0; i < lines; i++)
        {
            int w2 = (int)((i/lines)*w); 
            int h2 = (int)((i/lines)*h); 

            g.setColor(randomColor);
            g.drawLine(0,  h2, w2, h);
        }

        // bottom right
        for(int i = 0; i < lines; i++)
        {
            int w2 = (int)((i/lines)*w);
            int h2 = (int)((i/lines)*h);

            g.drawLine(w, h2, w - w2, h);
        }

        // top right
        for(int i = 0; i < lines; i++)
        {
            int w2 = (int)((i/lines)*w);
            int h2 = (int)((i/lines)*h);

            g.drawLine(w, h - h2, w - w2, 0);
        }

        // top left
        for(int i = 0; i < lines; i++)
        {
            int w2 = (int)((i/lines)*w);
            int h2 = (int)((i/lines)*h);

            g.drawLine(0, h - h2, w2, 0);
        }

    }
    
}
