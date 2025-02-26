import java.awt.*;
import javax.swing.*;

/**
 * Lab 6 starter example
 * 
 * @author Jim Teresco
 * @author Ira Goldstein
 * @version Spring 2025
 */

// a class that extends JPanel to override the paintComponent method,
// allowing us to interact with Java's graphics system
class GraphicsPanel2 extends JPanel{

    @Override
    public void paintComponent(Graphics g) {

        // first, we should call the paintComponent method we are
        // overriding in JPanel
        super.paintComponent(g);
        // g.drawRect(0, 0, 50, 70);
        g.setColor(Color.GREEN);
        g.fillRect(0, 0 , 50, 70);

        // g.drawOval(25, 35, 100, 150);
        g.setColor(Color.MAGENTA);
        g.fillOval(25, 35, 100, 150);

        g.setColor(Color.DARK_GRAY);
        g.drawArc(70, 100, 375, 547, 15, 140);
        
        g.setColor(Color.DARK_GRAY);
        g.drawArc(70, 100, 375, 547, 15, 70);

        g.drawLine(0, 100, 200, 465);
        g.setColor(Color.CYAN);
        g.fillRect(60, 300, 400, 35);


    }
}

public class ArtProject implements Runnable{

    /**
     * The run method to set up the graphical user interface
     */
    @Override
    public void run() {

        // the usual JFrame setup steps
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Art");
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // construct JPanel with a custom paintComponent method
        JPanel panel = new GraphicsPanel2();
        frame.add(panel);

        // display the window we've created
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        javax.swing.SwingUtilities.invokeLater(new ArtProject());
    }
}
