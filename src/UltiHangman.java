import java.util.Scanner ;

public class UltiHangman 
{
	public static void main (String [] args ) 
	{	

	}
	public static String getWord()
	{
		System.out.println("USER 1");
		System.out.println("WHAT WORD DO YOU WANT USER 2 TO GUESS? : ");
		Scanner inputScanner = new Scanner( System.in );
		String word = inputScanner.next();
		
		inputScanner.close();
		return word;
	}
	public static String getClue()
	{
		System.out.println("USER 1");
		System.out.println("GIVE US A CLUE TO PROVIDE USER 2 WITH : ");
		Scanner inputScanner = new Scanner( System.in );
		String clue = inputScanner.next();
		
		inputScanner.close();
		return clue;
	}
	public static boolean printUnderscores(String word) 
	{
		boolean underscorePrinted = false;
		for (int i =0; i < word.length(); i++)
		{
			System.out.print(" _ ");
		}
		return underscorePrinted;	    
	}
	public static boolean clearScreen()
	{
		for (int o = 0; o < 24; o++)
		{
			System.out.println("  ");
		}
		return true;
	}
}
