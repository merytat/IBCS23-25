package UnitP5;

public class Dog extends Pet {


    private boolean trained;
    public Dog(String name, boolean trained, String type, double size){
        super(name, type, size);
        this.trained = trained;
    }

    @Override
    public String speak() {
        return "woof,woof";
    }
}
