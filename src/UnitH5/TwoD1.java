package UnitH5;

public class TwoD1 {
    public static void main(String[] args) {
        int[][] nums = new int[2][3];

        String[][] names = {{"Maya","Yahya","Oliver"},
                            {"empty1","Vincent","empty2"}};

        System.out.println(names[0][2]);

        String temp = names[0][0];
        names[0][0] = names[0][2];
        names[0][2] = temp;

        //arrays always loop
        //2d arrays always nested loops
        for(int i = 0; i < names.length; i++){ //loop rows
            for(int j = 0; j < names[0].length; j++){ //loop on col
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }

        //enhanced for loop?
        for(String[] row: names){
            for(String name: row){
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }
}
