package tasks.task7;

public class Square extends Rectangle{
public Square(){
  color = "yellow";
  filled = true;
  length= width =3;
}
public Square (double side){
  length =width =side;
}
public Square(String a,boolean b,double c){
  color =a;
  filled = b;
  length =width =c;
}
public void setSide(double side){
  length = width = side;
}
public double getSide(){
  return length;
}
public void setLength(double side){
  length = side;
}
public void setWidth(double side){
  width = side;
}
public String toString(){
  return "Квадрат: \nСторона: " + this.length +"\nЦвет: " + this.color;
}
}
