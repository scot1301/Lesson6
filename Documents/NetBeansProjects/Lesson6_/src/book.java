package Lesson6;
public class Book {

    String title;
    String author;
    public Book(String title, String author)
        {
            this.title = title;
            this.author = author;
        }

    public String getTitle()
        {
            return title;
        }
	
    public String getAuthor()
        {
            return author;
        }
	
    public String toString()
        {
            return ("Book Title: " + title + "\n" + "Book Author: " + author + "\n");
        }
}