package tasks.task12;

public class Test {
    public static void main(String []args){
        Student[]student = new Student[10];
        long IDNumber[] = new long[10];
        for (int i =0;i<10;i++)
            student[i]= new Student((long)(Math.random()*1000000000*10));
        System.out.println("Неотсортированный список ID:");
        for (int i=0;i<10;i++) {
            System.out.println(student[i].getID());
            IDNumber[i]=student[i].getID();
        }
        for (int i=1;i<10;i++){
            long current = IDNumber[i];
            int j=i-1;
            while(j>=0 && current<IDNumber[j]) {
                IDNumber[j + 1] = IDNumber[j];
                j--;
            }
            IDNumber[j+1]=current;
        }
        System.out.println("\nОтсортированный:");
        for(int i=0;i<10;i++)
            System.out.println(IDNumber[i]);
    }
}
