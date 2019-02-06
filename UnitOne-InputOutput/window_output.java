/*
Programmer: Max Vogel
Demonstrates how 'output' works in java, now with JOptionPane
*/
import javax.swing.*;
import java.util.Random;

public class window_output
{     
   public static void main(String[] args)
   {  
      int number =	new Random().nextInt((999999999 - 100000000) + 1) + 100000000;
      ImageIcon picture = new ImageIcon("checkEm.jpg");
      JOptionPane.showMessageDialog(null, number, "Check 'em:", JOptionPane.ERROR_MESSAGE, picture);
   }
}