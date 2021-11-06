package tasks.task7;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(int a,int b,int c,int d){
        x=a;
        y=b;
        xSpeed =c;
        ySpeed =d;
    }
    public String toString(){
        return "Координаты точки ("+ this.x +";"+ this.y+")";
    }
    public void moveUp(){
        y+=ySpeed;
    }
    public void moveDown() {
        y-=ySpeed;
    }
    public void moveLeft() {
        x-=xSpeed;
    }
    public void moveRight() {
        x+=xSpeed;
    }
}
