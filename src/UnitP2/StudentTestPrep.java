package UnitP2;

public class StudentTestPrep {
    //attributes
    private String name;
    private String schlcode;
    private static int enrollcnt = 0;
    private static int noCourses = 0;
    private String stdcode;

    //constructor
    public StudentTestPrep (int noCourses,
                            String name,
                            String schlcode,
                            String stdcode) {
        this.name = name;
        this.schlcode = schlcode;
        this.stdcode = stdcode;
        this.enrollcnt = enrollcnt + 1;
        this.noCourses = this.noCourses + noCourses;
    }

    public static int getEnrollcnt(){
        return enrollcnt;
    }
}
