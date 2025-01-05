package UnitH5;

public class Transposing {
    public static void main(String[] args) {
        int[][] nums = {{2,3,4}, {5,6,7}};
        int[][] numsT = transpose(nums);

        for(int i=0; i<numsT.length; i++){
            for(int value: numsT[i]){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] nums){
        int[][] numsT = new int[nums[0].length][nums.length];
        for(int i=0; i< nums.length; i++){
            for(int j=0; j< nums[0].length; j++){
                numsT[j][i] = nums[i][j];
            }
        }

        return numsT;
    }


}
