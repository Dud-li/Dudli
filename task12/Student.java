package tasks.task12;

public class Student {
    long ID;
    int mark;
    public Student(int mark,long ID){
        this.mark = mark;
        this.ID = ID;
    }
    public Student(int mark){
        this.mark = mark;
    }
    public Student(long ID){
        this.ID=ID;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getID() {
        return ID;
    }

    public int getMark() {
        return mark;
    }
}
