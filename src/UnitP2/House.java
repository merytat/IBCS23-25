package UnitP2;

public class House {
    //attributes
    private String address;

    //constructor
    public House(String address){
        this.address = address;
    }

    //Accessor methods
    public void setAddress(String newAdress){
        this.address = newAdress;
    }

    public String getAddress(){
        return address;
    }


    //method
    public void drawRoof(){
        System.out.println("    /\\ ");
        System.out.println("   /  \\ ");
        System.out.println("  /    \\ ");
        System.out.println(" /______\\ ");
    }

    //draw a Base with a custom plate
    public void drawCustomBase(String custom){
        System.out.println(" | " + custom +" | ");
        System.out.println(" |      | ");
        System.out.println(" |______| ");
    }

    public void drawBase(){
        System.out.println(" | " + address +" | ");
        System.out.println(" |      | ");
        System.out.println(" |______| ");
    }

    public void drawPath(){
        System.out.println("    **    ");
        System.out.println("    *************    ");
    }
}
