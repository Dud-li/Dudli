package pj1;

public class testBook {
    public static void main(String[] args){
        Book b1 = new Book("Harry Potter",532);
        Book b2 = new Book(147);
        Book b3 = new Book("War and Peace");
        b3.setPages(3321);
        b2.setName("Red heat");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        b2.math();
    }
}
