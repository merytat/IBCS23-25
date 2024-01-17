package UnitP3;

import java.util.Scanner;

public class RaterTester {
    public static void main(String[] args) {
        //Create three objects from Rater
        // using each of the three constructors
        Rater c1 = new Rater("Company 1", "Great Company", 5);
        Rater c2 = new Rater();
        Rater c3 = new Rater("Bad company", 2);
        Scanner kb = new Scanner(System.in);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c2.setName("Apple Inc.");

        System.out.println(c2.getName());

        c1.setRating(2);
        System.out.println(c1);
        c1.setRating(3);
        System.out.println(c1);
        c1.setRating(8);
        System.out.println(c1);

        c2.setRating(1);

        //check c2:
        if(c2.getRating() <= 0){
            System.out.println("Enter rating ");
            int rating = kb.nextInt();
            c2.setRating(rating);
            System.out.println(c2);
        }
        else if(c2.getRating() < 3 ){
            System.out.println(c2);
            System.out.println("Improve your service");
        }
        else if(c2.getRating() >= 3 ){
            System.out.println(c2);
            System.out.println("Good job");
        }
        else if(c2.getRating() > 5){
            c2.setRating(5);
            System.out.println(c2);
        }
        
    }
}
