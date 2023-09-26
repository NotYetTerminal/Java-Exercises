public class Book
{
    private String bookName;
    private String author;
    private int iSBN;
    private String genre;
    // status stored as either A for available or B for borrowed
    private char status;

    private static int numberOfBooks = 0;

    public Book(String bookName, String author, String genre)
    {
        numberOfBooks += 1;
        setISBN(numberOfBooks);
        setBookName(bookName);
        setAuthor(author);
        setGenre(genre);
        setStatus('A');
    }

    public void Borrow()
    {
        status = 'B';
    }

    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    public String getBookName()
    {
        return bookName;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setISBN(int iSBN)
    {
        this.iSBN = iSBN;
    }

    public int getISBN()
    {
        return iSBN;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setStatus(char status)
    {
        this.status = status;
    }

    public char getStatus()
    {
        return status;
    }

    public static int getNumberOfBooks()
    {
        return numberOfBooks;
    }

    public String toString()
    {
        return "Name: " + getBookName() +
               ", Author: " + getAuthor() +
               ", ISBN: " + String.valueOf(getISBN()) +
               ", Genre: " + getGenre() +
               ", Status: " + getStatus();
    }
}
