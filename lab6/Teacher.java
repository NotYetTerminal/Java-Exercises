public class Teacher extends Person
{
    private int numCourses;
    private String[] courses;

    public Teacher(String name, String address)
    {
        super(name, address);
        numCourses = 0;
        courses = new String[0];
    }
    
    public boolean addCourse(String course)
    {
        for (int i = 0; i < numCourses; i++)
        {
            if (courses[i].equals(course))
            {
                return false;
            }
        }

        String[] temp = courses;
        numCourses += 1;

        courses = new String[numCourses];

        for (int i = 0; i < numCourses - 1; i++)
        {
            courses[i] = temp[i];
        }

        courses[numCourses - 1] = course;
        return true;
    }

    public boolean removeCourse(String course)
    {
        for (int i = 0; i < numCourses; i++)
        {
            if (courses[i].equals(course))
            {
                numCourses -= 1;
                courses[i] = courses[numCourses];
                courses[numCourses] = null;
                return true;
            }
        }
        return false;
    }

    public String toString()
    {
        return "Teacher: " + super.toString();
    }
}
