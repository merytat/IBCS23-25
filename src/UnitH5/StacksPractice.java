package UnitH5;

import java.util.Stack;

public class StacksPractice {
    public static void main(String[] args) {
        Stack<Integer> books = new Stack<Integer>();

        System.out.println(books.isEmpty());
        books.push(4);
        books.push(6);
        books.push(10);
        System.out.println(books);
        System.out.println(books.pop());
        System.out.println(books);
        System.out.println(books.size());
        System.out.println(books.peek());
        System.out.println(books);
    }
}
