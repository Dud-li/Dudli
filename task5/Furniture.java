package tasks.task5;

public abstract class Furniture {
  private String material;
  private String country;
  
 public Furniture(String material,String country){
  this.material = material;
  this.country = country;
  }
 public String getMaterial(){
   return material;
 }
 public String getCountry(){
   return country;
 }
 public abstract void outPut();
}

class Chair extends Furniture{
  private int num; 
  public Chair(String material,String country,int num){
    super(material,country);
    this.num = num;
  }
  public void outPut(){
    System.out.println("Стулья: \nМатериал: " + super.getMaterial() +"\nСтрана-производитель: " + super.getCountry() + "\nКоличество: "+ this.num + "\n");
  }
}
class Table extends Furniture{
  private int num; 
  public Table(String material,String country,int num){
    super(material,country);
    this.num = num;
  }
  public void outPut(){
    System.out.println("Столы: \nМатериал: " + super.getMaterial() +"\nСтрана-производитель: " + super.getCountry() + "\nКоличество: "+ this.num + "\n");
  }
}
