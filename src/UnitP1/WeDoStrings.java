package UnitP1;

import java.util.Scanner;

public class WeDoStrings {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = kb.nextLine();

        int length = word.length();
        String result = word.substring((length/2)-1,(length/2)+2);
        System.out.println("Middle letters: " +result);
        char a = '3';
        System.out.println(Character.isDigit(a));
    }
}
