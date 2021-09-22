package task3;

public class testBook {

public static void main(String[] args){
        Book b = new Book("Пушкин","《Евгений Онегин》",1831);
        System.out.println(b);
        b.setAuthor("Толстой");
        b.setName("《Война и мир》");
        b.setYear(1865);
        System.out.println(b);
    }
}
