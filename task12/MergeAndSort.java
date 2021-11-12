package tasks.task12;

public class MergeAndSort {
    SortingStudentsByGPA sort = new SortingStudentsByGPA();
    public Student[] merge(Student[] students1,Student[] students2,int n){
        Student [] students3 = new Student[n];
        for (int i=0;i<n/2;i++)
            students3[i]=students1[i];
        for (int i=n/2;i<n;i++)
            students3[i]=students2[i-n/2];
        return students3;
    }
    public void mergeSort(Student[] student, int left, int right) {
        if (right <= left) return;
        int mid = (left + right) / 2;
        mergeSort(student, left, mid);
        mergeSort(student, mid + 1, right);
        mergeS(student, left, mid, right);
    }
    private void mergeS(Student[] student, int left, int mid, int right) {
        int lengthLeft = mid - left + 1;
        int lengthRigiht = right - mid;
        Student[] leftStudents = new Student[lengthLeft];
        Student[] rightStudent = new Student[lengthRigiht];
        for (int i = 0; i < lengthLeft; i++) {
            leftStudents[i] = student[left + i];
        }
        for (int i = 0; i < lengthRigiht; i++) {
            rightStudent[i] = student[mid + i + 1];
        }
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = left; i < right + 1; i++) {
            if (leftIndex < lengthLeft && rightIndex < lengthRigiht) {
                if (sort.compare(leftStudents[leftIndex], rightStudent[rightIndex]) > 0) {
                    student[i] = leftStudents[leftIndex];
                    leftIndex++;
                } else {
                    student[i] = rightStudent[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < lengthLeft) {
                student[i] = leftStudents[leftIndex];
                leftIndex++;
            } else if (rightIndex < lengthRigiht) {
                student[i] = rightStudent[rightIndex];
                rightIndex++;
            }
        }
    }
}
