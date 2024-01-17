package UnitP2;

import java.util.Scanner;

public class TeacherRunner {
    public static void main(String[] args) {
        Teacher mt = new Teacher();


        StudentTestPrep oliver = new StudentTestPrep(
                6, "Oliver",
                "TKS", "S0001");

        System.out.println(StudentTestPrep.getEnrollcnt());

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String tName = kb.nextLine();
        System.out.println("Enter the salary: ");
        double tSalary = kb.nextDouble();
        System.out.println("Enter the years of service: ");
        int tYOS = kb.nextInt();
        kb.nextLine();
        System.out.println("Enter the department: ");
        String tDep = kb.nextLine();
        Teacher t2 = new Teacher(tName,tSalary,
                tYOS,tDep);

        //print the teachers' names
        System.out.println(mt.getName());
        System.out.println(t2.getName());

        //using the setter
        mt.setName("Mery Tellez");
        System.out.println(mt.getName());

        //printing an objects calls the
        // toString method
        System.out.println(t2);


    }
}
