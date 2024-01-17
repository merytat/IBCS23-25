package UnitP1;
//import Scanner class to be able to use it
import java.util.Scanner;

public class Soccer {
    public static void main(String[] args) {
        //Declaring a Scanner object to allow for user input
        Scanner kb = new Scanner(System.in);

        //create a variable to store input
        //use appropriate Scanner method to read info
        System.out.print("Enter no. of wins: ");
        int wins = kb.nextInt();
        System.out.print("Enter no. of draws: ");
        int draws = kb.nextInt();
        System.out.print("Enter no of losses: ");
        int losses = kb.nextInt();

        //calculations and output
        System.out.println("Total Points: " + ((wins*3)
                +(draws)));

    }
}
