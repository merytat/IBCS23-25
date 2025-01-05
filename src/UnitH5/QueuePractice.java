package UnitH5;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<String> bathroomLine = new LinkedList<>();
        bathroomLine.add("Maya");
        bathroomLine.add("Carl");
        bathroomLine.add("Yahya");
        bathroomLine.add("Mery");

        while (!bathroomLine.isEmpty()) {
            System.out.println(bathroomLine.poll());
        }
    }

    public static void pigLatin(String word){
        //add each character to a queue
        //create a pig latin version of the word
        //print the new word
        //enqueue - add()
        //dequeue - poll()


    }
}
