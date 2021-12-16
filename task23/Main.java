package tasks.task23;

class Planet{
    String name;
    Planet(String name){
        this.name=name;
    }
}

public class Main {
    public static void main (String []args){
        Planet a=new Planet("earth");
        Planet b=new Planet("venus");
        Planet c= new Planet("uranus");
        Planet d=new Planet("mars");
        Planet e=new Planet("jupiter");
        int max=a.hashCode();
        String m=a.name;
        if (b.hashCode()>max){
            max=b.hashCode();
            m=b.name;
        }
        if (c.hashCode()>max){
            max=c.hashCode();
            m=c.name;
        }
        if (d.hashCode()>max){
            max=d.hashCode();
            m=d.name;
        }
        if (e.hashCode()>max){
            max=e.hashCode();
            m=e.name;}
        System.out.println("Наибольший хеш ("+max+") имеет "+m);
    }
}

