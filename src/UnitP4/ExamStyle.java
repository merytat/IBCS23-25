package UnitP4;

import java.util.Scanner;

public class ExamStyle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] frq = new double[6];
        String[] names = new String[6];

        for(int i = 0; i<frq.length; i++){
            System.out.println("Enter frequency " + (i+1));
            frq[i] = input.nextDouble();
            input.nextLine(); //so it doesn't skip
            System.out.println("Enter the name of the station " + (i+1));
            names[i] = input.nextLine();
        }

        System.out.println("Enter the number of the station you want");
        int station = input.nextInt();
        System.out.println(names[station-1] + " - " + frq[station-1]) ;

        //find min, find max, calculate range
        double max = frq[0];
        double min = frq[0];
        for(int i = 1; i<frq.length; i++){
            if(frq[i] > max){
                max = frq[i];
            }
            if(frq[i] < min){
                min = frq[i];
            }
        }
        System.out.println("Range of frequencies = " + (max-min));

    }
}
