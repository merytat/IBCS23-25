package UnitP2;

public class City {
    private String name;
    private static int cityCounter = 0;

    public City(String name){
        this.name = name;
        cityCounter++;
    }

    public void setName(String name){
        this.name = name;
    }

    public static int getCityCounter(){
        return cityCounter;
    }

    public String toString(){
        return "City name: " + name;
    }
}

class CityTester{
    public static void main(String[] args) {
        City paris = new City("Paris");
    }
}
