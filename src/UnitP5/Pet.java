package UnitP5;

public class Pet extends Animal{
    //instance variables - attributes
    private String name;
    private double size;

    //methods

    public Pet(String name, String type, double size) {
        super(type);
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String speak(){

        return " empty string ";
    }
}
