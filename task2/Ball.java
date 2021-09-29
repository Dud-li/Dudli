package tasks.task2;

public class Ball {
    private String color;
    private int size;

    public Ball(String a, int b) {
        color = a;
        size = b;
    }
    public Ball (String dn){
        color = dn;
        size = 0;
    }
    public Ball(int sz){
        color = "Black";
        size = sz;
    }
    public void setColor(String color){
        this.color = color;
}
    public void setSize(int size) {
        this.size = size;
    }
    public String getColor(String color){
        return color;
    }
    public int getSize(){
        return size;
    }
    public String toString(){
        return "Ball has " +this.color+" color and "+this.size+" size";
    }
    public void math(){
        System.out.println("result of "+color+" ball = " + size*2);
    }
}

