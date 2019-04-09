package Unit3_Selection;

import javax.swing.JOptionPane;

public class triangle {

	public static String error(String input) {
		JOptionPane.showMessageDialog(null, input + " isn't a valid numbr!");
    	return JOptionPane.showInputDialog(null, "Re-enter your the value");
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
		// TODO Auto-generated method stub
		final int num1 = check(JOptionPane.showInputDialog("Give me the side 1"));
		final int num2 = check(JOptionPane.showInputDialog("Give me the side 2"));
		final int num3 = check(JOptionPane.showInputDialog("Give me the side 3"));
		
		int highest = num1 + num2;
		int lowest = Math.abs(num1 - num2);
		
		if (num3 > lowest && num3 < highest) {
			JOptionPane.showMessageDialog(null, "That is a valid triangle!");
		} else {
			JOptionPane.showMessageDialog(null, "That is not a valid triangle!");

		}

	}

}
