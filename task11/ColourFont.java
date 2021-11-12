package tasks.task11;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ColourFont extends JFrame{
    private JTextArea area = new JTextArea("A man is born for happiness, but he must work");
    private JButton font1 = new JButton("Font: Times New Roman");
    private JButton font2 = new JButton("Font: MS Sans Serif");
    private JButton font3 = new JButton("Font: Courier New");
    private JButton colour1 = new JButton("Color: Blue");
    private JButton colour2 = new JButton("Color: Red");
    private JButton colour3 = new JButton("Color: Black");

    public ColourFont(){
        super("Window");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel fontButton = new JPanel(new GridLayout(1, 3));
        fontButton.add(font1);
        fontButton.add(font2);
        fontButton.add(font3);
        JPanel flowButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        flowButton.add(fontButton);

        JPanel colorButton = new JPanel(new GridLayout(1, 3) );
        colorButton.add(colour1);
        colorButton.add(colour2);
        colorButton.add(colour3);
        JPanel flowButton2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        flowButton2.add(colorButton);

        add(area);
        add(flowButton, BorderLayout.NORTH);
        add(flowButton2, BorderLayout.SOUTH);

        colour1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setForeground(Color.BLUE);
            }
        });
        colour2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setForeground(Color.RED);
            }
        });
        colour3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setForeground(Color.BLACK);
            }
        });
        font1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setFont(new Font("Times New Roman", Font.BOLD, 15));
            }
        });
        font2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setFont(new Font("Sans Serif", Font.BOLD, 15));
            }
        });
        font3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setFont(new Font("Courier New", Font.BOLD, 15));
            }
        });
    }

    public static void main(String[]args) {
        ColourFont frame = new ColourFont();
        frame.setVisible(true);
    }
}
