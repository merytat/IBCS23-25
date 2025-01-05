package UnitH5;

public class youdo1 {
    public static void main(String[] args) {
        int[] nums = {15, 21, 9, 20, 10, 30};

        for(int num: nums){
            if (num % 3 == 0 ^ num % 5 == 0){
                System.out.println(num);
            }
        }
    }
}
