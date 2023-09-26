public class Lab2bDriver
{
    public static void main(String[] args)
    {
        // 1
        // initializing
        Rectangle rectangle1 = new Rectangle();

        // testing setters and getters
        rectangle1.setLength(5);
        rectangle1.setWidth(50);
        System.out.println(rectangle1.toString());

        // 2
        System.out.println("Area: " + String.valueOf(rectangle1.getArea()));
        System.out.println("Perimeter: " + String.valueOf(rectangle1.getPerimeter()));

        // 3
        rectangle1.printRectangle();
    }
}