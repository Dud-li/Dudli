package tasks.task15;

import java.util.Scanner;
import java.io.*;

public class WorkWithFile {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        //Запись в файл
        try (FileWriter writer = new FileWriter("C:\\Univer\\Jaba\\task\\src\\tasks\\task15\\test.txt", false)) {
            writer.write(in.nextLine());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        //Чтение из файла
        try (FileReader reader = new FileReader("C:\\Univer\\Jaba\\task\\src\\tasks\\task15\\test.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.println();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        //Перезапись файла
        try (FileWriter writer = new FileWriter("C:\\Univer\\Jaba\\task\\src\\tasks\\task15\\test.txt", false)) {
            writer.write(in.nextLine());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        //Добавление текста в файл
        try (FileWriter writer = new FileWriter("C:\\Univer\\Jaba\\task\\src\\tasks\\task15\\test.txt", true)) {
            writer.append(' ');
            writer.write(in.nextLine());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
