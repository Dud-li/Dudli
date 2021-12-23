package tasks.task18;

import java.util.Scanner;

enum Customer {
    ClientOne(987654321), ClientTwo(123456789),ClientThree(987656789);
    private int inn;

    Customer(int inn) {
        this.inn = inn;
    }
    int getInn() {
        return inn;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО клиента");
        String sw = scanner.nextLine();
        switch (sw) {
            case "ClientOne": {
                System.out.println("Введите ИНН");
                try {
                    int inn = scanner.nextInt();
                    if (inn == Customer.ClientOne.getInn()) {
                        System.out.println("ИНН введен верно");
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("ИНН указан неверно!");
                }
            }
        case "ClientTwo": {
            System.out.println("Введите ИНН");
            try {
                int inn = scanner.nextInt();
                if (inn == Customer.ClientTwo.getInn()) {
                    System.out.println("ИНН введен верно");
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("ИНН указан неверно!");
            }
        }
        case "ClientThree": {
            System.out.println("Введите ИНН");
            try {
                int inn = scanner.nextInt();
                if (inn == Customer.ClientThree.getInn()) {
                    System.out.println("ИНН введен верно");
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("ИНН указан неверно!");
            }
        }
        }

    }
}
