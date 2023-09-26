public class Student extends Person
{
    private int numCourses;
    private String[] courses;
    private int[] grades;

    public Student(String name, String address)
    {
        super(name, address);
        System.out.print(toString());
        numCourses = 0;
        courses = new String[0];
        grades = new int[0];
    }

    public void addCourseGrade(String course, int grade)
    {
        String[] temp = courses;
        int[] temp_2 = grades;
        numCourses += 1;

        courses = new String[numCourses];
        grades = new int[numCourses];

        for (int i = 0; i < numCourses - 1; i++)
        {
            courses[i] = temp[i];
            grades[i] = temp_2[i];
        }

        courses[numCourses - 1] = course;
        grades[numCourses - 1] = grade;
    }

    public void printGrades()
    {
        for (int i = 0; i < numCourses; i++)
        {
            System.out.print(" " + courses[i] + ":" + grades[i]);
        }
        System.out.print("\n");
    }

    public double getAverageGrade()
    {
        double total = 0;
        for (int grade: grades)
        {
            total += grade;
        }
        total /= grades.length;
        return total;
    }

    public String toString()
    {
        return "Stundent: " + super.toString();
    }
}
