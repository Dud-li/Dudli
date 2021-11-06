package tasks.task7;

public abstract class Shape {
    protected  String color;
    protected  boolean filled;

    public Shape(String a, boolean b) {
        color = a;
        filled = b;
    }
    public Shape(){
        color = "blue";
        filled = true;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean b) {
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public boolean isFilled(){
        return filled;
    }
    public abstract double getArea();
    public abstract String toString();
    public abstract double getPerimeter();

}
