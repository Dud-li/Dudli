package pj1;

public class testBall {
    public static void main(String[] args){
        Ball b1 = new Ball("Red",5);
        Ball b2 = new Ball(7);
        Ball b3 = new Ball("Black");
        b3.setSize(3);
        b2.setColor("Blue");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        b2.math();
    }
}
