package UnitP3;

import java.util.Scanner;

public class digitsDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer number: ");
        String number = input.nextLine();
        String b = "a";
        System.out.print("fg"+ b.substring(2)+"fg");
        System.out.println();

        while(number.length()>=1){
            System.out.println(number.charAt(0));
            number = number.substring(1);
            System.out.println(number);
        }
    }
}
