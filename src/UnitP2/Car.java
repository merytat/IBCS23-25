package UnitP2;

public class Car {
    //attributes
    private String make;
    private String model;
    private int numDoor;
    private double speed;
    private double price;

    //constructors
    public Car(int numDoor, double speed, double price) {
        this.numDoor =  numDoor;
        this.speed = speed;
        this.price = price;
        this.model = "unknown";
        this.make = "unknown";

    }

    public Car(String make, String model, int numberOfDoors){
        this.make = make;
        this.model = model;
        this.numDoor = numberOfDoors;
        this.speed = 90;
        this.price = 0;

    }

    //default constructor
    public Car(){
        this.make = "unknown";
        this.model = "unknown";
        this.numDoor = 4;
        this.speed = 90;
        this.price = 0;

    }

    public Car(String m, String mo, double s, double p){
        this.make = m;
        this.model = mo;
        this.numDoor = 4;
        this.speed = s;
        this.price = p;


    }
}
