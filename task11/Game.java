package tasks.task11;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Game extends JFrame{
    int count = 2;
    int number = (int) (Math.random()*20);
    JButton enter = new JButton("Ввод");
    JLabel info = new JLabel("Угадайте загаданное число от 0 до 20");
    JTextField choose = new JTextField(2);

    public Game(){
        super("Window");
        this.setSize(400, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel game = new JPanel(new GridLayout(3,1));
        game.add(info);
        game.add(choose);
        game.add(enter);
        JPanel gameflow = new JPanel(new FlowLayout(FlowLayout.CENTER));
        gameflow.add(game);

        add(gameflow);

        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int chnum = Integer.parseInt(choose.getText());
                if (count==0 && number!=chnum){
                    JOptionPane.showMessageDialog(null, "К сожалению, вы проиграли, загаданное число было "+ number);
                    dispose();
                }
                else if (number<chnum){
                    info.setText("Загаданное число меньше, у вас осталось "+count+" попыток");
                    count--;
                }
                else if (number>chnum){
                    info.setText("Загаданное число больше у вас осталось "+count+" попыток");
                    count--;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Поздравляю! Вы выиграли, загаданное число было "+ number);
                    dispose();
                }
            }
        });
    }

    public static void main(String[]args) {
        Game frame = new Game();
        frame.setVisible(true);
    }
}
