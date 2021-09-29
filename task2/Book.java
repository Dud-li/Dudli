package tasks.task2;

public class Book {
    private String name;
    private int pages;

    public Book(String a, int b) {
        name = a;
        pages = b;
    }
    public Book (String dn){
        name = dn;
        pages = 0;
    }
    public Book(int sz){
        name = "Red heat";
        pages = sz;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public String getName(String name){
        return name;
    }
    public int getPages(){
        return pages;
    }
    public String toString(){
        return "Book "+this.name+" has "+this.pages+" pages";
    }
    public void math(){
        System.out.println("we will read "+ name+ " for " + pages/5+" hours");
    }
}
