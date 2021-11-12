package tasks.task13.ourArrayList;

public class Test {
    public static void main(String[] args) {
        Description<String> animals = new Base<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Bear");
        animals.add("Tiger");
        //вывод элемента массива
        System.out.println(animals.get(2));
        //замена элемента массива
        animals.update(2, "Lion");
        // Вывод элементов
        for (String a:animals)
            System.out.print(a+" ");
        //удаление элемента массива
        System.out.println();
        animals.delete(3);
        //вывод размера массива
        System.out.println(animals.size());
        // Вывод элементов
        for (String a:animals)
            System.out.print(a+" ");
    }
}
