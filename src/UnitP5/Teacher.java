package UnitP5;

public class Teacher {
    private String name;
    private double salary;
    private Course[] courses;

    public Teacher(String name, double salary, int numCourses){
        this.name = name;
        this.salary = salary;
        courses = new Course[numCourses];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
