package tasks.task8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Picture extends JFrame {
        public Picture(String href) throws IOException {
            super("Окно");
            setSize(390, 450);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            BufferedImage img = ImageIO.read(new File(href));
            JLabel label = new JLabel(new ImageIcon(img));
            add(label);
        }

        public static void main(String[] args) throws IOException {
            new Picture(args.length != 0 ? args[0] : "task/src/tasks/task8/rev.png").setVisible(true);
        }
}
