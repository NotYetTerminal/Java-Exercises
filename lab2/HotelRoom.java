// Implements a HotelRoom class
public class HotelRoom
{
    // 1
    // stores room number as int
    private int roomNumber;
    // stores room type as "Single" or "Double"
    private String roomType;

    // 2
    // stores whether occupied, 0 empty, 1 occupied
    private int occupied;
    // stores nightly rate
    private double rate;

    public HotelRoom()
    {
        roomNumber = 0;
        roomType = "";
        occupied = 0;
        rate = 0.0;
    }

    // 3
    public HotelRoom(int roomNumber, String roomType, int occupied, double rate)
    {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.occupied = occupied;
        this.rate = rate;
    }

    // 4
    public boolean isOccupied()
    {
        return occupied == 1;
    }

    // 1
    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }
    public void setRoomType(String roomType)
    {
        this.roomType = roomType;
    }

    public String getRoomType()
    {
        return roomType;
    }

    // 2
    public void setOccupied(int occupied)
    {
        this.occupied = occupied;
    }

    public int getOccupied()
    {
        return occupied;
    }

    public void setRate(double rate)
    {
       this.rate = rate;
    }

    public double getRate()
    {
        return rate;
    }

    public String toString()
    {
        return "Room number: " + String.valueOf(getRoomNumber()) + ", Room type: " + getRoomType() + ", Occupied: " + String.valueOf(getOccupied()) + ", Nightly rate: " + String.valueOf(getRate());
    }
}