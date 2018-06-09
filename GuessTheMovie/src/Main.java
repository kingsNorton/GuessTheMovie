import java.io.File;

/**
 * Udacity - Lesson 3: GuessTheMovie hangman project
 * @author Sony
 */
public class Main 
{
	/**
	 * Main method
	 */
	public static void main(String[] args)
	{
		/*
		 * Create a File object
		 * 
		 * @param movieNames.txt file
		 */
		File file = new File("movieNames.txt");
		
		/*
		 * Create a Game object
		 * 
		 * @param file object with "movieNames.txt" file
		 */
		Game game = new Game(file);
		
		/*
		 * Call the displayNames() on the game object
		 * to display all the movie names in the text file
		 */
		game.displayNames();
	}
}
