package UnitP2;

/*
Creating my first custom Data Type.
Student class will allow me to create individual students for different
purposes
 */
public class Student {
    //attributes
    private String stName;
    private int gradeLevel;
    private String address;

    //Constructor
    public Student(String name, int gl, String ad){
        //initialize your objects
        stName = name;
        gradeLevel = gl;
        address = ad;
    }

    public Student(String name, int gl){
        stName = name;
        gradeLevel = gl;
        address = "";

    }

    //default constructor
    public Student(){
        stName = "Guest";
        gradeLevel = 0;
        address = "";
    }

    //Accessor Methods
    public void setStName(String newName){

        //checking that newName is correct
        stName = newName;
    }

    public void setGradeLevel(int newGL){
        gradeLevel = newGL;
    }
    //methods
    /*
    Print information about a student
     */
    public void printStudent(){
        System.out.println("Student Name: " + stName);
        System.out.println("Grade Level: " + gradeLevel);

    }


}
