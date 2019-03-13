/*
Programmer: Max Vogel
Buzz URL:   
Github:     https://github.com/Mehvix/IntroToComputerProgramming/tree/master/Unit2_Arithmetic
Goal:       Calculate the tip based 
			off of the price of the 
			meal and the given tip 
			percent.
*/

import javax.swing.*;

public class tip
{
	public static double percent(String input) {
		JOptionPane.showMessageDialog(null, input + " isn't a percent!");
    	return 100 * (check(JOptionPane.showInputDialog(null, "Re-enter a value, this time a percent"), "Tip"));
    	//^ I don't know why you have to multiply it by 100 but I guess it divides by 100 twice when returning?
	}
	
	public static double check(String input, String type) {
		double x = 0;
		try {
	        x = Double.parseDouble(input);
	        
	        if(type == "Tip") {
	        	if(x < 0) {
	        		x = percent(input);
	        	}
	        }
        }
        catch(NumberFormatException e) {
        	if (type == "Cost") {
	        	JOptionPane.showMessageDialog(null, input + " isn't a number!");
	        	check(JOptionPane.showInputDialog(null, "Re-enter a value, this time a number"), "Cost");
        	} else {
        		x = percent(input);
        	}
        }
		
		if (type == "Tip") {
			return (x/100);
		} else {
			return x;
		}
	}

	public static void main(String[] args) {
		double cost = 0, tip_percent = 0, final_tip = 0;
        cost = check(JOptionPane.showInputDialog("How much did the meal cost?"), "Cost");
        
        tip_percent = check(JOptionPane.showInputDialog("How are you tipping?"), "Tip");
        
        final_tip = cost * tip_percent + cost;
        double tip_amount = tip_percent * 100;
        JOptionPane.showMessageDialog(null, String.format(
        		"Initial Cost:   $%s%n \n"
        		+ "Tip Percent:     %s%n\n"  // There should be a percent sign here, but it breaks the program for whatever reason
        		+ "End Cost:        $%s%n \n", cost, tip_amount + "%", final_tip));  // Which is why there is a percent sign here!
        
	}
}