package tasks.task8;

import javax.swing.*;
import java.awt.*;

public class Draw extends JFrame{
    public static Shape getRandomShape()
    {
        int rand = (int)(Math.random() * 3);
        if (rand == 0)
            return new Rectangle();
        else if (rand == 1)
            return new Circle();
        else
            return new Square();
    }

    public void paint(Graphics graph)
    {
        super.paint(graph);
        for (int i = 0, x = 15; i < 5; ++i, x += 280)
            for (int j = 0, y = 35; j < 4; ++j, y += 175)
            {
                int r = (int) (Math.random() * 255);
                int g = (int) (Math.random() * 255);
                int b = (int) (Math.random() * 255);

                Shape sh = getRandomShape();
                sh.setXY(x, y);
                sh.setColor(new Color(r,g,b));

                graph.setColor(sh.getColor());
                if (sh.getClass().getSimpleName().equals("Square"))
                    graph.fillRect(sh.getX(), sh.getY(), Square.getWidth(), Square.getWidth());
                else if (sh.getClass().getSimpleName().equals("Rectangle"))
                    graph.fillRect(sh.getX(), sh.getY()+38,Rectangle.getWidth(), Rectangle.getHeight());
                else if (sh.getClass().getSimpleName().equals("Circle"))
                    graph.fillOval(sh.getX(), sh.getY(), Circle.getRadius(), Circle.getRadius());
            }
    }

    private static void createAndShowGUI() {
        Draw a = new Draw();
    }

    public Draw()
    {
        super("Окно");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1400,725);
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { createAndShowGUI(); }
        });
    }
}
