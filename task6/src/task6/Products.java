package task6;

public class Products implements Priceable,Nameable{
    private String kind;
    private int price;

    public Products(String a,int b){
        kind = a;
        price = b;
    }

    public int getPrice(){
        return price;
    }

    public String getName() {
        return kind;
    }
}
