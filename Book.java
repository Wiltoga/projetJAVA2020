import java.util.*;

/**
 * Defines a book with an author
 */
public abstract class Book implements Document {
    private UUID id;
    /**
     * title of the book
     */
    protected String title;
    /**
     * author of the book
     */
    protected String author;
    /**
     * Constructor.
     * @param author author of the book
     */
    protected Book(String author) {
        id = UUID.randomUUID();
        this.author = author;
    }
    @Override
    public UUID getID() {
        return id;
    }
    @Override
    public abstract utilities.Price getPrice(int days);
    @Override
    public String getTitle() {
        return title;
    }
    /**
     * Gets the author's name
     * @return the name of the author of this book
     */
    public String getAuthor() {
        return author;
    }
}