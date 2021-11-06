package tasks.task7;

public class Circle extends Shape{
protected double radius;

public Circle(){
  color = "red";
  filled = false ;
  radius = 3.7;
}
public Circle(String a,boolean b,double c){
  color = a;
  filled = b;
  radius = c;
}
public void setRadius(double radius){
  this.radius = radius;
}
public double getRadius(){
  return radius;
}
public double getArea(){
  return 3.14*radius*radius;
}
public double getPerimeter(){
  return 2*3.14*radius;
}
public String toString(){
  return "Круг: \nРадиус: "+ this.radius +"\nЦвет: " + this.color + "\nПериметр: " + getPerimeter() + "\nПлощадь: " + getArea();
}
}
