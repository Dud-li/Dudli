package tasks.task5;

public abstract class Dish {
  private int size;
  private String color;
 
  public Dish(String color,int size){
    this.color = color;
    this.size = size;
  }
  public String getColor(){
    return color;
  }
  public int getSize(){
    return size;
  }
  public abstract void outPut();
}

class Plates extends Dish {
  private int num;
  public Plates(String color,int size,int num){
    super(color,size);
    this.num=num;
  }
  public void outPut(){
    System.out.println("Тарелки " + super.getSize() + "-ого размера в количестве " + this.num + " шт имеют " + super.getColor() + " цвет");
    }
}  
  class Cups extends Dish {
  private int num;
  public Cups(String color,int size,int num){
    super(color,size);
    this.num=num;
  }
  public void outPut(){
    System.out.println("Чашки " + super.getSize() + "-ого размера в количестве " + this.num + " шт имеют " + super.getColor() + " цвет");
  }
}
