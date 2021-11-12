package tasks.task11;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Orientation extends JFrame {
    JButton north = new JButton("Север");
    JButton south = new JButton("Юг");
    JButton center = new JButton("Центр");
    JButton west = new JButton("Запад");
    JButton east = new JButton("Восток");

    public Orientation(){
        super("Window");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(north,BorderLayout.NORTH);
        add(south,BorderLayout.SOUTH);
        add(center,BorderLayout.CENTER);
        add(west,BorderLayout.WEST);
        add(east,BorderLayout.EAST);

        north.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на Север");
            }
        });
       south.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на Юг");
            }
        });
        center.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Центр");
            }
        });
        west.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Запад");
            }
        });
        east.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на Восток");
            }
        });
    }
    public static void main(String[]args) {
        Orientation frame = new Orientation();
        frame.setVisible(true);
    }
}

