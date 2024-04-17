package UnitP4;

public class BinarySearchPractice {
    public static void main(String[] args) {
        int[] arr = {11,12,15,16,102,110};
        System.out.println(binarySearch(arr, 110));

    }

    public static int binarySearch(int arrayNum[], int valueSearched) {
        int min = 0;
        int max = arrayNum.length-1;
        boolean found = false;
        int answer = -1;
        int mid = 0;

        while (found == false && min <= max){
            mid = (min+max)/2;
            if (arrayNum[mid]== valueSearched){
                found = true;
                answer = mid;
            } else if (valueSearched > arrayNum[mid]) {
                min = mid+1;
            } else{
                max = mid-1;
            }
        }

        return answer;
    }

}
