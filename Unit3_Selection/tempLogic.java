package Unit3_Selection;

/*
We want to write a program that will let someone know if the temperature entered is Too hot, hot, mild, cold, or too cold.

>97 = too hot
85-96 = hot
70-84 = mild
40 - 69 = cold
<68 = too cold
*/

import javax.swing.*;

public class tempLogic
{
   public static void main(String[] args)
   {
      String input;
      String outputstatement = "";
      input = JOptionPane.showInputDialog("Enter the temperature: ");
      int temp = Integer.parseInt(input);
      
      if(temp >= 97)
      {
         outputstatement = "It is too hot!";
      }
      
      if(temp < 97 && temp >= 85)
      {
         outputstatement = "It is hot.";
      }
      
      if(temp < 85 && temp >= 70)
      {
         outputstatement = "It is mild";
      }
      
      if(temp < 70 && temp >=40)
      {
         outputstatement = "It is cold.";
      }
      
      if(temp < 40)
      {
         outputstatement = "It is freezing cold!";
      }
   JOptionPane.showMessageDialog(null,outputstatement);
   }
}

/*
1.  Does this program work properly?  How can you be sure?


2.  Describe the similarities and differences between this program and tempNesting.java

*/