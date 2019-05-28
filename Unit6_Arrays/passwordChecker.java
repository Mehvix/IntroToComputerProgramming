package Unit6_Arrays;

/*
Name: Max Vogel
Password starter kit
This program will check the strenght of a password
*/

import java.util.Scanner;

import javax.swing.*;
public class passwordChecker
{
	 
	// long_enough: this method will take a String as a parameter
	// and return aboolean true -> The String is over 8 characters,
	// false --> The String is not over 8 characters
	public static boolean long_enough(String p)
	{
		if (p.length() > 8) {
			return true;
		} else {
			return false;
		}
	}
	
	// has_special: this method will take a String as a parameter and
	// return a boolean true if there is a special character (!@#$%^&*)
	// and false if not
	public static boolean has_special(String p)
	{
		boolean verdict = false;
		String specials = "@#$%^&*()_+=-}{[]|?><`~\\";

		String[] special_array = specials.split("");
		String[] p_array = p.split("");

		for (int i = 0; i < p.length(); i++) {
			if (specials.contains(p_array[i])) {
				verdict = true;
			}
		}
		return verdict;

	}
	
	// is_mixture: this method will take a String as a parameter and
	// return a boolean true if there is a mixture of capital and small
	// letters and a false if not
	public static boolean is_mixture(String p)
	{
		String all_cap = p.toUpperCase();
		String all_low = p.toLowerCase();
		
		if (p.equals(all_cap)) {
			return false;
		} else {
			if (p.equals(all_low)) {
				return false;
			} else {
				return true;
			}
		}
	}
	
	public static void main(String[] args)
	{
		String password;
		// get a password from the user:
		System.out.println("Enter your password:");
		Scanner input = new Scanner(System.in);
		password = input.nextLine();
	
		// determine if the password is strong or weak/
		// let the user know what they need to doto make it strong
		
		int 
		points = 0;
		if (long_enough(password)) {
			points += 2;
			System.out.println("Good job!\t Your password is longer than 8 characters");
		} else {
			System.out.println("Uh oh!\t\t Your password is shorter than 8 characters");
		}
		
		if 	(has_special(password)) {
			points += 5;
			System.out.println("Good job!\t Your password has special characters");
		} else {
			System.out.println("Uh oh!\t\t Your doesn't contain any special characters");
		}
		if (is_mixture(password)) {
			points += 3;
			System.out.println("Good job!\t Your password is a mix of upper and lower case characters");
		} else {
			System.out.println("Uh oh!\t\t Your password isn't a mix of upper and lower case characters");
		}
		System.out.println("Your password got a score of " + points + "/10");

	
	}
}