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
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed. (2.85) (2.88)
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }
/*
 * Returns number of pages in book.(2.85)
 */
public int getPages()
{
    return pages;
}

/*
 * Sets the reference number of the book (2.88)
 */
public void setRefNumber(String ref)
{
    refNumber = ref;
}

/*
 * Returns the reference number of the book (2.88)
 */
public String getRefNumber()
{
    return refNumber;
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
/*
 * Prints out the name of the book, the name of the author, and how many pages
 * are in the book together. (2.87)
 */
    public void printDetails()
    {
        System.out.print("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    }
}
