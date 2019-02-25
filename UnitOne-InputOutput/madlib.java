/*
Programmer: Max Vogel
Goal: Educate gradeschool students on what a noun, verb, and adjective are.
Buzz URL: https://middleton.agilixbuzz.com/student/109599350/activity/f4678f6a76be45ab847e519702ca49e7
Latest Version: https://github.com/Mehvix/IntroToComputerProgramming/tree/master/UnitOne-InputOutput
*/

import javax.swing.*;

public class madlib { 
    public static void main(String[] args){
         String verb0, name0, adjective0, adjective1, noun0;  //Declaring String Variables
         String[ ] verbitems = {"Read", "Drove", "Ran", "Wrote"};  //Dropdown Menu options for verb
         
         //Introduction Dialogue
         JOptionPane.showMessageDialog(null, "Welcome to Max Vogel's Madlib!\n Madlib works by you giving random words with the only parameter being the part of speech, afterwards you will see what your story becomes.", "Hello There!",-1);
         
         //Madlib Questions
         name0 = (String)JOptionPane.showInputDialog(null,"Give me a person's name", "Name", -1, null, null, null); 
         verb0 = (String)JOptionPane.showInputDialog(null, "Give me a paste tesnse verb\nThis is an action or state between two things.\nExamples:\n· Listened\n· Swam\n· Ate", "Verb", -1, null, verbitems, verbitems[0]);
         adjective0 = (String)JOptionPane.showInputDialog(null, "Give me an adjective\nThis is a discribing work\n\nExamples:\n· Heavy\n· Fast\n· Green", "Adjective", -1, null, null, null);
         adjective1 = (String)JOptionPane.showInputDialog(null, "Give me different adjective\nThis is a discribing work\n\nExamples:\n· Nice\n· Warm\n· Soft", "Adjective", -1, null, null, null);
         noun0 = (String)JOptionPane.showInputDialog(null, "Give me an noun\nThis is a person, place, or thing\n\nExamples:\n· Wisconsin\n· Chair\n· Teacher", "Noun", -1, null, null, null);

         //Outcome
         JOptionPane.showMessageDialog(null, "There once was a person named " + name0 + "\nWho " + verb0 + " " + adjective0 + " every day with there " + adjective1 + " " + noun0 + ".", "Your MadLib", -1, null);
   }

}