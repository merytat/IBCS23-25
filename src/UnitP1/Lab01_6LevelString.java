package UnitP1;

import java.util.Scanner;

public class Lab01_6LevelString {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a three-digit Integer: ");
        String number = kb.next();
        int total = 0;

        int ones = Integer.parseInt(number.substring(2));
        int tens = Integer.parseInt(number.substring(1,2));
        int hundreds = Integer.parseInt(number.substring(0,1));

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
