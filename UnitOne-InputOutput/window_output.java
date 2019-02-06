/*
Programmer: Max Vogel
Demonstrates how 'output' works in java, now with JOptionPane
*/
import javax.swing.*;
import java.util.Random;  //Needed for Line 12

public class window_output
{     
   public static void main(String[] args)
   {  
      int number =	new Random().nextInt((999999999 - 100000000) + 1) + 100000000;  //Gets random number between 100000000 and 999999999
      ImageIcon picture = new ImageIcon("checkEm.jpg");  //Gets image file
      JOptionPane.showMessageDialog(null, number, "Check 'em", JOptionPane.ERROR_MESSAGE, picture);  //Actual window pop=up
   }
}