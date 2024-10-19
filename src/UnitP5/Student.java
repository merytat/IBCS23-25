package UnitP5;

public class Student {
    private String name;
    private double GPA;
    private Course[] courses;

    public Student(String name, double GPA, int numberOfCourses) {
        this.name = name;
        this.GPA = GPA;
        this.courses = new Course[numberOfCourses];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
