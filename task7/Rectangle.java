package tasks.task7;

public class Rectangle extends Shape{
protected double length;
protected double width;

public Rectangle(){
  color = "black";
  filled = true;
  length = 13.7;
  width = 17.9;
}
public Rectangle(double a,double b){
  color = "white";
  filled = false;
  length = a;
  width = b;
}
public Rectangle(String a,boolean b,double c,double d){
  color = a;
  filled = b;
  length = c;
  width = d;
}
public void setLength(double length){
  this.length = length;
}
public void setWidth(double width){
  this.width = width;
}
public double getLength(){
  return length;
}
public double getWidth(){
  return width;
}
public double getArea(){
  return length*width;
}
public double getPerimeter(){
  return 2*(length+width);
}
public String toString(){
  return "Прямоугольник: \nДлина: "+ this.length+"\nШирина: "+ this.width +"\nЦвет: " + this.color + "\nПериметр: " + getPerimeter() + "\nПлощадь: " + getArea();
}
}
