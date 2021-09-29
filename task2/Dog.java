package tasks.task2;
// import java.lang.*;

public class Dog {
    private String name;
    private int age;

    public Dog (String dn,int ag){
        name = dn;
        age = ag;
    }
    public Dog (String dn){
        name = dn;
        age = 0;
    }
    public Dog(){
        name = "Pup";
        age = 0;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return this.name+", age "+this.age;
    }
    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7);
    }
}
