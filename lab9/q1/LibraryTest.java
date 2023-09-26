public class LibraryTest
{
    public static void main(String[] args)
    {
        LibraryItem[] libraryItemsArray = new LibraryItem[2];

        LibraryItem book = new Book("Book", "123", "Alice", "Alice in Wonderland", 200);
        libraryItemsArray[0] = book;

        LibraryItem cd = new CD("CD", "234", "Bob's Band", "Can we Fix It?", 3);
        libraryItemsArray[1] = cd;

        for (LibraryItem item : libraryItemsArray)
        {
            if (item instanceof Book)
            {
                System.out.println("Loan price: " + ((Book)item).calculatePrice());
            }
            else if (item instanceof CD)
            {
                System.out.println("Loan price: " + ((CD)item).calculatePrice());
            }
        }
    }
}
