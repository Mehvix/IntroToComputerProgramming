package Unit3_Selection;

/*
Programmer: Max Vogel
Buzz URL:   
Github:     https://github.com/Mehvix/IntroToComputerProgramming/tree/master/Unit3_Selection
Goal:       Find elegibility of driver's license and casino
*/

import javax.swing.*; // Allows JOptionpane

public class selection1 {
	
	public static String error(String input) {
		JOptionPane.showMessageDialog(null, input + " isn't a valid age!");
    	return JOptionPane.showInputDialog(null, "Re-enter your age");
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
		final int VOTE_AGE = 18;
		final int SCHOOLVOTE_AGE_MAX = 16;
		final int SCHOOLVOTE_AGE_MIN = 13;

		
		if (age >= VOTE_AGE) {
			JOptionPane.showMessageDialog(null, "You're old enough to vote in the presidential election!\nHowever, you're too old to vote for Student Senate at MHS.");
		} else if (age >= SCHOOLVOTE_AGE_MIN && age < SCHOOLVOTE_AGE_MAX){
			int wait = VOTE_AGE - age;
						
			JOptionPane.showMessageDialog(null, "Sorry, but you're too young to vote in the presidential election!\nYou need to wait another " + wait + " year(s).\nHowever, you are elegible to vote for student senate at MHS!");


		} else {
			int wait = VOTE_AGE - age;
			int school_wait = SCHOOLVOTE_AGE_MIN - age;
			JOptionPane.showMessageDialog(null, "Sorry, but you're too young to vote in the presidential election!\nYou need to wait another " + wait + " year(s).\nAlso, you are elegible to vote for student senate at MHS in " + school_wait + " years");

		}
	}

}
