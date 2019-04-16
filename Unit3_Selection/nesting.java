package Unit3_Selection;

import javax.swing.*;


public class nesting {

	public static String error(String input) {
		JOptionPane.showMessageDialog(null, input + " isn't a number!");
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
	
	public static void main(String[] args) {
		final int input = check(JOptionPane.showInputDialog("Give me a number"));
		
		if (input % 2 == 0) {
			if (input % 3 == 0) {
				JOptionPane.showMessageDialog(null, "The number you entered was EVEN and a multiple of 6");
			} else {
				JOptionPane.showMessageDialog(null, "The number you entered was EVEN");
			}
		} else {
			JOptionPane.showMessageDialog(null, "The number you entered was ODD");
		}

	}

}
