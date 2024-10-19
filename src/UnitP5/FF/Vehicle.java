package UnitP5.FF;

public class Vehicle {
    private static final double ADMIN_FEE = 2000;

    public double pay(int hours){
        //return 1 mark
        //correct return 2 marks
        if(hours <= 5){
            return ADMIN_FEE;
        }
        return 0;
    }
}
