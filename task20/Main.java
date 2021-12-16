package tasks.task20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd hh:mm");
        System.out.println("Введите дату в формате Год.Месяц.Число Часы:Минуты:Секунды");
        String str = scanner.nextLine();
        Date parsingDate;
        parsingDate = ft.parse(str);
        System.out.println(parsingDate);
        Calendar calendar = new GregorianCalendar(2021, 11 , 3, 18, 00, 00);
        Date date = calendar.getTime();
        Date dateNow = new Date();
        System.out.println("Соловых получила задание в " + date + ", а сдал в " + dateNow);
    }
}
