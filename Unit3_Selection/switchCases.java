package Unit3_Selection;

/*
Programmer: Max Vogel
Buzz URL:   
Github:     https://github.com/Mehvix/IntroToComputerProgramming/tree/master/Unit3_Selection
Goal:       Demonstrate how switch-cases work
 */

import javax.swing.*;

public class switchCases {
	
	public static void main(String[] args) {
		String num_grade = JOptionPane.showInputDialog("Give me a the students grade (1 - 4)");

		String letter_grade;
		
		switch(num_grade) {
			case "1": letter_grade = "D";
				break;
			case "2": letter_grade = "C";
				break;
			case "3": letter_grade = "B";
				break;
			case "4": letter_grade = "A";
				break;
			default: letter_grade = "N/A";
				break;
		}
		
		JOptionPane.showMessageDialog(null, "Your grade is " + letter_grade);
		
	}

}
