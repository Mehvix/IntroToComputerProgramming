/*
Programmer: Max Vogel
Goal:       See what the computer is thinking
Buzz URL:   
Github:     https://github.com/Mehvix/IntroToComputerProgramming/tree/master/Unit2_Arithmetic
*/

import javax.swing.*;
public class math_operations
{
      public static void main(String[] args)
      {         
         int numA = 3;
         int numB = -1;
         int numC = 2;
         
         numA = numB + numC;  //1
         numC *= 2;           //4
         numB = 15%numC;      //3
         
         System.out.println(numA);
         System.out.println(numB);
         System.out.println(numC);
      }//end of main
}//end of class