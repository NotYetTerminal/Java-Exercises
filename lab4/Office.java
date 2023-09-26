import java.util.Arrays;

public class Office
{
    private int roomNumber;
    private int numberOfEmployees;
    private Employee[] employeesArray;

    private static int numberOfRooms = 0;

    public Office()
    {
        setRoomNumber(100 + numberOfRooms);
        setNumberOfEmployees(0);
        setEmployeesArray(new Employee[2]);
        setNumberOfRooms(numberOfRooms + 1);
    }

    public void assignEmployee(Employee employee)
    {
        if (numberOfEmployees != 2)
        {
            employeesArray[numberOfEmployees] = employee;
            numberOfEmployees += 1;
        }
        else
        {
            System.out.println("Office full!");
            System.out.println(toString());
        }
    }

    // setters and getters
    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }

    public void setNumberOfEmployees(int numberOfEmployees)
    {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees()
    {
        return numberOfEmployees;
    }

    public void setEmployeesArray(Employee[] employeesArray)
    {
        this.employeesArray = employeesArray;
    }

    public Employee[] getEmployeesArray()
    {
        return employeesArray;
    }

    // returns the employee records as one String
    public String getEmployeeRecords()
    {
        return Arrays.toString(employeesArray);
    }

    public static void setNumberOfRooms(int numberOfRooms)
    {
        Office.numberOfRooms = numberOfRooms;
    }

    public static int getNumberOfRooms()
    {
        return numberOfRooms;
    }

    public String toString()
    {
        return "Room number: " + getRoomNumber() +
               "\nNumber of employees: " + getNumberOfEmployees() +
               "\nEmployee records:\n" + getEmployeeRecords();
    }
}