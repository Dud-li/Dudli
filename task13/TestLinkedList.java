package tasks.task13;

import java.util.*;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<String>();
        //Добавление в начало и конец
        animals.addFirst("Cat");
        animals.addFirst("Dog");
        animals.addLast("Lion");
        //Добавление по индексу
        animals.add(2,"Tiger");
        //Вывод первого элемента
        System.out.println(animals.getFirst());
        //Вывод всех элементов
        for(String a:animals)
            System.out.print(a+" ");
        //Удаление последнего элемента
        animals.removeLast();
        System.out.println();
        for(String a:animals)
            System.out.print(a+" ");
    }
}
