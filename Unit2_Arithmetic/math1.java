/*
Programmer: Max Vogel
Goal:       This program adds two integers that the user chooses
Github:     https://github.com/Mehvix/IntroToComputerProgramming/tree/master/Unit2_Arithmetic
*/

import javax.swing.*;
public class math1
{
      public static void main(String[] args)
      {         
         //Gets numbers to add from user
         int num1 = Integer.parseInt( JOptionPane.showInputDialog("Chose the first number that you want to add:"));
         System.out.println("User chose " + num1);
         
         int num2 = Integer.parseInt( JOptionPane.showInputDialog("Chose the second number that you want to add:"));
         System.out.println("User chose " + num2);

         JOptionPane.showMessageDialog(null, "The sum of your numbers is " + (num1 + num2));

      }//end of main
}//end of class