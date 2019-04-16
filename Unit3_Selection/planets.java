package Unit3_Selection;

import javax.swing.JOptionPane;

/*
Programmer: Max Vogel
Buzz URL:   https://middleton.agilixbuzz.com/student/109599350/activity/532581ddf2564718bf4bfdf5bcf11861
Github:     https://github.com/Mehvix/IntroToComputerProgramming/tree/master/Unit3_Selection
Goal:       Find out how much you weigh on various planets using switch cases
 */

public class planets {
	public static String error(String input) {
    	return JOptionPane.showInputDialog(null, input + " isn't a valid weight! Re-enter your it");
	}

	public static double check(String input) {
		double x = 0;
		try {
	        x = Double.parseDouble(input);
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
		Object[ ] choices = {"Mercury","Venus","Mars","Jupiter","Saturn","Uranus","Neptune", "Pluto"}; 
		String planet = (String) JOptionPane.showInputDialog(null, "What planet are you visiting?","Planets", JOptionPane.PLAIN_MESSAGE, null, choices,choices[0]);
		final double earth_weight = check(JOptionPane.showInputDialog("What's your earth weight (in pounds)?"));
		double planet_weight = 0;
		final double mercury_weight = 0.38, venus_weight = 0.91, mars_weight = 0.38, jupiter_weight = 2.34, saturn_weight = 1.06, uranus_weight = 0.92, neptune_weight = 1.19, pluto_weight = 0.06;
		
		switch(planet) {
		case "Mercury": planet_weight = earth_weight * mercury_weight; break;
		case "Venus": planet_weight = earth_weight * venus_weight; break;
		case "Mars": planet_weight = earth_weight * mars_weight; break;
		case "Jupiter": planet_weight = earth_weight * jupiter_weight; break;
		case "Saturn": planet_weight = earth_weight * saturn_weight; break;
		case "Uranus": planet_weight = earth_weight * uranus_weight; break;
		case "Neptune": planet_weight = earth_weight * neptune_weight; break;
		case "Pluto": planet_weight = earth_weight * pluto_weight; break;
		}
		
		planet_weight = Math.round(planet_weight * 100) / 100;
		JOptionPane.showMessageDialog(null, "On " + planet + " you would weight " + planet_weight + " pounds.");

	}

}
