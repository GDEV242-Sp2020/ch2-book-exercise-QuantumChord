/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Joseph McGuane)
 * @version (2/9/2020)
 */
class Book
{
     // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
/*
 * Prints the name of the author. (2.84)
 */    
    public void printAuthor()
    {
        System.out.println("The author is: " + author);
    }

/*
 * Prints the title of the book. (2.84)
 */
    public void printTitle()
    {
        System.out.println("The title is: " + title);
    }
}
