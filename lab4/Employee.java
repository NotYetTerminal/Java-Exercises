public class Employee
{
    private int employeeNumber;
    private Address address;
    private String employeeType;
    private String carType;
    private int officeNumber;

    private static int numberOfEmployees = 0;

    public Employee(Address address, String employeeType, String carType, int officeNumber)
    {
        setEmployeeNumber(1000 + numberOfEmployees);
        setAddress(address);
        setEmployeeType(employeeType);
        setCarType(carType);
        setOfficeNumber(officeNumber);
        setNumberOfEmployees(numberOfEmployees + 1);
    }

    // setters and getters
    public void setEmployeeNumber(int employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }

    public int getEmployeeNumber()
    {
        return employeeNumber;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setEmployeeType(String employeeType)
    {
        this.employeeType = employeeType;
    }

    public String getEmployeeType()
    {
        return employeeType;
    }

    public void setCarType(String carType)
    {
        this.carType = carType;
    }

    public String getCarType()
    {
        return carType;
    }

    public void setOfficeNumber(int officeNumber)
    {
        this.officeNumber = officeNumber;
    }

    public int getOfficeNumber()
    {
        return officeNumber;
    }

    public static void setNumberOfEmployees(int numberOfEmployees)
    {
        Employee.numberOfEmployees = numberOfEmployees;
    }

    public static int getNumberOfEmployees()
    {
        return numberOfEmployees;
    }

    public String toString()
    {
        return "Employee number: " + getEmployeeNumber() +
               "\nAddress: " + getAddress() +
               "\nEmployee type: " + getEmployeeType() +
               "\nCar type: " + getCarType() +
               "\nOffice number: " + getOfficeNumber();
    }
}
