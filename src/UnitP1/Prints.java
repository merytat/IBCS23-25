package UnitP1;

import java.util.Scanner;

public class Prints {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Number of pages: ");
        int noOfPages = kb.nextInt();
        System.out.print("Price per 100: ");
        double pricePer100 = kb.nextDouble();
        System.out.print("Price per page: ");
        double pricePerPage = kb.nextDouble();

        double price = (noOfPages / 100) * pricePer100 +
                (noOfPages % 100) * pricePerPage;
        System.out.println("Total Price: " + price);

    }
}
