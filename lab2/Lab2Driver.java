public class Lab2Driver
{
    public static void main(String[] args)
    {
        // 1
        // instantiate two new objects
        HotelRoom roomA = new HotelRoom();
        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");
        HotelRoom roomB = new HotelRoom();
        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");
        
        // 2
        roomA.setOccupied(1);
        roomA.setRate(100);
        roomB.setOccupied(0);
        roomB.setRate(80);

        // 1
        // print out using getters
        //System.out.println("Room A is " + String.valueOf(roomA.getRoomNumber()) + " and " + roomA.getRoomType());
        //System.out.println("Room B is " + String.valueOf(roomB.getRoomNumber()) + " and " + roomB.getRoomType());
    
        // 2
        // print out using toString
        System.out.println("Room A details are: " + roomA.toString());
        System.out.println("Room B details are: " + roomB.toString());

        // 3
        HotelRoom roomC = new HotelRoom(202, "Single", 0, 90);
        System.out.println("Room C details are: " + roomC.toString());

        // 4
        if (roomB.isOccupied())
        {
            System.out.println("Room B is taken!");
        }
        else
        {
            roomB.setOccupied(1);
        }
        System.out.println("Room B details are: " + roomB.toString());
    }
}