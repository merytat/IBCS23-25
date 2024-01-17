package UnitP2;

public class StudentRunner {
    public static void main(String[] args) {
        //create Student using
        //our new Student data Type (Class)
        Student bukhari = new Student("Bukhari", 11, "A4567");
        //bukhari.setStName("Bukhari");
        //bukhari.setGradeLevel(11); //unsafe


        Student maya = new Student("Maya", 11, "B2345");
        //maya.setStName("Maya");
        //maya.setGradeLevel(11);

        Student oliver = new Student("Oliver", 11);
        Student newbie = new Student();

        bukhari.printStudent();
        maya.printStudent();
    }
}
