/*
Programmer: Max Vogel
Demonstrates how 'input' works in java
*/

import javax.swing.*;  //For JOptionPane
import java.util.*;  //For getting data from console

public class dialog_input
{  
   public static void main(String[] args)
   {
      // Question variables
      String name;
      String age;
      String fav_color;
            
      name = JOptionPane.showInputDialog(null, "What's your name?", "Question 1", 1);  //Asks user for 'name', being there name.
 
      if (name.isEmpty()) {
         JOptionPane.showMessageDialog(null, "You need to enter a name!."); 
         return;
      } else {
         JOptionPane.showMessageDialog(null, "Hello " + name + ", nice to meet you.");  //Calls 'name' to say Hi back
      }
      
      age = JOptionPane.showInputDialog(null, "If you don't mind, how old are you?", "Question 2", 1);
      
      String[] colors = {"yellow", "orange", "red", "pink", "purple", "blue", "green", "brown", "black"}; 
      //fav_color = JOptionPane.showInputDialog(null, "What's your favorite color?","Question 3", 1, colors, colors[0]);
   }
}