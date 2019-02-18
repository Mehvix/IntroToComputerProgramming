/*
Programmer: Max Vogel
Latest Version: https://github.com/Mehvix/IntroToComputerProgramming/tree/master/UnitOne-InputOutput
*/

import javax.swing.*;

public class madlib { 
    public static void main(String[] args){
         //Declaring String Variables
         String verb, name, adjective;
         
         //DropDown Menu options
         String[ ] verbitems = {"Run", "Jump", "Dance", "Sit"};
         
         //Introduction Dialogue
         JOptionPane.showMessageDialog(null, "Welcome to Max Vogel's Madlib!\n Madlib works by you giving random words with the only parameter being the part of speech, afterwards you will see what your story becomes.", "Hello There!",-1);
         
         //Madlib Questions
         name = (String)JOptionPane.showInputDialog(null,"Give me a person's name", "Name", -1, null, null, null); 
         verb = (String)JOptionPane.showInputDialog(null,"Give me a verb", "Verb", -1, null, verbitems, verbitems[0]);
         adjective = (String)JOptionPane.showInputDialog(null, "Give me an adjective", "Adjective", -1, null, null, null);
         
         //Outcome
         JOptionPane.showMessageDialog(null, "There once was a person named " + name + "\nWho " + verb + adjective + " every day.", "Your MadLib", -1, null);
   }

}