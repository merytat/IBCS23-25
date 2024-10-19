package UnitP5;

public class Classroom {
    private Teacher t;
    private Student[] students;
    private final int MAX_CAPACITY = 20;

    public Classroom(Teacher t){
        this.t = t;
        this.students = new Student[MAX_CAPACITY];
    }

    public Teacher getT() {
        return t;
    }

    public void setT(Teacher t) {
        this.t = t;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getMAX_CAPACITY() {
        return MAX_CAPACITY;
    }
}
