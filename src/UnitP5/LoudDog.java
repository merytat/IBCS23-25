package UnitP5;

public class LoudDog extends Dog {

    public LoudDog(String name, boolean trained, String type, double size){
        super(name, trained, type, size);
    }

    public String speak(){
        return super.speak()+super.speak();}
}
