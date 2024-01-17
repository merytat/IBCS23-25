package UnitP4;

public class PlayingWithArrays {
    public static void main(String[] args) {
        //Declare array
        //type [] name = { }
        String names[] = {"Vincent","Oliver","Maya",
        "Nazim", "Yahya"};
        double[] gpas = new double[5];
        gpas[0] = 4.0;
        gpas[1] = 2.0;
        gpas[2] = 4.3;
        gpas[3] = 4.2;
        gpas[4] = 0.2;

        //print an array
        System.out.println(names); //this doesn't work
        for(int i = 0; i < names.length; i++){
            System.out.print(names[i]+ ", ");
        }
        System.out.println();

        //take first space and put your name and your gpa
        names[0] = "Bukhari";
        gpas[0] = 4.3;
        System.out.println(names[0] + " : " + gpas[0] );

        //print total number of elements:
        System.out.println("Number of students: " +names.length);

        //print the last elements and its GPA (last index = length-1)
        System.out.println(names[names.length-1] + ": " +
                gpas[gpas.length-1]);

        //calculate and print the class average
        double total = 0;
        for(int i = 0; i< gpas.length;i++){
            total += gpas[i];
        }
        double average = total / gpas.length;
        System.out.println(average);

        //find and print the names of students with a GPA
        //higher than the average

        for( int i = 0; i< names.length; i++){
            if(gpas[i] > average){
                System.out.println(names[i]);
            }
        }


    }
}
