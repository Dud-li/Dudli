package tasks.task7;

public class TestMovable {
    public static void main(String[] args){
        MovableRectangle r = new MovableRectangle(3,13,3,13,2,2);
        r.moveUp();
        r.moveRight();
        System.out.println(r);

        MovablePoint p = new MovablePoint(7,16,3,2);
        p.moveLeft();
        p.moveDown();
        System.out.println(p);

        MovableCircle c = new MovableCircle(9,9,3,4,2);
        c.moveLeft();
        c.moveRight();
        System.out.println(c);
    }
}
