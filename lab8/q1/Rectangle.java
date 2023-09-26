public class Rectangle extends TwoDShape
{
    private double length;
    private double width;

    public Rectangle(String name, String colour, double length, double width)
    {
        super(name, colour);
        setLength(length);
        setWidth(width);
    }

    // setters and getters
    public void setLength(double length)
    {
        this.length = length;
    }

    public double getLength()
    {
        return length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getWidth()
    {
        return width;
    }

    @Override
    public double area() {
        return getLength() * getWidth();
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\nLength = " + getLength() + "\nWidth = " + getWidth();
    }
}
