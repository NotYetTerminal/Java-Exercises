public class Point
{
    protected double x;
    protected double y;

    public Point(double x, double y)
    {
        setX(x);
        setY(y);
    }

    // setters and getters
    public void setX(double x)
    {
        this.x = x;
    }

    public double getX()
    {
        return x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double getY()
    {
        return y;
    }

    public String toString()
    {
        return "X: " + getX() +
               "\nY: " + getY();
    }
}
