/*
Programmer: Max Vogel
Buzz URL:   
Github:     https://github.com/Mehvix/IntroToComputerProgramming/tree/master/Unit2_Arithmetic
Goal:       Generate a receipt given the
			number of pi phones and 
			swindles ordered, with sales 
			tax.
*/

import javax.swing.*;

public class register_recipt
{
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
	
	public static void main(String[] args) {
		int piphones_ordered, swindles_ordered;
		final double piphones_cost= 37.5, swindles_cost = 59.75, subtotal, TAX_RATE = .055;
		double tax, total;
		
		piphones_ordered = check(JOptionPane.showInputDialog("How many PiPhones did you order?"));
		swindles_ordered = check(JOptionPane.showInputDialog("How many Swindles did you order?"));
        
		subtotal = (piphones_ordered * piphones_cost) + (swindles_ordered * swindles_cost);
		tax = Math.round((subtotal * TAX_RATE) * 100.0) / 100.0;  // Rounds number to nearest hundredth place
		total = Math.round((tax + subtotal) * 100.0) / 100.0;
		
		JOptionPane.showMessageDialog(null, String.format(
        		"Number of PiPhones:   %s%n \n"
        		+ "Number of Swindles:   %s%n \n"
        		+ "Subtotal:       $%s%n \n"
        		+ "Taxes:          $%s%n \n"
        		+ "Final Amount:    $%s%n \n",
        		piphones_ordered, swindles_ordered, subtotal, tax, total));
	}
}