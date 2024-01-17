package UnitP2;

public class Teacher {
    //attributes
    private String name;
    private double salary;
    private int yearsOfService;
    private String department;

    //default constructor
    public Teacher(){
        name = "N/A";
        salary = 0.0;
        yearsOfService = 0;
        department = "N/A";
    }

    public Teacher(String name, double salary,
                   int yearsOfService, String department){
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
        this.department = department;
    }

    //getters and setters
    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public int getYearsOfService(){
        return this.yearsOfService;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setName(String name){
        this.name = name;
    }

    public  void setYearsOfService(int yearsOfService){
        this.yearsOfService = yearsOfService;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    //toString
    //does not need to be called
    public String toString(){
        return this.name + ", " + this.department;
    }

    /*
        increases the salary by a given percentage
        per years of service
        pre: @param percentage between 0-1
        post: salary will be updated
     */
    public void increaseSalary(double percentage){
        salary = salary * Math.pow((1+percentage),yearsOfService);
    }

    /*
        calculate and returns the net salary for a given tax
        pre: @param tax between 0-1
        post: @return netSalary
     */
    public double getNetSalary(double tax){
        double netSalary = salary * (1-tax);
        return netSalary;
    }




}
