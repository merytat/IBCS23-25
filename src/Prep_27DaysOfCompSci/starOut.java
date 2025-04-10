package Prep_27DaysOfCompSci;

public class starOut {
    public String starOut(String str) {
        String result = "";
        int len = str.length();
        for(int i = 0; i<len; i++){
            if (str.charAt(i) == '*') {
                continue;
            }
            if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            }
            if (i < len - 1 && str.charAt(i + 1) == '*') {
                continue;
            }

            result += str.charAt(i);

        }
        return result;
    }
}
