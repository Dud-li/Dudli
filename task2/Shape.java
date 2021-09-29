package tasks.task2;

public class Shape {
    private String color;
    private int numofvert;

    public Shape(String a, int b) {
        color = a;
        numofvert = b;
    }
    public Shape(String dn){
        color = dn;
        numofvert = 0;
    }
    public Shape(int sz){
        color = "Red";
        numofvert = sz;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setNumofvert(int numofvert) {
        this.numofvert = numofvert;
    }
    public String getColor(){
        return color;
    }
    public int getNumofvert(){
        return numofvert;
    }
    public String toString(){
        return "Shape of "+this.color +" color has "+this.numofvert+" vertices";
    }
}
