public class Sphere extends ThreeDShape
{
    private Circle circle;

    public Sphere(String name, String colour, double radius) {
        super(name, colour);
        circle = new Circle(name, colour, radius);
    }

    @Override
    public double volume()
    {
        return (4 * circle.area() * circle.getRadius()) / 3;
    }

    @Override
    public double area()
    {
        return 4 * circle.area();
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\nRadius = " + circle.getRadius();
    }
}
