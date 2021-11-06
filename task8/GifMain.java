package tasks.task8;

import javax.swing.*;

public class GifMain extends Gif {
    public static void main(String[] args) {
        Gif animImg = new Gif();
        framlist.add(new ImageIcon("task/src/tasks/task8/gif/0.png").getImage());
        framlist.add(new ImageIcon("task/src/tasks/task8/gif/1.png").getImage());
        framlist.add(new ImageIcon("task/src/tasks/task8/gif/2.png").getImage());
        framlist.add(new ImageIcon("task/src/tasks/task8/gif/3.png").getImage());
        framlist.add(new ImageIcon("task/src/tasks/task8/gif/4.png").getImage());
        framlist.add(new ImageIcon("task/src/tasks/task8/gif/5.png").getImage());
        framlist.add(new ImageIcon("task/src/tasks/task8/gif/6.png").getImage());
        framlist.add(new ImageIcon("task/src/tasks/task8/gif/7.png").getImage());
        framlist.add(new ImageIcon("task/src/tasks/task8/gif/8.png").getImage());
        framlist.add(new ImageIcon("task/src/tasks/task8/gif/9.png").getImage());
        framlist.add(new ImageIcon("task/src/tasks/task8/gif/10.png").getImage());
        framlist.add(new ImageIcon("task/src/tasks/task8/gif/11.png").getImage());
        framlist.add(new ImageIcon("task/src/tasks/task8/gif/12.png").getImage());
        framlist.add(new ImageIcon("task/src/tasks/task8/gif/13.png").getImage());
        while (true) {
            for (int i = 0; i < 14; i++) {
                image = framlist.get(i);
                animImg.repaint();
                try {
                    Thread.sleep(70);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
