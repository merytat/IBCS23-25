package Mock;

public class House extends Property {
    private boolean hasYard;
    private static int noBuilt = 0; //indicate number of houses sold

    public House(String i, String a, String c, int p, boolean hY){
        super(i,a,c,p);
        hasYard = hY;
        noBuilt++;
    }

    public static int getNoBuilt(){
        return noBuilt;
    }

    public String getCity(){
        return super.getCity();
    }
}
