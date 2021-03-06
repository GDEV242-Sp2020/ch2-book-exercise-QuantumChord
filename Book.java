
/**
 * This program is used by a library look up an author, their book's title,
 * the number of pages in that book, the reference number in question,
 * how many times it was borrowed, and whether or not the book is used as
 * a textbook on a course.
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
    private int borrowed;
    private boolean courseText;
    
    /**
     * Set the author and title fields when this object
     * is constructed. (2.85) (2.88)
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean courseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        this.courseText=courseText;
    }

    /**
       * Returns the name of the author of the book.(2.83)
     */
    public String getAuthor()
    {
        return author;
    }
    /**
       * Returns the name the book.(2.83)
     */
    public String getTitle()
    {
        return title;
    }
/**
 * Returns number of pages in book.(2.85)
 */
public int getPages()
{
    return pages;
}



/**
 * Sets the reference number of the book (2.88)
 */
public void setRefNumber(String ref)
{
    if (ref.length() >=3){
        refNumber = ref;
    }
    else {
        System.out.println("Error, reference number must be at least 3 characters.");
    }
        
}

/**
 * Borrows the book, value increases as the times the book is borrowed. (2.91)
 */
public void borrow()
{
    borrowed++;
}

/**
 * Returns the number of times the book was borrowed. (2.91)
 */
public int getBorrowed()
{
    return borrowed;
}

/**
 * Returns the reference number of the book (2.88)
 */
public String getRefNumber()
{
    return refNumber;
}

public boolean isCourseText()
{
    return courseText;
}

/**
 * Prints the name of the author. (2.84)
 */    
public void printAuthor()
    {
        System.out.println("The author is: " + author);
    }

/**
 * Prints the title of the book. (2.84)
 */
public void printTitle()
    {
        System.out.println("The title is: " + title);
    }
/**
 * Prints out the name of the book, the name of the author,how many pages
 * are in the book together, what is the reference number, and
 * how many times the book was borrowed. (2.87) (2.89) (2.91)
 */
    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        
        String refNumberString;
        if(refNumber.length() > 0) {
            refNumberString = refNumber;
        }
        else {
            refNumberString = "ZZZ";
        }
        System.out.println("Reference Number: " + refNumberString);
        System.out.println("Times Borrowed: " + borrowed);
    }
}
