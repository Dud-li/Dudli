package tasks.task7;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveRight();
    }
    public String toString() {
        return "Точка A с координатами (" + topLeft.x + ";" + topLeft.y + ")\nТочка B с координатами (" + bottomRight.x + "," + bottomRight.y + ")";
    }
}