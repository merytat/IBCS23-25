package UnitP1;

public class Discount {
    public static void main(String[] args) {
        //declare and assign variables
        int noOfItems = 10;
        double pricePerItem = 12.3;
        double discount = 0.02;

        //calculate
        double total =  (noOfItems * pricePerItem)*(1-discount);

        //print output
        System.out.println("Number of Items: " + noOfItems);
        System.out.println("Price of item: " + pricePerItem);
        System.out.println("Discount: " + ((int)(discount*100)) + "%");
        System.out.println("Total price: " + total);

        int a = 5;
        System.out.println(a++);// 6
        System.out.println(a);
        System.out.println(++a); // 7
        System.out.println(a);
    }
}
