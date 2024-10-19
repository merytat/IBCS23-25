package UnitP4;

import java.util.ArrayList;
import java.util.Arrays;

public class Employees {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Tellez");
        names.add("Mery");
        names.add("Asker");
        names.add("Nazim");

        String[] lNames = new String[300];
        String[] fNames = new String[300];
        int counter = 0;

        for( int i = 0; i< names.size()-1; i+=2){
            lNames [counter] = names.get(i);
            fNames [counter] = names.get(i+1);
            counter++;
        }

        System.out.println(Arrays.toString(fNames));
        System.out.println(Arrays.toString(lNames));

    }
}
