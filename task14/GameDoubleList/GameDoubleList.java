package tasks.task14.GameDoubleList;

import java.util.*;

public class GameDoubleList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DoubleList<Double> fPlayer = new Basic<>();
        DoubleList<Double> sPlayer = new Basic<>();
        System.out.println("Введите карты первого игрока: ");
        for (int i = 0; i < 5; i++)
            fPlayer.add(in.nextDouble());
        System.out.println("Введите карты второго игрока: ");
        for (int i = 0; i < 5; i++)
            sPlayer.add(in.nextDouble());
        int count = 0;
        while (fPlayer.size()>0 && sPlayer.size()>0) {
            if (fPlayer.get(0) == 0 && sPlayer.get(0) == 9) {
                fPlayer.add(fPlayer.get(0));
                fPlayer.add(sPlayer.get(0));
                fPlayer.delete(0);
                sPlayer.delete(0);
                count++;
            } else if (fPlayer.get(0) == 9 && sPlayer.get(0) == 0) {
                sPlayer.add(fPlayer.get(0));
                sPlayer.add(sPlayer.get(0));
                fPlayer.delete(0);
                sPlayer.delete(0);
                count++;
            } else if (fPlayer.get(0) > sPlayer.get(0)) {
                fPlayer.add(fPlayer.get(0));
                fPlayer.add(sPlayer.get(0));
                fPlayer.delete(0);
                sPlayer.delete(0);
                count++;
            } else if (fPlayer.get(0) < sPlayer.get(0)) {
                sPlayer.add(fPlayer.get(0));
                sPlayer.add(sPlayer.get(0));
                fPlayer.delete(0);
                sPlayer.delete(0);
                count++;
            }
            if (count == 106)
                break;
        }
        if (count == 106)
            System.out.println("botva");
        else if (fPlayer.size()==0)
            System.out.println("second " + count);
        else
            System.out.println("first " + count);
    }
}
