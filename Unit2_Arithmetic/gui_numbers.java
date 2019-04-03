/*
Programmer: Max Vogel
Buzz URL:   https://middleton.agilixbuzz.com/student/109599350/activity/19f21703012c4d3983f0fd139e7c7563
Github:     https://github.com/Mehvix/IntroToComputerProgramming/tree/master/Unit2_Arithmetic
Goal:       The program shows how to store number entered
            by the user. It will ask for 2 numbers and 
            find their product, sum, difference, and 
            quotient. We will do this using the JOptionPane!
*/


import javax.swing.*; // Allows JOptionpane

public class gui_numbers
{
      public static void main(String[] args)
      {         
         // Set up for all variables
         double num1, num2;
         String input, choice;
         final int NUMBER_VALUES = 2;  // change this is you're using something other than 2 numbers
         
         // Get number from keyboard and store it as num1
         input = JOptionPane.showInputDialog("Enter number one: Hint: If you want inches to feet, enter how many inches you want");
         num1 = Double.parseDouble(input);
         
         input = JOptionPane.showInputDialog("Enter number two: \nHint: If you want inches to feet, enter any number");
         num2 = Double.parseDouble(input);
         
         
         
         Object[ ] choices = {"Add","Subtract","Multiply","Divide","Average", "Inches to Feet"}; 
         
         
         choice = (String)JOptionPane.showInputDialog(null, "What operation would you like?", null, -1, null, choices,choices[0]);
         
         if(choice == "Add") {
            JOptionPane.showMessageDialog(null, (num1+num2));
         }
         if(choice == "Subtract"){
            JOptionPane.showMessageDialog(null, (num1-num2));
         }
         if(choice == "Multiply"){
            JOptionPane.showMessageDialog(null, (num1*num2));
         }
         if(choice == "Divide"){
            JOptionPane.showMessageDialog(null, (num1/num2));
         }
         if(choice == "Average"){
            JOptionPane.showMessageDialog(null, ((num1+num2)/NUMBER_VALUES));
         }
         if(choice == "Inches to Feet"){
            JOptionPane.showMessageDialog(null, (int)num1 + " inches is equal to:\n" + ((int)(num1)/12) + " feet, " + (int)(num1%12) + " inches" );
         }
      }//end of main
}//end of class