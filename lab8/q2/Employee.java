public class Employee extends Person
{
    private double salary;

    public Employee(String name, double salary)
    {
        super(name);
        setSalary(salary);
    }

    @Override
    public String getDescription()
    {
        return "An employee with a salary of " + getSalary();
    }

    // setters and getters
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }
}
