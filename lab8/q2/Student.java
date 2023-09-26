public class Student extends Person
{
    private String course;

    public Student(String name, String course)
    {
        super(name);
        setCourse(course);
    }

    @Override
    public String getDescription()
    {
        return "A student studying " + getCourse();
    }
    
    // setters and getters
    public void setCourse(String course)
    {
        this.course = course;
    }

    public String getCourse()
    {
        return course;
    }
}
