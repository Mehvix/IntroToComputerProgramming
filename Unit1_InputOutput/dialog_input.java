/*
Programmer: Max Vogel
Goal:       Demonstrates how 'input' works in java
Github:     https://github.com/Mehvix/IntroToComputerProgramming/tree/master/Unit1_InputOutput
*/

import javax.swing.*;  //For JOptionPane

public class dialog_input
{  
   public static void main(String[] args)
   {
      String name; // Question variables

      name = JOptionPane.showInputDialog(null, "What's your name?", "Question 1", 3);  //Asks user for 'name', being there name.
 
      if (name.isEmpty()) {
         JOptionPane.showMessageDialog(null, "You need to enter a name!.", "Hey!", 0); 
         return;
      } else {
         JOptionPane.showMessageDialog(null, "Hello " + name + ", nice to meet you.", "Greetings", 1);  //Calls 'name' to say Hi back
      }
      
      JOptionPane.showInputDialog(null, "If you don't mind, how old are you?", "Question 2", 3);

      String[] choices = {"Yellow", "Orange", "Red", "Pink", "Purple", "Blue", "Green", "Brown", "Black"};
      JOptionPane.showInputDialog(null, "What's your favourite color?", "Qustion 3", 3, null, choices, choices[1]);
   }
}