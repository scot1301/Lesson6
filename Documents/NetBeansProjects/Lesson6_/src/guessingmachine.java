import java.util.Random; 
import java.util.Scanner;
public class guessingmachine {
    public static void main (String [] args)   
    {
	Random r = new Random(); //makes the guesses random
	int numGuess = r.nextInt(100);
	int numTry = 0;
	Scanner scan = new Scanner (System.in);
	int guess;
	boolean win = false;
        while (win == false) 
        {
            System.out.println("Guess a number between 1 and 100: ");
            guess = scan.nextInt();
            numTry++;
            if (guess == numGuess){
		System.out.println("You are the Winner!");
                System.out.println("The number was: " + numGuess + " it took you " +numTry + " tries.");
                win = true;
                
            }
            else if (guess < numGuess){
                System.out.println("Your guess is too low, guess higher.");
            }
            else if (guess > numGuess){
                System.out.println("Your guess is too high.");
            }
    }
}