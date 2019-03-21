import javax.swing.JOptionPane;

/*
Programmer: Max Vogel
Buzz URL:   
Github:     https://github.com/Mehvix/IntroToComputerProgramming/tree/master/Unit2_Arithmetic
Goal:       Illustrate purpose of Math
*/

//import javax.swing.*; // Allows JOptionpane
//import java.util.Random;  //Needed for Line 12

public class mathclass {
	public static int validate(String input) {
		int value = 0;
		try {
	        value = Integer.parseInt(input);	        
        }
        catch(NumberFormatException e) {
        	JOptionPane.showMessageDialog(null, input + " isn't a number!");
        	value = validate(JOptionPane.showInputDialog(null, "Re-enter the value, this time a number"));
        }
		return value;
	}
	public static void main(String[] args) {

		int a = validate(JOptionPane.showInputDialog(null, "Enter \"A\"", JOptionPane.INFORMATION_MESSAGE));
		int b = validate(JOptionPane.showInputDialog(null, "Enter \"B\"", JOptionPane.INFORMATION_MESSAGE));
		int c = validate(JOptionPane.showInputDialog(null, "Enter \"C\"", JOptionPane.INFORMATION_MESSAGE));

		
		double eq1 = (-b + Math.sqrt((Math.pow(b, 2) - 4*a*c)))/(2*a);
		double eq2 = (-b - Math.sqrt((Math.pow(b, 2) - 4*a*c)))/(2*a);
		JOptionPane.showMessageDialog(null, "For the equasion y = " + a + "x^2 + " + b + "x + " + "c, the x-intercepts are \n(0, " + eq1 + ")\n(0, " + eq2+")");
		// JOptionPane.showMessageDialog(null, "" + a + b + c);
		
		
	}// end of main
}// end of class