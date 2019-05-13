package Unit4_Loops;

/*
Programmer: Max Vogel
Buzz URL:   
Github:     https://github.com/Mehvix/IntroToComputerProgramming/tree/master/Unit4_Loops
Goal:       1.) PIN game
				Write a program that will ask the user to enter their 4 digit PIN number 
				into an atm machine.  Use the Scanner to read in the PIN entered.  Keep 
				asking the user to enter the PIN until they enter the correct one!
			2.) Dice game
				Write a program that will show the sum of two 6 sided dice and continue
				to roll until the dice rolled are doubles!
			3.) Counting game
				Write a program that asks the user for 3 integers.  Count from the 
				first number given to the second number given and go up (or down) by an
				increment of the third number given.
*/


import javax.swing.*; // Allows JOptionpane
import java.util.Random; // Allows random


public class three_in_one {
	
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
		
		return x;
	}
	public static void pin() {
		final String pin_code = "1353";
		String pin_input = JOptionPane.showInputDialog("Enter your pin number:");
		
		while(!pin_input.equals(pin_code)) {
			pin_input = JOptionPane.showInputDialog("WRONG!\nEnter your pin correctly:");
		}
		JOptionPane.showMessageDialog(null, "Correct! Access granted");
	}
	
	public static void dice() {
		int roll1 = role();
		int roll2 = role();
		
		while (roll1 != roll2) {
			JOptionPane.showMessageDialog(null, "They're different:\nRoll #1:  " + roll1 + "\nRoll #2:  " + roll2);
			roll1 = role();
			roll2 = role();
		}
		JOptionPane.showMessageDialog(null, "They're the same!\nRoll #1:  " + roll1 + "\nRoll #2:  " + roll2);
	}
	
	public static int role() {
		Random rand = new Random();
		return rand.nextInt((6 - 1) + 1) + 1;
	}
	
	public static void counting() {
		int input1 = check(JOptionPane.showInputDialog("Enter the first number (starting):"));
		int input2 = check(JOptionPane.showInputDialog("Enter the second number (ending):"));
		int input3;
		String message = "• ";
		
		if (input2 < input1) {
			input3 = check(JOptionPane.showInputDialog("Enter the third number (counting by):\nNote: This must be LESS THAN than 0!"));
			while (input3 > 0) {
				input3 = check(JOptionPane.showInputDialog("You messed something up!\nEnter the third number (counting by):\nNote: This must be LESS THAN 0!"));
			}

			int location = input1;

			while (location > input2) {
				message += location + "\n• ";
				location += input3;
			}
			message += location;
			JOptionPane.showMessageDialog(null, message);
			
			
		} else {
			input3 = check(JOptionPane.showInputDialog("Enter the third number (counting by):\nNote: This must be GREATER THAN 0!"));
			while (input3 < 0) {
				input3 = check(JOptionPane.showInputDialog("You messed something up!\nEnter the third number (counting by):\nNote: This must be GREATER THAN 0!"));
			}
			
			int location = input1;
			while (location < input2) {
				message += location + "\n• ";
				location += input3;
			}
			message += location;
			JOptionPane.showMessageDialog(null, message);
		}
	}
	
	public static void main(String[] args) {
		counting();
	}

}
