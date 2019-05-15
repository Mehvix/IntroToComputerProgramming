package Unit5_Strings;

/*
Programmer: Max Vogel
Github:     https://github.com/Mehvix/IntroToComputerProgramming/tree/master/Unit4_Loops
Purpose: 	this program goes through some of the String class methods
			
*/

import javax.swing.*;
public class stringclassAssignment
{
	public static void main(String[] args)
	{
		/*
		This is where you copy/paste the code we wrote in class
		String word = "programming";
		String partial1 = word.substring(5);
		System.out.println("partial1 variable has a value: "+partial1);
		String partial2 = word.substring(3,7);
		System.out.println("partial2 is "+partial2);
		*/
		
		
		//1.	Write code that will read in a word from the user and tell the user how long the word is
		String input = JOptionPane.showInputDialog("[1] Enter a word!");
		int input_length = input.length();
		JOptionPane.showMessageDialog(null, input + " is " + input_length + " charaters long");
		
		//2.	Print out the 3rd letter of the word
		input = JOptionPane.showInputDialog("[2] Enter a word!");
		if (input.length() < 3) {
			JOptionPane.showMessageDialog(null, "You entered a word less than three characters :(");
		} else {
			char input_third = input.charAt(2); // because indexs start at 0
			JOptionPane.showMessageDialog(null, input + "'s third letter is " + input_third);
		}

		//3.	Replace all of the "a"s in the word with an "*"
		input = JOptionPane.showInputDialog("[3] Enter a word!");
		String new_input = input.replace('a','*');
		JOptionPane.showMessageDialog(null, "With \"a\"s:\t " + input + "\nWith Replacement:\t\t " + new_input);
		
		//4.	Ask the user to enter another word
		String input1 = JOptionPane.showInputDialog("[4] Enter the first word!");
		 
		//5.	Create a new word that is the first word entered and the 2nd 
		//		word entered put together
		String input2 = JOptionPane.showInputDialog("[5] Enter the second word!");
		String input_combination = input1.concat(input2);
		JOptionPane.showMessageDialog(null, input1 + " and " + input2 + " make\n" + input_combination);
		
		//6.	Print out the middle 3 letters of the word
		input = JOptionPane.showInputDialog("[6] Enter a word!");
		if (input.length() < 3) {
			JOptionPane.showMessageDialog(null, "You entered a word less than three characters :(");
		} else {
			String middle;
			int middleindex = input.length()/2 + 1;
			int before = middleindex - 1;
			int after = middleindex + 1;
			middle = input.substring(before, after+1);
			JOptionPane.showMessageDialog(null, "The middle 3 characters of " + input + " are " + middle);
		}
			
		//7.	Search through the word for the letter "a" and print
		//		out the index for where the letter "a" appears first.
		input = JOptionPane.showInputDialog("[7] Enter a word!");
		if (input.toLowerCase().equals(input.toLowerCase().replace("a", " "))) {
			JOptionPane.showMessageDialog(null, "There are no \"a\"s in the word");
		} else {
			for (int i = 0; i < input.length(); i++) {
				char x = input.charAt(i);
				String c = "" + x;
				System.out.println(c);
				if (c.toLowerCase().equals("a")) {
					JOptionPane.showMessageDialog(null, "The first \"a\" in the string is at " + i);
					break;
				}
			}
		}
		
		//8.	Check to see if the word entered is all capital letters,
		//		all small letters, or a mixture of capitals and small letters 
		input = JOptionPane.showInputDialog("[8] Enter a word!");
		String allcap = input.toUpperCase();
		String alllow = input.toLowerCase();
		
		if (input.equals(allcap)) {
			JOptionPane.showMessageDialog(null, "The text entered is all upercase");
		} else {
			if (input.equals(alllow)) {
				JOptionPane.showMessageDialog(null, "The text entered is all lowercase");
			} else {
				JOptionPane.showMessageDialog(null, "The text entered is a mix");
			}
		}
	}
}

