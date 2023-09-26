public abstract class Person
{
    private String name;

    public Person(String name)
    {
        setName(name);
    }

    public abstract String getDescription();

    // setters and getters
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}