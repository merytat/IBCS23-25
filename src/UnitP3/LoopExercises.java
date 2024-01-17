package UnitP3;

import java.util.Scanner;

public class LoopExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //control variable?
        System.out.println("Enter grade (0 to quit");
        double grade = input.nextDouble();
        //max and min algorithm
        double max = grade;
        double min = grade;

        //counter and accumulator
        int counter = 0;
        double total = 0;

        //what needs to be repeated?
        while(grade != 0 && counter < 3){
            counter++;
            total += grade;
            if(grade > max){
                max = grade;
            }
            if(grade < min){
                min = grade;
            }
            System.out.println("Enter grade (0 to quit");
            grade = input.nextDouble();
        }

        System.out.println("The average is: " + total/counter);
        System.out.println("The max grade is: " + max);
        System.out.println("The min grade is: " + min);

    }
}
