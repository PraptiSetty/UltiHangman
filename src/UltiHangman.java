import java.util.Scanner;
import java.util.Arrays;

public class UltiHangman {

    static String usedLetters = "";
    static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int mistakes = 0;
        int guesses = 0;
        String word = getWord();
        String clue = getClue();
        String obfusticatedWord = obWords(word);
        clearScreen();

        while (mistakes < 8)
        {
            printHangMan(mistakes);
            System.out.println("" );
            System.out.println(obfusticatedWord + ((guesses > 4)? "\tClue: " + clue : ""));
            System.out.println("Wrong guesses: " + mistakes + " Guesses: " + guesses + " Used letters: " + usedLetters);
            String letter = getLetter();
            if (letterUsed(letter))
            {
                System.out.println("That Letter has been used");
                mistakes++;
            }
            else if (word.contains(letter))
            {
                obfusticatedWord = revealLetter(letter, word, obfusticatedWord);
                System.out.println("That Letter is correct!");

            }
            else
            {
                System.out.println("Not a letter.");
                mistakes++;
            }
            guesses++;
            if (word.equals(obfusticatedWord)) break;
        }

        gameFinished(guesses, mistakes, word);

    }

    private static boolean letterUsed(String letter)
    {

        if (usedLetters.contains(letter))
        {
            return true;
        }
        else {
            usedLetters = usedLetters + letter;
            char [] c = usedLetters.toCharArray();
            Arrays.sort(c);
            usedLetters = new String(c);
            return false;
        }
    }

    public static String getWord()
    {

        System.out.println("CHALLENGER!");
        System.out.println("WHAT WORD DO YOU WANT YOUR OPPONENT TO GUESS? : ");
        String word = inputScanner.next();

        return word;
    }

    public static String getClue()
    {
        System.out.println("CHALLENGER!");
        System.out.println("GIVE US A CLUE TO PROVIDE YOUR STRUGGLING OPPONENT WITH : ");
        inputScanner.nextLine();
        String clue = inputScanner.nextLine();

        return clue;
    }

    public static String obWords(String word)
    {
        String obfusticatedWord = "";
        for (int i =0; i < word.length(); i++)
        {
            obfusticatedWord += "_";
        }
        return obfusticatedWord;
    }

    public static boolean clearScreen()
    {
        for (int o = 0; o < 24; o++)
        {
            System.out.println("  ");
        }
        return true;
    }

    public static void printHangMan(int mistake)
    {
        switch (mistake)
        {
            case 0:
                System.out.println("***************************************");
                System.out.println("******************                  ***");
                System.out.println("****************** ***************  ***");
                System.out.println("****************** ***************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("********************************      *");
                System.out.println("********************************      *");
                System.out.println("***************************************");
                break;
            case 1:
                System.out.println("***************************************");
                System.out.println("******************                  ***");
                System.out.println("****************** ***************  ***");
                System.out.println("****************** ***************  ***");
                System.out.println("****************    **************  ***");
                System.out.println("***************      *************  ***");
                System.out.println("***************      *************  ***");
                System.out.println("*****************  ***************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("********************************      *");
                System.out.println("********************************      *");
                System.out.println("***************************************");
                break;
            case 2:
                System.out.println("***************************************");
                System.out.println("******************                  ***");
                System.out.println("****************** ***************  ***");
                System.out.println("****************** ***************  ***");
                System.out.println("****************    **************  ***");
                System.out.println("***************      *************  ***");
                System.out.println("***************      *************  ***");
                System.out.println("*****************  ***************  ***");
                System.out.println("**************        ************  ***");
                System.out.println("***************      *************  ***");
                System.out.println("***************      *************  ***");
                System.out.println("***************      *************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("********************************      *");
                System.out.println("********************************      *");
                System.out.println("***************************************");
                break;
            case 3:
                System.out.println("***************************************");
                System.out.println("******************                  ***");
                System.out.println("****************** ***************  ***");
                System.out.println("****************** ***************  ***");
                System.out.println("****************    **************  ***");
                System.out.println("***************      *************  ***");
                System.out.println("***************      *************  ***");
                System.out.println("*****************  ***************  ***");
                System.out.println("**************        ************  ***");
                System.out.println("************  *      *************  ***");
                System.out.println("**********  ***      *************  ***");
                System.out.println("********   ****      *************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("********************************      *");
                System.out.println("********************************      *");
                System.out.println("***************************************");
                break;
            case 4:
                System.out.println("***************************************");
                System.out.println("******************                  ***");
                System.out.println("****************** ***************  ***");
                System.out.println("****************** ***************  ***");
                System.out.println("****************    **************  ***");
                System.out.println("***************      *************  ***");
                System.out.println("***************      *************  ***");
                System.out.println("*****************  ***************  ***");
                System.out.println("**************        ************  ***");
                System.out.println("************  *      *  **********  ***");
                System.out.println("**********  ***      ***  ********  ***");
                System.out.println("********   ****      ****   ******  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("**********************************  ***");
                System.out.println("********************************      *");
                System.out.println("********************************      *");
                System.out.println("***************************************");
                break;
            case 5:
                System.out.println("***************************************");
                System.out.println("******************                  ***");
                System.out.println("****************** ***************  ***");
                System.out.println("****************** ***************  ***");
                System.out.println("****************    **************  ***");
                System.out.println("***************      *************  ***");
                System.out.println("***************      *************  ***");
                System.out.println("*****************  ***************  ***");
                System.out.println("**************        ************  ***");
                System.out.println("************  *      *  **********  ***");
                System.out.println("**********  ***      ***  ********  ***");
                System.out.println("********   ****      ****   ******  ***");
                System.out.println("***************      *************  ***");
                System.out.println("**************   *****************  ***");
                System.out.println("*************   ******************  ***");
                System.out.println("**********************************  ***");
                System.out.println("********************************      *");
                System.out.println("********************************      *");
                System.out.println("***************************************");
                break;
            case 6:
                System.out.println("***************************************");
                System.out.println("******************                  ***");
                System.out.println("****************** ***************  ***");
                System.out.println("****************** ***************  ***");
                System.out.println("****************    **************  ***");
                System.out.println("***************      *************  ***");
                System.out.println("***************      *************  ***");
                System.out.println("*****************  ***************  ***");
                System.out.println("**************        ************  ***");
                System.out.println("************  *      *  **********  ***");
                System.out.println("**********  ***      ***  ********  ***");
                System.out.println("********   ****      ****   ******  ***");
                System.out.println("***************      *************  ***");
                System.out.println("**************   *    ************  ***");
                System.out.println("*************   ***   ************  ***");
                System.out.println("**********************************  ***");
                System.out.println("********************************      *");
                System.out.println("********************************      *");
                System.out.println("***************************************");
                break;
            case 7:
                System.out.println("***************************************");
                System.out.println("******************                  ***");
                System.out.println("****************** ***************  ***");
                System.out.println("****************** ***************  ***");
                System.out.println("****************    **************  ***");
                System.out.println("***************      *************  ***");
                System.out.println("***************      *************  ***");
                System.out.println("*****************  ***************  ***");
                System.out.println("**************        ************  ***");
                System.out.println("************  *      *  **********  ***");
                System.out.println("**********  ***      ***  ********  ***");
                System.out.println("********   ****      ****   ******  ***");
                System.out.println("***************      *************  ***");
                System.out.println("**************   *    ************  ***");
                System.out.println("*************   ***   ************  ***");
                System.out.println("************   *******************  ***");
                System.out.println("**********   *******************      *");
                System.out.println("*******     ********************      *");
                System.out.println("***************************************");
                break;
            case 8:
                System.out.println("***************************************");
                System.out.println("******************                  ***");
                System.out.println("****************** ***************  ***");
                System.out.println("****************** ***************  ***");
                System.out.println("****************    **************  ***");
                System.out.println("***************      *************  ***");
                System.out.println("***************      *************  ***");
                System.out.println("*****************  ***************  ***");
                System.out.println("**************        ************  ***");
                System.out.println("************  *      *  **********  ***");
                System.out.println("**********  ***      ***  ********  ***");
                System.out.println("********   ****      ****   ******  ***");
                System.out.println("***************      *************  ***");
                System.out.println("**************   *    ************  ***");
                System.out.println("*************   ***   ************  ***");
                System.out.println("************   *****   ***********  ***");
                System.out.println("**********   ********   ********      *");
                System.out.println("*******     ***********    *****      *");
                System.out.println("***************************************");
                break;
            default:
                break;
        }
    }

    public static String getLetter()
    {
        boolean validLetter = false;
        Scanner inputScanner = new Scanner(System.in);

        while (!validLetter)
        {
            String input = inputScanner.next();
            if (input.length() == 1)
            {
                return input;
            }
            else
            {
                System.out.print("Sorry, you entered an invalid letter. Please try again.");
            }
        }
        return "";
    }

    public static void gameFinished(int numberOfGuesses, int numberOfWrongGuesses, String word)
    {
        if (numberOfWrongGuesses == 8)
        {
            printHangMan(8);
            System.out.println("Unfortunate. You lost the game! Better luck next time! The word inputted by your nemesis was '" + word +"'.");
        }
        else
        {
            System.out.println("You have won the game! WELL DONE!! It took you "
                    + numberOfGuesses + " guesses to get the right word! The word inputted by your Challenger was \"" + word +"\"." );
        }
    }

    public static String revealLetter(String letter, String word, String hword)
    {
        String nhword = hword;
        String nahword = "";
        for (int i = 0; i < word.length(); i ++)
        {
            if (word.charAt(i) == letter.charAt(0))
            {

                nahword = nhword.substring(0, i) + letter + nhword.substring(i+1);
                nhword = nahword;
            }
        }
        return nhword;
    }
}
