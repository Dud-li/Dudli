package tasks.task17;
import java.util.Scanner;

enum Planet {
        MERCURY(0.3, 2.4, 0.38), VENUS(4.9, 6, 0.9), EARTH(6, 6, 9.8), MARS(0.6, 3.5, 0.38),
        JUPITER(1876.6, 71.3, 2.55), SATURN(562, 60.1, 1.12), URANUS(86, 26.5, 0.97), NEPTUNE(101.6, 24.8, 1.17);

        private double m, r, g;

        Planet(double mass, double radius, double G) {
            m = mass;
            r = radius;
            g = G;
        }

        double getG() {
            return g;
        }
}

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите планету:");
            String sw = scanner.nextLine();
            switch (sw) {
                case "Меркурий":
                    System.out.println("Сила притяжения = " + Planet.MERCURY.getG());
                    break;
                case "Венера":
                    System.out.println("Сила притяжения = " + Planet.VENUS.getG());
                    break;
                case "Земля":
                    System.out.println("Сила притяжения = " + Planet.EARTH.getG());
                    break;
                case "Марс":
                    System.out.println("Сила притяжения = " + Planet.MARS.getG());
                    break;
                case "Юпитер":
                    System.out.println("Сила притяжения = " + Planet.JUPITER.getG());
                    break;
                case "Сатурн":
                    System.out.println("Сила притяжения = " + Planet.SATURN.getG());
                    break;
                case "Уран":
                    System.out.println("Сила притяжения = " + Planet.URANUS.getG());
                    break;
                case "Нептун":
                    System.out.println("Сила притяжения = " + Planet.NEPTUNE.getG());
                    break;
            }
        }
}
