package UnitP2;

public class Circle {
    //attributes
    private String color;
    private double radius;

    //constructors
    public Circle(){
        this.radius = 1;
        this.color = "black";
    }

    public Circle(String color, double radius){
        this.radius = radius;
        this.color = color;
    }

    //methods
    public void setColor(String newColor) {
        this.color =newColor;
    }
}
