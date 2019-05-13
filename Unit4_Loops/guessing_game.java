package Unit4_Loops;

/*
Programmer: Max Vogel
Buzz URL:   
Github:     https://github.com/Mehvix/IntroToComputerProgramming/tree/master/Unit4_Loops
Goal:       Guessing game to play with user
*/

import javax.swing.*; // Allows JOptionpane
import java.util.Random; // Allows random

public class guessing_game {

	public static String error(String input) {
		JOptionPane.showMessageDialog(null, input + " isn't a valid number!");
    	return JOptionPane.showInputDialog(null, "Re-enter a value, this time a number");
	}

	public static int check(String input) {
		int x = 0;
		try {
	        x = Integer.parseInt(input);
        }
        catch(NumberFormatException e) {
        	x = check(error(input)); 
        }
		
		if (x < 0) {
			x = check(error(input));
		}
		
		return x;
	}
	
	public static void verify(int guess, int rannum)
	{
		if(guess == rannum) {
			JOptionPane.showMessageDialog(null, "Correct! " + guess + " was the random number");
		} else {  //  4. determine if the guess is too high, too low or just right and let the user know
			if (guess > rannum) {
				verify(check(JOptionPane.showInputDialog("Sorry, but " + guess + " is too high. \nGuess again!")), rannum);
			} else {
				verify(check(JOptionPane.showInputDialog("Sorry, but " + guess + " is too low. \nGuess again!")), rannum);
			}
		}
	}
	public static void main(String[] args) {
		
		// 1.  Ask the user what the low and high number will be for the range
		final int NUMMAX = check(JOptionPane.showInputDialog("Give me the max number"));
		final int NUMMIN = check(JOptionPane.showInputDialog("Give me the min number"));
		int rannum = 0;
		
		
		Random rand = new Random();  //2.  generate a random secret

		
		try {
			rannum = rand.nextInt((NUMMAX - NUMMIN) + 1) + NUMMIN; 

		}		
		catch (java.lang.IllegalArgumentException e) {  // if user makes second num greater than first
			rannum = rand.nextInt((NUMMIN - NUMMAX) + 1) + NUMMAX;
		}

		verify(check(JOptionPane.showInputDialog(null, "Guess a number between " + NUMMAX + " and " + NUMMIN)), rannum);  // 3.  get the users guess

		}
}