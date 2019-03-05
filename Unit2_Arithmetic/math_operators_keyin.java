/*
Programmer: Lori Hunt
This program shows how the math operators
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

What is the difference between the two division lines of code?

What does the % symbol do?

Why do the last 2 lines of code give different answers?

How does the order of operations work in Java?

*/