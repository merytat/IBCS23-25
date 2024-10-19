package UnitP5;

public class Fish extends Pet {
    private String waterType;

    public Fish(String name, String type, double size, String waterType) {
        super(name, type, size);
        this.waterType = waterType;
    }

    @Override
    public String speak(){
        return "blop blop";
    }
}
