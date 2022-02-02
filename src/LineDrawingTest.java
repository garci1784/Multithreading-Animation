import javax.swing.JFrame;
import javax.swing.JButton;
import javax.awt.FlowLayout;
import javax.awt.event.ActionListener;

public class LineDrawingTest {

    public static void main(String[] args)
    {

        // Creates the Frame
        JFrame application = new JFrame();
        // creates the object to paint the lines
        LiningPanel panel = new LiningPanel();
        // Creates the button
        LiningPanel Buttonp = new LiningPanel();
        Buttonp.setLayout(new FlowLayout());
        JButton sButton = new JButton("Start");
        sButton.addActionListener(this);
        

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
