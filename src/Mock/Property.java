package Mock;

public class Property {
    private String ID;
    private String address;
    private String city;
    private int price;

    public Property(String ID, String address, String city, int price) {
        this.ID = ID;
        this.address = address;
        this.city = city;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
