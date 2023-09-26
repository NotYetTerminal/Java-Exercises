public class TestPerson
{
    public static void main(String[] args)
    {
        Person[] personArray = new Person[2];

        Person employee = new Employee("Alice", 20000);
        personArray[0] = employee;

        Person student = new Student("Bob", "Cooking");
        personArray[1] = student;

        System.out.println("Name: " + personArray[0].getName() + ". " + personArray[0].getDescription());
        System.out.println("Name: " + personArray[1].getName() + ". " + personArray[1].getDescription());
    }
}
