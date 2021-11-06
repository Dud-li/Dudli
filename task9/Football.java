package tasks.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Football extends JFrame
{
    int madrid = 0;
    int milan = 0;
    private JButton buttonMil = new JButton("AC Milan");
    private JButton buttonMad = new JButton("Real Madrid");
    private JLabel result = new JLabel("Результат: "+madrid+" X "+milan);
    private JLabel last = new JLabel("Последний счёт: N/A");
    private JLabel win = new JLabel("Победитель: Ничья");


    public Football()
    {
        super("Football");
        this.setSize(225,125);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel gridButton = new JPanel(new GridLayout(1, 2) );
        gridButton.add(buttonMil);
        gridButton.add(buttonMad);
        JPanel flowButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        flowButton.add(gridButton);

        JPanel gridInfo = new JPanel(new GridLayout(3,1));
        gridInfo.add(result);
        gridInfo.add(last);
        gridInfo.add(win);
        JPanel flowInfo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        flowInfo.add(gridInfo);

        Container container = getContentPane();
        container.add(flowButton, BorderLayout.SOUTH);
        container.add(flowInfo,BorderLayout.NORTH);

        buttonMad.addActionListener(new ButtonMadListener());
        buttonMil.addActionListener(new ButtonMilListener());

    }

    public class ButtonMadListener implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            madrid += 1;
            result.setText("Результат: "+madrid+" X "+milan);
            last.setText("Последний забивший: Madrid");
            if (madrid > milan)
                win.setText("Победитель: Madrid");
            else if (milan > madrid)
                win.setText("Победитель: Milan");
            else
                win.setText("Победитель: Ничья");
        }
    }

    public class ButtonMilListener implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            milan += 1;
            result.setText("Результат: "+madrid+" X "+milan);
            last.setText("Последний забивший: Milan");
            if (madrid > milan)
                win.setText("Победитель: Madrid");
            else if (milan > madrid)
                win.setText("Победитель: Milan");
            else
                win.setText("Победтель: Ничья");
        }
    }
}
