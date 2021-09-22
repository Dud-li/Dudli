package task5;

public class FurnitureShop{
 private String material;
 private String country;
 private int num;
 private String name; 
 
 public FurnitureShop(String name, String material,String country, int num){
 this.name = name;
 this.material = material;
 this.country = country;
 this.num = num;
 }
 public void check(){
   if (this.name == "Стул" & this.num < 8 & this.country =="Россия" & this.material == "Берёза" || this.name == "Стол" & this.num < 13 & this.country =="Швеция" & this.material == "Дуб")
     System.out.println("Данные товары есть в наличии \n");
   else
     System.out.println("К сожалению, данных товаров нет :(");
 }
}
