package Unit3_Selection;

/*
Programmer: Max Vogel
Buzz URL:   
Github:     https://github.com/Mehvix/IntroToComputerProgramming/tree/master/Unit2_Arithmetic
Goal:       Calculate the tip based 
			off of the price of the 
			meal and the given tip 
			percent.
*/

import javax.swing.*; // Allows JOptionpane

public class selection1 {
	
	public static String error(String input) {
		JOptionPane.showMessageDialog(null, input + " isn't a valid number!");
    	return JOptionPane.showInputDialog(null, "Re-enter your age, this time a number");
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

	public static void main(String[] args) {

		int age = check(JOptionPane.showInputDialog("How old are you?"));
		
		if (age >= 16) {
			JOptionPane.showMessageDialog(null, "You're old enough for your licenese!");
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, but you're too young for your licenese!");

		}
	}

}
