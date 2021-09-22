package pj2;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball(17.2, 23.5);
        System.out.println(b);
        b.move(12.2, 84.3);
        System.out.println(b);
    }
}
