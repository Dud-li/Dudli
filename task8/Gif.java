package tasks.task8;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Gif extends JFrame {
    protected static Image image;
    private static JFrame jFrame;
    private static String text;
    protected static ArrayList<Image> framlist = new ArrayList<>();

    Gif() {
        super("Окно");
        setLayout(new FlowLayout());
        setSize(508, 388);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.drawImage(image, 0, 0, 500, 381, null);
    }
}
