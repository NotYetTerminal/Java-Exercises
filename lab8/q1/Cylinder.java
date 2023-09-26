public class Cylinder extends ThreeDShape
{
    private Circle circle;
    private double height;

    public Cylinder(String name, String colour, double radius, double height)
    {
        super(name, colour);
        circle = new Circle(name, colour, radius);
        setHeight(height);
    }

    // setters and getters
    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getHeight()
    {
        return height;
    }

    @Override
    public double volume()
    {
        return circle.area() * getHeight();
    }

    @Override
    public double area()
    {
        return (2 * Math.PI * circle.getRadius() * getHeight()) + (2 * circle.area());
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nRadius = " + circle.getRadius() + "\nHeight = " + getHeight();
    }

}
