import java.util.Scanner;

public class MyHr
{
    public static void main(String[] args)
    {
        Office[] officesArray = {new Office(),  new Office(),  new Office()};
        Employee[] employeesArray;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number of employees to create (max 5): ");
        int numberOfEmployees = Integer.valueOf(scanner.nextLine());
        if (numberOfEmployees > 5)
        {
            numberOfEmployees = 5;
        }
        employeesArray = new Employee[numberOfEmployees];

        for (int index = 0; index < numberOfEmployees; index++)
        {
            System.out.println("Input Address");
            System.out.print("Street: ");
            String street = scanner.nextLine();
            System.out.print("Town: ");
            String town = scanner.nextLine();
            System.out.print("County: ");
            String county = scanner.nextLine();
            Address tempAddress = new Address(street, town, county);

            System.out.print("\"Staff\" or \"Manager\": ");
            String employeeType = scanner.nextLine();

            String carType = "N\\A";

            if (employeeType.equals("Manager"))
            {
                System.out.print("Car type: ");
                carType = scanner.nextLine();
            }

            System.out.print("Office 1, 2 or 3: ");
            int officeNumber = Integer.valueOf(scanner.nextLine());

            Employee tempEmployee = new Employee(tempAddress, employeeType, carType, officeNumber);
            employeesArray[index] = tempEmployee;
            officesArray[officeNumber - 1].assignEmployee(tempEmployee);
        }

        System.out.println("Number of employees: " + Employee.getNumberOfEmployees());
        System.out.println("Number of employees: " + officesArray[0].getNumberOfEmployees());
        System.out.println("Employee records:\n" + officesArray[0].getEmployeeRecords());
        
        
        System.out.println(employeesArray[0].toString());
        System.out.println(officesArray[0].toString());
        
        scanner.close();
    }
}