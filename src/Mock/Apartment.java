package Mock;

public class Apartment extends Property{
    private int floor;

    public Apartment(String i, String a, String c, int p, int f){
        super(i,a,c,p);
        this.floor = f;
    }
}
