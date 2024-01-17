package UnitP3;

public class Methods {
    //no attributes

    //no constructors

    //all static methods
    public static boolean nutsParty(int nuts, boolean isWeekend) {
        if (nuts >= 40) {
            if (nuts <= 60) {
                return true;
            } else if (isWeekend == true) {
                return true;
            } 

        }

        return false;
    }
}
