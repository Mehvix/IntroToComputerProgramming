package Unit6_Arrays;

/*
Programmer:	Max Vogel
Program: 	This program is our array keyin
*/

import java.util.*; //for the Random class and Scanner
import javax.swing.*; //for JOptionPanes

public class arrayKeyin
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


public static void main (String[] args)
{
	// A. ask the user how many students they have
	int student_num = check(JOptionPane.showInputDialog("Enter the number of students you have:")) + 1;

	// B. create an array to hold the list of student names
	String[] student_list = new String[student_num];
	
	// C.ask user to enter student names and store them in the array
	for (int i = 1; i < student_num; i++) {
		String new_name = JOptionPane.showInputDialog("Enter the name for student #" + i);
		student_list[i] = new_name;
	}
	
	// D. Write code that will Randomly select one student from the list of names
	Random rand = new Random();
	int rannum = rand.nextInt(student_num);
	JOptionPane.showMessageDialog(null, "Random student: " + student_list[rannum]);
	
	// E. Write code that will also ask the user to enter the computer number (an integer)
	// and store it in an integer array called compNums
	int[] compNums = new int[student_num];
	for (int i = 1; i < student_num; i++) {
		int comp_num = check(JOptionPane.showInputDialog("Enter the computer number for " + student_list[i]));
		compNums[i] = comp_num;
	}
	
	// F. Ask the user which computer s/he is looking for
	int looking_for = check(JOptionPane.showInputDialog("What computer number are you looking for?"));

	// G. Write code that will find the name of the student that has that computer
	for (int i = 1; i <= looking_for; i++) {
		try {
			if(compNums[i] == looking_for) {
				JOptionPane.showMessageDialog(null, student_list[i] + " is at computer #" + looking_for);
				break;
			}
		}
		catch (java.lang.ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "There is no student at computer #" + looking_for);
			break;
		}
		if (i == looking_for) {
			JOptionPane.showMessageDialog(null, "There is no student at computer #" + looking_for);
		}
	}
}
}
