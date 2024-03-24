package UnitP4;

import java.util.*;

public class Dictionary {
    ArrayList<String> words;

    public Dictionary(){
        words = new ArrayList();
    }

    public void insertWord(String word, int i){
        words.add(i,word);
    }

}
