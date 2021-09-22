package task;

public class testShape {
    public static void main(String[] args){
        Shape s1 = new Shape("Blue",3);
        Shape s2 = new Shape(5);
        Shape s3 = new Shape("White");
        s3.setNumofvert(7);
        s2.setColor("Black");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

