package UnitP4;

import java.util.ArrayList;

public class playingwArrayLists {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Double> gpas = new ArrayList<Double>();

        //adding elements
        names.add("Oliver");
        gpas.add(3.5);
        names.add("Maya");
        gpas.add(4.0);
        names.add("Vincent");
        gpas.add(4.2);
        names.add("Ahmed");
        gpas.add(2.5);
        names.add("Abed");
        gpas.add(3.4);

        //print ArrayLists - toString
        System.out.println(names);
        System.out.println(gpas);

        //print 1st element of both arrayLists
        System.out.println(names.get(0) + ": "+ gpas.get(0));

        //add in a specific location
        names.add(1,"Carlitos");
        gpas.add(1,4.0);

        System.out.println(names);
        System.out.println(gpas);

        //remove the last element on each list
        System.out.println(names.size()); //6
        names.remove(names.size()-1);
        gpas.remove(gpas.size()-1);
        System.out.println(names.size()); //5
    }
}
