package tasks.task27;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> fio = new HashMap<>();
        fio.put("Иванов", "Ваня");
        fio.put("Петров", "Денис");
        fio.put("Попов", "Олег");
        fio.put("Кольцов", "Саша");
        fio.put("Земляной", "Коля");
        fio.put("Святая", "Катя");
        fio.put("Пупкин", "Саша");
        fio.put("Кост", "Зорик");
        fio.put("Тюренкова", "Анна");
        fio.put("Почкин", "Никита");
        fio.remove("Кост");
        System.out.println(fio + "\n\n");

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> cities = new ArrayList<>();
        ArrayList<String> cities1 = new ArrayList<>();
        cities.add("Москва");
        cities.add("Санкт-Петербург");
        map.put("Россия", cities);
        cities1.add("Вашингтон");
        cities1.add("Нью-Йорк");
        map.put("США", cities1);
        System.out.println(map);
    }
}