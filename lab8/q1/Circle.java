public class Circle extends TwoDShape
{
    private double radius;

    public Circle(String name, String colour, double radius)
    {
        super(name, colour);
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

    @Override
    public double area()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nRadius = " + getRadius();
    }
}
