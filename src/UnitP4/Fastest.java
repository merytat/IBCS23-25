package UnitP4;

public class Fastest {
    public static void main(String[] args) {
        double times[] = {3, 4, 5, 6, 7, 8, 8, 9, 12, 13, 15, 16, 17};
        double fastest[] = transfer(times);
        for(int i=0; i < fastest.length; i++){
            System.out.println(fastest[i]);
        }
    }

    // returns array of double with 10 fastest times on times
    //PRE: Times is NOT sorted (smallest to largest)
    public static double[] transfer(double times[]){
        double fastest[] = new double[10];
        double smallest;
        int sindex;
        for(int i = 0; i < 10; i++){
            smallest = times[i];
            sindex = i;
            for(int j=i+1; j<times.length; j++){
                if (times[j] < smallest){
                    smallest = times[j];
                    sindex = j;
                }
            }
            //swap values
            double temp = times[i];
            times[i] = times[sindex];
            times[sindex] = temp;
            //move sorted value to new array
            fastest[i] = times[i];
        }
        return fastest;
    }
}
