/*
Programmer: Max Vogel
Latest Version: https://github.com/Mehvix/IntroToComputerProgramming/tree/master/UnitOne-InputOutput
*/

import javax.swing.*;

public class madlib { 
    public static void main(String[] args){
         //Declaring String Variables
         String noun, verb, name, name2, adjective;
         
         //DropDown Menu options
         String[ ] verbitems = {"Run","Jump","Dance", "Sit"};
         //Introduction Dialogue
         JOptionPane.showMessageDialog(null, "Welcome to Max Vogel's Madlib!", "Hello There!",-1);
         JOptionPane.showMessageDialog(null, "Madlib works by you giving random words with the only parameter being the part of speech, afterwards you will see what your story becomes", "Instructions", -1, null);
         
         //Madlib Questions
         name = (String)JOptionPane.showInputDialog(null,"Give me a person's name", "Name", -1, null, null, null); 
         name2 = (String)JOptionPane.showInputDialog(null,"Give me another person's name", "Mame", -1, null, null, null);
         noun = (String)JOptionPane.showInputDialog(null,"Give me a noun", "Noun", -1, null, null, null);
         verb = (String)JOptionPane.showInputDialog(null,"Give me a verb?", "Verb", -1, null, verbitems, verbitems[2]);
         adjective = (String)JOptionPane.showInputDialog(null, "Give me an adjective?", "Adjective", -1, null, null, null);
         //Outcome
         JOptionPane.showMessageDialog(null, "There once was a brave lad named " + name + "\nWith a fi fi fiddle dee dee, \nwho face a" +adjective + noun + "\n while "+ name2+ " just needed to "+ verb, "Your MadLib", -1, null);
   }

}