public class Circle extends Point
{
    private double radius;

    public Circle(double x, double y, double radius)
    {
        super(x, y);
        setRadius(radius);
    }

    // setters and getters
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public String toString()
    {
        return super.toString() +
               "\nRadius: " + getRadius();
    }
}
