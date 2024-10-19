package UnitP5;

public class Room {
    private int roomNumber;
    private int beds;
    private double price;
    private boolean isOccupied;

    public Room(int roomNumber, int beds, boolean isOccupied) {
        this.roomNumber = roomNumber;
        this.beds = beds;
        this.isOccupied = isOccupied;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
