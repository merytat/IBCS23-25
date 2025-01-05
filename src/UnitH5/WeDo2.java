package UnitH5;

public class WeDo2 {
    public static void main(String[] args) {
        int nums[][] = new int[4][5];

        for(int i=0; i<nums.length; i++){
            for(int j = 0; j<nums[0].length; j++){
                nums[i][j] = (int)((Math.random()*9)+1);

            }
        }

        for(int[] r: nums){
            for(int num: r){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
