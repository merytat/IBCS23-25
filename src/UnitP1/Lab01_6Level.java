package UnitP1;

import java.util.Scanner;

public class Lab01_6Level {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a three-digit Integer: ");
        int number = kb.nextInt();

        int ones = number%10;
        number = number/10;
        int tens = number%10;
        int hundreds = number/10;
        int total = 0;

        System.out.println("Ones digits: " + ones);
        total+= ones;
        System.out.println("Current total: " + total);
        System.out.println();
        System.out.println("Tens digits: " + tens);
        total+= tens;
        System.out.println("Current total: " + total);
        System.out.println();
        System.out.println("Hundreds digits: " + hundreds);
        total+= hundreds;
        System.out.println("Current total: " + total);

    }
}
