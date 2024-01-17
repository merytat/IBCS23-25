package UnitP1;

public class Volumes {
    public static void main(String[] args) {
        System.out.println("Sphere");
        double sphereR = 2.5;
        double sphereV = (4.0/3) * Math.PI * Math.pow(sphereR,3);
        System.out.println("Sphere radius: " + sphereR);
        System.out.println("Volume of sphere: " + sphereV);

        System.out.println("Trapezoid");
        double baseA = 2;
        double baseB = 4;
        double height = 3;
        double areaT = ((baseA + baseB)/2) * height;
        System.out.println("Base a: " + baseA);
        System.out.println("Base b: " + baseB);
        System.out.println("Height: " + height);
        System.out.println("Area of trapezoid: " + areaT);



    }
}
