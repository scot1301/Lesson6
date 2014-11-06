package Lesson6;
import TerminalIO.*;
import java.util.Scanner;
public class Library {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    patron patron1 = new patron();
    patron patron2 = new patron();
    
    System.out.print("Please enter the title for the first book: ");
    String title1 = scan.nextLine();
    System.out.print("Please enter the author for the first book: ");
    String author1 = scan.nextLine();
    Book book1 = new Book(title1, author1);
    boolean result1 = patron1.borrowBook(book1);
    if (!result1) System.err.println("Book 1 for"+ author1 +"failed");

    System.out.println("\n" + patron1.toString() + "\n");
    System.out.print("Please enter the title for the second book: ");
    String title2 = scan.nextLine();
    System.out.print("Please enter the author for the second book: ");
    String author2 = scan.nextLine();
    Book book2 = new Book(title2, author2);
    boolean result2 = patron1.borrowBook(book2);
    if (!result2) System.err.println("Book 2 for"+ author2 +"failed");

    System.out.println("\n" + patron1.toString() + "\n");
    System.out.print("Please enter the title for the third book: ");
    String title3 = scan.nextLine();
    System.out.print("Please enter the author for the third book: ");
    String author3 = scan.nextLine();
    Book book3 = new Book(title3, author3);
    boolean result3 = patron1.borrowBook(book3);
    if (!result3) System.err.println("Book 3 for"+ author3 +"failed");
    
    System.out.println("\n" + patron1.toString() + "\n");
    System.out.print("Please enter the title for the fourth book: ");
    String title4 = scan.nextLine();
    System.out.print("Please enter the author for the fourth book: ");
    String author4 = scan.nextLine();
    Book book4 = new Book(title4, author4);
    
    boolean result4 = patron1.borrowBook(book4);
    if (!result4) System.out.println("Book 4 for"+ author4 +"failed /n" + "This message should print since 3" + " books max can be borrowed.\n");
    System.out.print("Please enter the title to return from the borrowed list: ");
    String title = scan.nextLine();
    if (patron1.hasBorrowed(title)){
      boolean result = patron1.returnBook(title);
      if (result){
        System.out.println(title + " has been returned.");
        boolean result2 = patron1.borrowBook(book4);
        if (result2)
          System.out.println("The fourth book was successfully checked out.");
        else
          System.err.println("Book 4 failed again.");
      }
      else
        System.err.println(title + "Has failed to be returned.");
    }
    else {
      System.err.println("Title not found in the check out list.");
    }
    System.out.println("\n" + patron1.toString() + "\n");
    System.out.print("Please enter your name: ");
    String yourName = scan.nextLine();
    patron2.setName(yourName);
    System.out.println("\n" + patron2.toString() + "\n");
  }
}