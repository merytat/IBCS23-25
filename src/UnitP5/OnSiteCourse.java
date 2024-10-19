package UnitP5;

public class OnSiteCourse extends Course{
    private String classroomNumber;

    public OnSiteCourse (String classroomnumber, String coursename){
        super(coursename);
        this.classroomNumber = classroomnumber;
    }
    public String getClassroomNumber() {
        return classroomNumber;
    }

    public void setClassroomNumber(String classroomNumber) {
        this.classroomNumber = classroomNumber;
    }


}
