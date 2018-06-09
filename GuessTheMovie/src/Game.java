import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Udacity - Lesson 3: GuessTheMovie hangman project
 *
 * This class contains all the methods i.e. functionalities
 * for the game.
 * 
 * @author Sony
 */
public class Game 
{
	// field variables
	private File file;
	
	/**
	 * Constructor
	 */
	public Game(File file)
	{
		this.file = file;
	}
	
	/**
	 * Method reads through each line in the file object i.e. movieNames.txt file
	 * and displays the whole list in the output. 
	 */
	public void displayNames()
	{
		/*
		 * The Scanner object is used to read through each entry
		 * in the file object. 
		 * 
		 * Create a local variable 'scanner' of type Scanner to hold
		 * the reference to Scanner object
		 */
		Scanner scanner;
		try {	
			scanner = new Scanner(file);
			
			/*
			 * While loop runs as log as there is a token on the next line.
			 * The while loop condition returns false when there is no more
			 * tokens left in the movieNames.txt file
			 */
			while (scanner.hasNextLine())
			{
				System.out.println(scanner.nextLine());
			}
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("The file cannot be found");
			e.printStackTrace();
		}
	}// end of displayNames()
}// end of Game class