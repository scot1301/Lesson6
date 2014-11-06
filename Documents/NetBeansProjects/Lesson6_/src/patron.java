package Lesson6;
public class patron {
	private String patron1;
	private Book book1, book2, book3, book4, book5;
		
	public patron()
	{
            book1 = null;
            book2 = null;
            book3 = null;
            book4 = null;
            book5 = null;
	}
	public patron(String yourName)
	{
		patron1 = yourName;
	}
	public void setName(String yourName) 
	{
            patron1 = yourName;
	}
	public boolean borrowBook(Book book) 
	{
            if (book1 == null)
		{
                    book1 = book;
                    return true;
		}
            else if(book2 == null)
		{
                    book2 = book;
                    return true;
		}
            else if(book3 == null)
		{
                    book3 = book;
                    return true;
                }
            else if(book4 == null)
		{
                    book4 = book;
                    return true;
		}
            else if(book5 == null)
		{
                    book5 = book;
                    return true;
		}	
		return false;
	}
	public boolean returnBook(String title) 
	{
            if(book1.getTitle().equals(title))
		{
                    return true;
		}
            else if(book2.getTitle().equals(title))
		{
                    return true;
		}
            else if(book3.getTitle().equals(title))
		{
                    return true;
		}
            else if(book4.getTitle().equals(title))
		{
                    return true;
		}
            else if(book5.getTitle().equals(title))
		{
                    return true;
		}
            return false;
	}
	public String getName()
	{
            return patron1;
	}
	public boolean hasBorrowed(String titlex) 
	{
            return false;
	}
	public String toString()
	{
            String str;
            str = "Name: " + patron1 + "\n" + book1 + "\n" + book2 + "\n" + book3 + "\n" + book4 + "\n" + book5 + "\n";
            return str;
		 
	}
}