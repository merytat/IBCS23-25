package UnitP1;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Age: ");
        int age = input.nextInt();
        input.nextLine(); //read the enter
        System.out.print("Birthday: ");
        String bd = input.nextLine();

        System.out.println("You are " + age +
                " years old. On " + bd +
                " you will be " + (age+1));
    }
}
