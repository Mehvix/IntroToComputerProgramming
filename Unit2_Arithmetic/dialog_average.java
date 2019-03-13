/*
This program asks the user for 3 integer values and calculates
the average of those 3 values, then prints the average
*/
import javax.swing.*;


public class dialog_average
{
	public static int check(String input) {
		int x = 0;
		try {
        x = Integer.parseInt(input);
        }
        catch(NumberFormatException e) {
        	JOptionPane.showMessageDialog(null, input + " isn't a number!");
        	check(JOptionPane.showInputDialog(null, "Re-enter a value, this time a number"));
        }
		return x;
	         
	}
	public static void main (String[] args)
	{
		//declare variables:  3 ints, a double (for the average)
		int num1 = 0, num2 = 0, num3 = 0; //give initial values to numbers!
		double avg;
		final double NUM_TESTS = 3.0;  //this is  a constant. user won't change, programmer will
		
		// get the first integer
		num1 = check(JOptionPane.showInputDialog(null, "Enter a number"));
		
		         
		// get the second integer
		num2 = check(JOptionPane.showInputDialog(null, "Enter the second number"));

		// get the third integer
		num3 = check(JOptionPane.showInputDialog(null, "Enter the third number"));

		//calculate the average. Add the 3 ints and divide by 3
		avg = (int)((num1+num2+num3)/NUM_TESTS);
    
	    // I am not using these yet, but if you have time you might want 
	    // to try formatting the numbers in your MessageDialog box
	    //String.format("%.2f",345.6789)         345.68
	    //String.format("$%.2f",345.5678)     $345.68
	    //String.format("$%10.2f",345.5678)   $       345.68
	      
		JOptionPane.showMessageDialog(null,"The average is " + avg);
   }
}

/*
1.  Find the two (2) syntax errors in this program and state how to fix them.
> Semicolon (Line 19)
> 'JOptionPane' lowercase (Line 34)

2.  What is the (1) logic error in this program and how can it be fixed?
> No parenthesis (Line 39)

3.  What is the Run-Time error in this program?  
> Breaks if anything else other than an int is entered (Line 21)

4.  Specifically write how you can fix this Run-Time error and write
the specific code below.  Include line numbers from the program.
Verify that the input is a number. This is done in the check method (Line 10)

5.  If you haven't already done so, fix the run-time errors in your own
program and test it under every circumstance.  Have your teammates
test it too!
*/