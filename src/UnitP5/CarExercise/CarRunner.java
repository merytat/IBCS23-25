package UnitP5.CarExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class CarRunner {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<Car>();

        System.out.println("Please enter a car model name(exit to quit):");
        String input = kb.nextLine();
        while(! input.equals("exit")){
            System.out.println("Is this car electric? (y or n)");
            String electric = kb.nextLine();
            if(electric.equals("n")){
                System.out.println("How many miles per gallon:");
                String mpergalon = kb.nextLine();
                cars.add(new Car(input,mpergalon));
            }
            cars.add(new ElectricCar(input));
            System.out.println("Please enter a car model name(exit to quit):");
            input = kb.nextLine();
        }

        for (Car c: cars){
            System.out.println("Car: " + c.getModel());
            System.out.println("MPG: " + c.getMPG());
        }

    }
}
