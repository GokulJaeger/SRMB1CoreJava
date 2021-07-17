package week1.day2;

public class RoomDetails {
    public static void main(String[] args) {
        Room r1 = new Room();
        Room r2 = new Room();

        r1.setData(14, "Master Bedroom", 500, true);
        r2.setData(8, "Master Hall", 600, false);

        
        r1.displayData();
        r2.displayData();
    }
}
