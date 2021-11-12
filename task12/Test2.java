package tasks.task12;

public class Test2 {
    public static void main(String []args){
        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        Student [] students = new Student[10];
        for (int i =0;i<10;i++){
            students[i]=new Student((int)(Math.random()*4+2));
        }
        System.out.println("Неотсортированный список оценок:");
        for(int i = 0;i < 10;i++){
            System.out.println(students[i].getMark());
        }
        sort.quicksort(students,0,students.length-1);
        System.out.println("\nОтсортированный список оценок:");
        for(int i = 0;i < 10;i++){
            System.out.println(students[i].getMark());
        }
    }
}
