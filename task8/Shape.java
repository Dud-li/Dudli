package tasks.task8;

import java.awt.Color;

abstract public class Shape {
    protected Color color;
    protected int x=0;
    protected int y=0;

    public void setColor(Color a) {
        color = a;
    }
    public void setXY(int a,int b){
        x=a;
        y=b;
    }
    public Color getColor() {
        return color;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
