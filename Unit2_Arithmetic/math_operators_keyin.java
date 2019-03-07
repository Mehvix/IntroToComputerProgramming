/*
Programmer: Max Vogel
Buzz URL:   https://middleton.agilixbuzz.com/student/109599350/activity/08069cda937741839783b67200229b19
Github:     https://github.com/Mehvix/IntroToComputerProgramming/tree/master/Unit2_Arithmetic
Goal:       This program shows how the math operators
            work in java
*/
public class math_operators_keyin
{
   public static void main(String[] args)
   {
         
         int order_of_ops;
         System.out.println("Add two numbers: "+7+5);
         System.out.println("Add two numbers: "+(7+5));
         System.out.println("multiply two numbers: "+(7*5));
         System.out.println("Divide two numbers: "+ 7/5);
         System.out.println("Divide  two numbers: "+ 7/5.0);
         System.out.println("Mod two numbers: "+(7%5));
         
         order_of_ops = 7 * 3 + 5 * 2;
         System.out.println("Order of ops without variable: "+ 7 * 3 + 5 * 2);
         System.out.println("Order of ops with variable: " + order_of_ops);
   }
}
/*
What is the significant difference between the first and second line?
This first line adds seven and five as strings while the second line adds seven and five as integers

What is the difference between the two division lines of code?
The first division line is an integer, meaning it cannot have decimals. The second line has a double, meaning that it can contain decimals.

What does the % symbol do?
% means 'Mod', and it finds the remainder of two variables after you divide them

Why do the last 2 lines of code give different answers?
Because variables can do order of operations

How does the order of operations work in Java?
If you want to do the order of operations, you need it fo be in a variable
*/