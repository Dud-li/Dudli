package tasks.task7;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int a,int b,int c,int d,int e){
        center = new MovablePoint(a,b,c,d);
        radius = e;
    }
    public String toString(){
        return "Координаты центра круга ("+center.x+";"+center.y +")\nРадиус круга: "+ radius;
    }
    public void moveUp() {
     center.moveUp();
    }
    public void moveDown() {
        center.moveDown();
    }
    public void moveLeft(){
        center.moveLeft();
    }
    public void moveRight() {
        center.moveRight();
    }
}
