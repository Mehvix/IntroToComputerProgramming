import javax.swing.JOptionPane;

/*
Programmer: Max Vogel
Buzz URL:   https://middleton.agilixbuzz.com/student/109599350/activity/95500d7c8175483bb5501f9cb00e72dc
Github:     https://github.com/Mehvix/IntroToComputerProgramming/tree/master/Unit2_Arithmetic
Goal:       To solve quadratic equasions
*/

//import javax.swing.*; // Allows JOptionpane
//import java.util.Random;  //Needed for Line 12

public class mathclass {
	public static int validate(String input, String var) {  // var is what variable is being entered
		int value = 0;
		try {
	        value = Integer.parseInt(input);  // atempts to make input a int
        }
        catch(NumberFormatException e) {  // if input isn't a number
        	JOptionPane.showMessageDialog(null, input + " isn't a number!");
        	value = validate(JOptionPane.showInputDialog(null, "Re-enter a number for " + var + ", this time make it a number"), var);  // asks for number again
        }
		return value;  // returns input as int
	}
	
	public static void main(String[] args) {
    	JOptionPane.showMessageDialog(null, "For \"y = ax^2 + bx + c\"");  // just incase user forgot the formula or is confused
		int a = validate(JOptionPane.showInputDialog(null, "Enter \"A\"", JOptionPane.INFORMATION_MESSAGE), "a");
		int b = validate(JOptionPane.showInputDialog(null, "Enter \"B\"", JOptionPane.INFORMATION_MESSAGE), "b");
		int c = validate(JOptionPane.showInputDialog(null, "Enter \"C\"", JOptionPane.INFORMATION_MESSAGE), "c");

		
		double eq1 = (-b + Math.sqrt((Math.pow(b, 2) - 4*a*c)))/(2*a);
		double eq2 = (-b - Math.sqrt((Math.pow(b, 2) - 4*a*c)))/(2*a);
		
		if (Double.toString(eq1) == "NaN") {  // if there are no x-ints, eq1 is set to "NaN"
			JOptionPane.showMessageDialog(null, "For the equasion y = " + a + "x^2 + " + b + "x + " + "c, there are no x intercepts");
		} else {
			if (eq1 == eq2) {
				JOptionPane.showMessageDialog(null, "For the equasion y = " + a + "x^2 + " + b + "x + " + "c, there is one x-intercept at the vertex which is at\n(0, " + eq1 + ")");
			} else {
				JOptionPane.showMessageDialog(null, "For the equasion y = " + a + "x^2 + " + b + "x + " + "c, the x-intercepts are \n(0, " + eq1 + ")\n(0, " + eq2+")");
			}
		}
					
		
	}// end of main
}// end of class