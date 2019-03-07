/*
Programmer: Max Vogel
Buzz URL:   
Github:     https://github.com/Mehvix/IntroToComputerProgramming/tree/master/Unit2_Arithmetic
Goal:       The program shows how to store number entered
            by the user. It will ask for 2 numbers and 
            find their product, sum, difference, and 
            quotient. We will do this using the terminal!
*/


import java.util.*;  // Allows terminal/scanner

public class terminal_numbers
{
      public static void main(String[] args)
      {         
         // Set up for scanner
         Scanner input = new Scanner(System.in);
      
         // Set up for all variables
         int num1, num2;
         boolean product, sum, difference, quotient;
         
         
         // Get number from keyboard and store it as num1
         System.out.print("Enter a Integer:");
         num1 = input.nextInt();
         
         // Again
         System.out.print("Enter another Integer:");
         num2 = input.nextInt();

         // Ask for info
         System.out.print("What operation do you want? \n[1] Product\n[2] Difference\n[3] Sum\n[4] Quotient\n[5] All of them!\n");
         int choice = input.nextInt();
         
         if(choice == 1 || choice == 5) {
            System.out.println("[1]: " + (num1+num2));
         }
         if(choice == 2 || choice == 5){
            System.out.println("[2]: " + (num1-num2));
         }
         if(choice == 3 || choice == 5){
            System.out.println("[3]: " + (num1*num2));
         }
         if(choice == 4 || choice == 5){
            System.out.println("[4]: " + (num1/num2));
         }
      }//end of main
}//end of class