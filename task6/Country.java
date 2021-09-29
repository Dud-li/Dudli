package tasks.task6;

public class Country implements Nameable{
    private String name;

    public Country(String a){
        name=a;
    }

    public String getName(){
        return this.name;
    }
}
