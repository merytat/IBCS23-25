package UnitP5.FF;

public class Vehicle {
    private static final double ADMIN_FEE = 2000;
    private String licensePlate;
    private int numberOfSeats;
    private String make;


    public Vehicle(String make) {
        //missing code
    }

    /**
     *
     * @param customString
     *
     * write a method generateLicense: combine a given customString with a random
     * number and set a new license plate for the user
     */

    public double pay(int hours){
        //return 1 mark
        //correct return 2 marks
        if(hours <= 5){
            return ADMIN_FEE;
        }
        return 0;
    }
}

class VehicleTester {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Renault");
        double p = v1.pay(5);
        System.out.println(v1.pay(6));

    }
}
