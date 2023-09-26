import java.util.Scanner;

public class Library
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Book book1 = makeNewBook(scanner);
        System.out.println("Number of books: " + String.valueOf(Book.getNumberOfBooks()));

        Book book2 = makeNewBook(scanner);
        System.out.println("Number of books: " + String.valueOf(Book.getNumberOfBooks()));
        book2.Borrow();

        Book book3 = makeNewBook(scanner);
        System.out.println("Number of books: " + String.valueOf(Book.getNumberOfBooks()));

        System.out.println("Book 1: " + book1.toString());
        System.out.println("Book 2: " + book2.toString());
        System.out.println("Book 3: " + book3.toString());

        scanner.close();
    }

    // put book creation in here to simplify main
    private static Book makeNewBook(Scanner scanner)
    {
        // asking user for details
        // use hashes for separots as they are unlikely to be in a book name
        System.out.println("Input the following book details seperated by hashes:");
        System.out.println("Name#Author#Genre");
        System.out.print("Book details: ");
        // replace, gets rid of spaces
        // split, splits the one string into multiple
        String[] inputDetailsArray = scanner.nextLine().replace("# ", "#").split("#");

        // if details input were wrong use recursion
        // until the user gets it right
        // or the computer runs out of memory
        if (inputDetailsArray.length == 3)
        {
            return new Book(inputDetailsArray[0], inputDetailsArray[1], inputDetailsArray[2]);
        }
        else
        {
            return makeNewBook(scanner);
        }
    }
}
