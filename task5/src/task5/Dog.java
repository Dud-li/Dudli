package task5;

public abstract class Dog {
  private String name;
 
  public Dog(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public abstract void outPut();
}

class Dachshund extends Dog {
  private String color;
  public Dachshund(String name,String color){
    super(name);
    this.color=color;
  }
  public void outPut(){
    System.out.println("У таксы по кличке " + super.getName() +" " + this.color + " шерсть");
    }
}  
class Corgi extends Dog {
  private String color;
  public Corgi(String name,String color){
    super(name);
    this.color=color;
  }
  public void outPut(){
    System.out.println("У корги по кличке " + super.getName() + " " + this.color + " шерсть");
  }
}


