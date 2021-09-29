package tasks.task6;

public class Test {
    public static void main(String[] args){
        Planet a = new Planet("Сатурн");
        Planet b = new Planet("Юпитер");
        System.out.println(a.getName()+" "+b.getName());
        Country c = new Country("Великобритания");
        Country d = new Country("Норвегия");
        System.out.println(c.getName()+" "+d.getName());
        Products e = new Products("Молоко",73);
        System.out.println(e.getName()+" стоит "+ e.getPrice() +" рубля");
        Coffee f = new Coffee("Средний",120);
        System.out.println(f.getVolume()+" кофе стоит "+ f.getPrice() +" рублей");
    }
}
