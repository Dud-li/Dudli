package tasks.task19;

import java.util.Scanner;

class TriangleEx extends Exception
{
    public String toString()
    {
        return "Треугольник задан неправильно, один из углов должен быть равен 90 градусов, а сумма углов должна ровняться 180";
    }
}

class Triangle {
    private int a, b, c;
    public Triangle(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        try {
            if ((a != 90 && b != 90 && c != 90) || ((a + b + c) != 180))
                throw new TriangleEx();
            else
                System.out.print("Поздравляю! Вы умеете задавать прямоугольные треугольники");
        }
        catch(TriangleEx e)
        {
            System.out.println(e.toString());
            return;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("c = ");
        c = scanner.nextInt();
        Triangle tr = new Triangle(a,b,c);
    }
}
