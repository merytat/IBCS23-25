package UnitH5;

public class ExamStyle1 {
    public static void main(String[] args) {
        String names[] = {"Evans", "Tann", "Bush"};
        double scores[][] = {{7.9, 6.7, 7.2, 7.5, 7.5, 7.4, 7.2, 6.9},
                {9.3, 9.6, 9.1, 9.1, 8.9, 9.1, 10.0, 9.1},
                {7.2, 7.9, 6.9, 6.9, 6.9, 6.9, 6.9, 7.2}};
        averages(names,scores);

    }

    public static void averages(String names[], double scores[][]){
        for (int r = 0; r < scores.length; r++){
            double max = scores[r][0];
            double min = scores[r][0];
            double acc = 0;
            for(int c = 0; c < scores[0].length; c++){
                if(scores[r][c] > max){
                    max = scores[r][c];
                }
                if(scores[r][c] < min){
                    min = scores[r][c];
                }
                acc = acc + scores[r][c];
            }
            System.out.println(names[r]);
            System.out.println((acc-min-max)/6);

        }
    }
}
