package task3;

public class Circle {
    private int rad;
    private int length;

    public Circle(int a, int b) {
        rad = a;
        length = b;
        }
    public void setRad(int rad){
        this.rad = rad;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getRad(){
        return rad;
    }
    public int getNumofvert(){
        return length;
    }
    public String toString(){
        return "Circle of "+this.length +" length has radius = "+this.rad;
    }
}
