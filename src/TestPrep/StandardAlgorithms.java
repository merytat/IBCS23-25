package TestPrep;

public class StandardAlgorithms {
    public static void main(String[] args) {

        int[] nums = new int[100];

        //1. create a var
        double average = 0;

        //fill with random
        for(int i=0; i< nums.length; i++){
            nums[i] = (int)(Math.random()*10);
            //2. accumulating
            average = average + nums[i];
        }

        System.out.print("[");
        for(int i:nums){
            System.out.print(i + " ");
        }
        System.out.println("]");

        //calculate average
        average = average / nums.length;
        System.out.println("Average: " + average);

        //Min and Max values
        int min = nums[0];
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if (nums[i] < min){
                min = nums[i];
            }
            if (nums[i] > max){
                max = nums[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        //find number of odd values
        int counterOdd = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] % 2 == 1){
                counterOdd++;
            }
        }
        System.out.println("Total No of Odds: " + counterOdd);

        //find and output the position of the first 4
        boolean found = false;
        int index = 0;
        while(found == false && index<nums.length){
            if(nums[index] == 4){
                found = true;
                System.out.println("4 founds at index "+ index);
            }
            index++;
        }

        index = 0;
        while(nums[index]!=4 && index<nums.length){
            index++;
        }
        System.out.println("4 founds at index "+ index);
    }
}
