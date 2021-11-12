package tasks.task13;

import java.util.*;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        // Добавление объектов
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Tiger");
        animals.add("Bear");
        animals.add("Dog");
        // Добавление объекта по индексу
        animals.add(1,"Lion");
        // Вывод объекта по индексу
        System.out.println(animals.get(3));
        // Индексы первого и последнего вхождения объекта Dog
        System.out.println(animals.indexOf("Dog")+" "+ animals.lastIndexOf("Dog"));
        // Присваивание объекту с индексом 5 значение элемента Pig
        animals.set(5,"Pig");
        // Удаление элемента с индексом 5
        animals.remove(5);
        // Вывод количества объектов в списке
        System.out.println(animals.size());
        // Вывод объектов списка
        for (String a:animals)
            System.out.print(a+" ");
    }
}
