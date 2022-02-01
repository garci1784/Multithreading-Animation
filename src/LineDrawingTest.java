import javax.swing.JFrame;

public class LineDrawingTest {

    public static void main(String[] args)
    {

        // Creates the Frame
        JFrame application = new JFrame();
        // creates the object to paint the lines
        LiningPanel panel = new LiningPanel();

        // how to exit
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // adds the object to the frame
        application.add(panel);
        // size of the frame
        application.setSize(300, 300);
        // title of the frame
        application.setTitle("Lining Art");
        // makes the frame visible
        application.setVisible(true);
    }
}