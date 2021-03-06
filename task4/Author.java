package tasks.task4;

public class Author {

    private String name;
    private String email;
    private char gender;

    public Author(String name,String email,char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return this.name+" ("+this.gender+ ") at"+ this.email;
    }
}
