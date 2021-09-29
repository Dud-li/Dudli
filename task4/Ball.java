package tasks.task4;

public class Ball {

    private double x;
    private double y;
    public Ball(double x,double y){
        this.x = x;
        this.y = y;
    }
    public Ball (){
        x = 12.3;
        y = 34.5;
    }
    public void setX(double x){
        this.x =x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setXY(double x,double y){
        this.x = x;
        this.y = y;
    }
    public void move (double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }
    public String toString(){
        return "Ball @ ("+this.x+","+this.y+")";
    }
}
