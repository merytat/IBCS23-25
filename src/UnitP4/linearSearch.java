package UnitP4;

public class linearSearch {
    public static void main(String[] args) {
        String[] array = {"Apple", "Orange", "Apricot", "Pear"};
        System.out.println(find(array, "O")); //should print 2
    }

    public static int find(String[] arr, String letter){
        //linear search algorithm + counter algorithm

        //counter starts at 0
        int counter = 0;

        //traverse array
        for(int i = 0; i < arr.length - 1; i++){
            //if first letter of each element == value we are searching
            if(arr[i].substring(0,1).equals(letter)){
                //increase counter
                counter++;
            }
        }
        //return counter
        return counter;
    }
}
