public class Animal
{
    private String type;
    private int age;
    private char gender;


    public Animal(String type, int age, char gender)
    {
        setType(type);
        setAge(age);
        setGender(gender);
    }

    public void eat()
    {
        System.out.println("Animal is eating");
    }

    public void sleep()
    {
        System.out.println("Animal is sleeping");
    }

    public void makeSound()
    {
        System.out.println("A generic animal sound");
    }

    // setters and getters
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }

    public char getGender()
    {
        return gender;
    }

    @Override
    public String toString()
    {
        return "Type: " + getType() + ", Age: " + getAge() + ", Gender: " + getGender();
    }
}
