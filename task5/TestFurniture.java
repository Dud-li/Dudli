package tasks.task5;
public class TestFurniture {

public static void main(String[] args) {
 
  Chair c = new Chair("Берёза", "Россия", 7);
  Table t = new Table("Дуб","Швеция", 13);
  FurnitureShop buyC = new FurnitureShop("Стол","Дуб","Швеция",1);
  FurnitureShop buyT = new FurnitureShop("Стул","Берёза","Россия",4);
  FurnitureShop not = new FurnitureShop("Кровать","Дуб","Швеция",1);
  buyC.check();
  buyT.check();
  not.check();
  System.out.println("Зато у нас есть: \n");
  c.outPut();
  t.outPut();

}
}
