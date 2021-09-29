package tasks.task6;

public class Planet implements Nameable{
    private String name;

    public Planet(String a){
        name=a;
    }

    public String getName(){
        return this.name;
    }
}
