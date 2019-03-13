/*
Program: DateDemo.java
Programmer: Max Vogel
Purpose: This program illustrates the date and time class in the java API
see http://www.tutorialspoint.com/java/java_date_time.htm for more info
*/
import java.util.*;
import java.text.*;
import javax.swing.*;
public class DateDemo {
   public static void main(String args[]) {
	   Date today = new Date( );
      
	   JOptionPane.showMessageDialog(null,today);
	   JOptionPane.showMessageDialog(null, String.format("%tA",today));
     
	   SimpleDateFormat format1 = new SimpleDateFormat ("'Today is ' EEEEEEEEE ' the Date is ' MM-dd-yyyy ' and the Time is ' hh:mm a zzz ");
	   SimpleDateFormat format2 = new SimpleDateFormat("MM d ',' yyyy");
	   SimpleDateFormat format3 = new SimpleDateFormat("hh:mm a");

       
	   JOptionPane.showMessageDialog(null,"Current Date in the first format: " + format1.format(today));
	   JOptionPane.showMessageDialog(null,"Current Date in the second format: " + format2.format(today));
	   JOptionPane.showMessageDialog(null,"It's " + format3.format(today));
	   
	   JOptionPane.showMessageDialog(null, "Hello There", String.format("%tD",today), 1);


   }
}

/* Discuss with your elbow partner and answer...
1. What is the formatting on the date when you just print it out without specifying anything else? (line 18)  
The entire date

2.  What does line 21 do that line 18 does not do?
It's exclusively the day (so Wednesday)

3.  Add a line of code that will print out the date formatted month/day/year
Done!

4.  Print out at least 3 other formatted dates and times. 
   SimpleDateFormat format1 = new SimpleDateFormat ("'Today is ' EEEEEEEEE ' the Date is ' MM-dd-yyyy ' and the Time is ' hh:mm a zzz ");
   SimpleDateFormat format2 = new SimpleDateFormat("MM d ',' yyyy");
   SimpleDateFormat format3 = new SimpleDateFormat("hh:mm a");

5.  Make the date show up in the title bar of a dialog box.  Write the code you use below:
	JOptionPane.showMessageDialog(null, "Hello There", String.format("%tD",today), 1);
*/