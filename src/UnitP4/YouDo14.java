package UnitP4;

import java.util.ArrayList;

public class YouDo14 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Sara");
        names.add("John");
        names.add("Sara");
        String[] list = new String[3];
        copyUnique(names,list);
    }

    public static void copyUnique(ArrayList<String> names,String[] list){
        //your code here
        int used = 0; //keep track of used indexes on list
        for(int i=0; i<names.size(); i++){ //loop over arrayList
            boolean duplicate = false;
            for(int j=0; j< list.length; j++){//loop over array
                if(names.get(i).equals(list[j])){
                    duplicate = true;
                }
            }
            //if duplicate is still false the name was not found
            if(duplicate == false){
                list[used] = names.get(i);
                used++;
            }
        }
    }
}
