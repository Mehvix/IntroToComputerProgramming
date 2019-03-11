/*
Program: DateDemo.java
Programmer: Lori Hunt
Purpose: This program illustrates the date and time class in the java API
see http://www.tutorialspoint.com/java/java_date_time.htm for more info
*/
import java.util.*;
import java.text.*;
import javax.swing.*;
public class DateDemo {
   public static void main(String args[]) {
      //instantiate a Date object (or 'create a Date variable')
      Date today = new Date( );
      
      
      
      //Print the date just using the dNow object (defined above)
      JOptionPane.showMessageDialog(null,today);
      
     // I can use one of the  basic formatting tags:
     JOptionPane.showMessageDialog(null, String.format("%tA",today);
     
      // I can decide how I want the date to get printed out by using  the SimpleDateFormat class.
      // Notice the letters E, M, d, y, h, a, z?  This is from the list in your packet (Simple Date Format codes)
      
      // first I have to set up the 'rules' for the SimpleDateFormat and give them a name. Here I am calling mine
      // prettyformat1 and prettyformat2
      SimpleDateFormat prettyformat1 = 
      new SimpleDateFormat ("'today is ' EEEEEEEEE ' the date is ' MM-dd-yyyy ' and the time is ' hh:mm a zzz ");
      
      SimpleDateFormat prettyformat2 = new SimpleDateFormat("MM d ',' yyyy");
           
      
      //Now I can use prettyformat1 and prettyformat2 to format the date in my own way:
       JOptionPane.showMessageDialog(null,"Current Date in the first pretty format: " + prettyformat1.format(today));

      JOptionPane.showMessageDialog(null,"Current Date in the second pretty format: " + prettyformat2.format(today));
      
   }
}

/* Discus with your elbow partner and answer...
1. What is the formatting on the date when you just print it out without specifying anything else? (line 18)  

2.  What does line 21 do that line 18 does not do?

3.  Add a line of code that will print out the date formatted month/day/year

4. What does the capital E in line 29?  Why so many? (put in only one E - what happens?
put in EEE, what happens?)


5.  Create your own SimpleDateFormat and call it by your name (ex: hunt_format). Test this new
    simple date format by printing it out.

6.  Make the date show up in the title bar of a dialog box.  Write the code you use below:


7. Play around with printing out dates with different formats.  Write what you
tried below:
*/