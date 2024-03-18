package lab2Ex3;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class View extends JFrame {

    public View() {
        setTitle("Three Rectangles");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        // Create an instance of the JPanel
        ThreeRectanglesPanel panel = new ThreeRectanglesPanel();

        // Set the layout of the panel to null so we can manually position the rectangles
        panel.setLayout(null);

        // Add the panel to the frame
        getContentPane().add(panel);

        setVisible(true);
    }


}

class ThreeRectanglesPanel extends JPanel implements Observer {

    public ThreeRectanglesPanel() {
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the rectangles
        int width = getWidth();
        int height = getHeight();
        int rectWidth = width / 3;
        int rectHeight = height / 2;

        g.setColor(Color.RED);
        g.fillRect(0, 0, rectWidth, rectHeight);

        g.setColor(Color.GREEN);
        g.fillRect(rectWidth, 0, rectWidth, rectHeight);

        g.setColor(Color.BLUE);
        g.fillRect(2 * rectWidth, 0, rectWidth, rectHeight);
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}

