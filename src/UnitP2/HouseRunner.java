package UnitP2;

public class HouseRunner {
    public static void main(String[] args) {
        House h1 = new House("I345");
        House h2 = new House("H345");
        House h3 = new House("G345");
        House h4 = new House("I145");

        //call method
        h1.drawRoof();
        h1.drawBase();
        h1.drawPath();
        h2.drawRoof();
        h2.drawBase();
        h2.drawPath();
        h3.drawRoof();
        h3.drawCustomBase("MJTM");
        h3.drawPath();

        //change address
        h1.setAddress("H234");
        System.out.println(h1.getAddress());




    }
}
