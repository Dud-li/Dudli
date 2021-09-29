package tasks.task6;

public class Coffee implements Priceable{
    private String volume;
    private int price;

    public Coffee(String a,int b){
        volume = a;
        price = b;
    }

    public String getVolume() {
        return volume;
    }

    public int getPrice() {
        return price;
    }
}
