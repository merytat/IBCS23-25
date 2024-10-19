package UnitP5.FF;

public class Car extends Vehicle{ //1 mark
    private static double hourlyFee = 20000; //1 mark

    public Car(String registration){ //1 mark
        //super(registration); //1 mark

    }

    //1 mark for get and set even if not static
    //1 mark for static

    public static void setHourlyFee(double hf){

    }
    public static double getHourlyFee(){
        return 0;
    }

    @Override
    public double pay(int hours){
        //1 mark for super
        // 1 mark for return with formula
        return super.pay(hours) + hours*hourlyFee;
    }

}
