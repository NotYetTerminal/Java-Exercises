public class Vet
{
    private String name;

    public Vet(String name)
    {
        setName(name);
    }

    public void Vaccinate(Animal animal)
    {
        System.out.println(name + " is vaccinating.");
        if (animal instanceof Dog)
        {
            System.out.println("Dog has been vaccinated: " + animal.toString());
        }
        else if (animal instanceof Cat)
        {
            System.out.println("Cat has been vaccinated: " + animal.toString());
        }
    }

    // setters and getters
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Vet name: " + getName();
    }
}
