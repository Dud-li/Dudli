package task3;

public class Book {
 private String author;
 private String name;
 private int year;
 
 public Book(String a,String b,int c){
   author=a;
   name=b;
   year=c;
 }
 public void setAuthor(String author){
   this.author=author;
 }
 public void setName(String name){
   this.name = name;
 }
 public void setYear(int year){
   this.year=year;
 }
 public String getAuthor(){
   return author;
 }
 public String getName(){
   return name;
 }
 public int getYear(){
   return year;
 }
 public String toString(){
        return this.author+" написал книгу "+this.name +" в " +this.year + " году";
}
}