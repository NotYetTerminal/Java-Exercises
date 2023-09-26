public class Rectangle
{
    // stores rectangle length and width
    private float length;
    private float width;

	public Rectangle()
    {
        setLength(1);
        setWidth(1);
    }

    // 2
    public float getArea()
    {
        return length * width;
    }

    public float getPerimeter()
    {
        return (length * 2) + (width * 2);
    }

    // 3
    public void printRectangle()
    {
        for (int index = 0; index < length; index++)
        {
            String current_line = "";

            for (int index2 = 0; index2 < width; index2++)
            {
                if (index == 0 || index == length - 1)
                {
                    current_line += "*";
                }
                else
                {
                    if (index2 == 0 || index2 == width - 1)
                    {
                        current_line += "*";
                    }
                    else
                    {
                        current_line += " ";
                    }
                }
            }

            System.out.println(current_line);
        }
    }

    // 1
    public void setLength(float length)
    {
        // min length is 0
        // max length is 40
        if (length < 0)
        {
            length = 0;
        }
        else if (length > 40)
        {
            length = 40;
        }
        this.length = length;
    }

    public float getLength()
    {
        return length;
    }
    
    public void setWidth(float width)
    {
        // min width is 0
        // max width is 40
        if (width < 0)
        {
            width = 0;
        }
        else if (width > 40)
        {
            width = 40;
        }
        this.width = width;
    }

    public float getWidth()
    {
        return width;
    }

    public String toString()
    {
        return "Length = " + String.valueOf(getLength()) + ", Width = " + String.valueOf(getWidth());
    }
}