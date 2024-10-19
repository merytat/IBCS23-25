package UnitP5;

import java.util.ArrayList;

public class HotelRunner {
    public static void main(String[] args) {
        Room[] allRooms = new Room[10];
        allRooms[0] = new Room(12,2,false);
        allRooms[1] = new Room(13,2,false);
        allRooms[2] = new Room(14,2,true);
        allRooms[3] = new Room(15,1,false);
        System.out.println(findRooms(allRooms));

    }

    public static ArrayList<Integer> findRooms(Room[] allRooms){
        ArrayList<Integer> roomNumbers = new ArrayList<Integer>();
        for(int i = 0; i < allRooms.length; i++){
            if(allRooms[i].getBeds() == 2 && !allRooms[i].isOccupied()){
                roomNumbers.add(allRooms[i].getRoomNumber());
            }
        }
        return roomNumbers;
    }
}
