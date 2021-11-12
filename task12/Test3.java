package tasks.task12;

public class Test3 {
    public static void main(String[] args) {
        MergeAndSort sort = new MergeAndSort();
        Student[] students1 = new Student[10];
        Student[] students2 = new Student[10];
        for (int i = 0; i < students1.length; i++) {
            students1[i] = new Student((int) (Math.random() * 4 + 2));
            students1[i].setID((long)(Math.random()*1000000000*10));
        }
        for (int i = 0; i < students2.length; i++) {
            students2[i] = new Student((int) (Math.random() * 4 + 2));
            students2[i].setID((long)(Math.random()*1000000000*10));
        }
        Student[] students3 = sort.merge(students1, students2, 20);
        System.out.println("Неотсортированный список оценок и ID студента:");
        for (int i = 0; i < 20; i++) {
            System.out.println(students3[i].getMark() +"-"+students3[i].getID());
        }
        sort.mergeSort(students3, 0, students3.length - 1);
        System.out.println("\nОтсортированный по оценкам список и ID студента:");
        for (int i = 0; i < students3.length; i++) {
            System.out.println(students3[i].getMark() +"-"+students3[i].getID());
        }
    }
}
