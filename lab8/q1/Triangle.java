public class Triangle extends TwoDShape
{
    private double base;
    private double height;

    public Triangle(String name, String colour, double base, double height)
    {
        super(name, colour);
        setBase(base);
        setHeight(height);
    }

    // setters and getters
    public void setBase(double base)
    {
        this.base = base;
    }

    public double getBase()
    {
        return base;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getHeight()
    {
        return height;
    }

    @Override
    public double area()
    {
        return 0.5 * getBase() * getHeight();
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nBase = " + getBase() + "\nHeight = " + getHeight();
    }
}
