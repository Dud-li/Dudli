package Task1;
import java.util.Scanner;
import java.util.*;

public class main {
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f = f * i;
        return (f);
    }
    public static void main(String[] args) {
        //1 задание
        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];
        int sum = 0, sum1 = 0, sum2 = 0;
        for (int i = 0; i < 7; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < 7; i++)
            sum += a[i];
        int z = 0;
        while (z < 7) {
            sum1 += a[z];
            z++;
        }
        z = 0;
        do {
            sum2 += a[z];
            z++;
        } while (z < 7);
        String s = "sum for = " + sum + "\n" + "sum while = " + sum1 + "\n"+ "sum do while = " + sum2 + "\n";
        System.out.printf(s);

        //2 задание
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        for (int i=0; i< name.length(); i++)
            System.out.print(name.charAt(i));
        System.out.print("\n");

        //3 задание
        System.out.printf("1\n");
        for (int i=2;i<11;i++) {
            String row = "1/" + i;
            System.out.println(row);
        }

        //4 задание
        Random r = new Random();
        byte[] b = new byte[10];
        r.nextBytes(b);
        for (int i = 0; i < b.length; i++)
            System.out.printf("%d ", b[i]);
        System.out.printf("\n");
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++)
            System.out.printf("%d ", b[i]);
        System.out.printf("\n");
        int [] d = new int[10];
        for(int i = 0; i <  d.length; i++) {
            d[i] =  (int)(Math.random() * 100);
            System.out.printf("%d ",d[i]);
        }
        System.out.printf("\n");
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++)
            System.out.printf("%d ", d[i]);
        System.out.printf("\n");

        //5 задание
        Scanner num = new Scanner(System.in);
        int n=num.nextInt();
        System.out.printf("%d",fact(n));
    }
}

