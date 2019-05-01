package Unit3_Selection;

/*
Programmer: Max Vogel
Buzz URL:   https://middleton.agilixbuzz.com/student/109599350/activity/9cd03b81ab8a4b15aa850a37ab87bb1e
Github:     https://github.com/Mehvix/IntroToComputerProgramming/tree/master/Unit3_Selection
Goal:       Mark Zuckerburg needs our help!!  He is running out of cheesy facebook quizzes and would like each of you to prepare a fun, accurate, and interesting quiz that will get people to use his program (facebook) more often!
*/


import javax.swing.JOptionPane;


public class personality_quiz {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to Max's Quiz!\nThis will be testing what Age of Empires II (AoK) civiliazation you should choose");
		
		int aztecs = 0, 
				britons = 0, 
				byzantine = 0, 
				celts = 0, 
				chinese = 0, 
				franks = 0, 
				goths = 0, 
				huns = 0, 
				japanese = 0, 
				koreans = 0, 
				mayans = 0, 
				mongols = 0, 
				perisans = 0, 
				saraceans = 0, 
				spanish = 0, 
				teutons = 0, 
				turks = -1,  // -1 because turks are bad
				vikings = 0;
		
		// Question 1
		Object[ ] choices1 = {"Arabia","Black Forest","Arena","Nomad", "Water", "Random"}; 
		String q1 = (String) JOptionPane.showInputDialog(null, "What map do you play most?","Map", JOptionPane.QUESTION_MESSAGE, null, choices1, choices1[5]);
		switch(q1) {
		case "Arabia": aztecs += 10; mongols += 10; huns +=10; break;
		case "Black Forest": celts += 10; britons +=10; goths += 10; spanish +=10; break;
		case "Arena": goths += 20; break;
		case "Nomad": chinese += 10; huns += 10; break;
		case "Water": vikings += 10; japanese += 10; koreans+=10; break;
		case "Random": mayans += 10; break;
		}
		
		// Question 2
		Object[ ] choices2 = {"1v1", "2v2", "3v3", "4v4"}; 
		String q2 = (String) JOptionPane.showInputDialog(null, "What game size do you play?","Game Size", JOptionPane.QUESTION_MESSAGE, null, choices2, choices2[0]);
		switch(q2) {
		case "1v1": aztecs += 10; huns +=10; chinese += 5; break;
		case "2v2": aztecs += 10; huns +=10; chinese += 5; break;
		case "3v3": chinese += 10; spanish +=10; goths +=10; break;
		case "4v4": chinese += 10; spanish +=10; goths +=10; break;
		}
		
		// Question 3
		Object[ ] choices3 = {"Feuduel Age", "Castle Age", "Imperial Age", "Post Imp Trade Hell"}; 
		String q3 = (String) JOptionPane.showInputDialog(null, "When do you want to attack/end?","Game Length", JOptionPane.QUESTION_MESSAGE, null, choices3,choices3[0]);
		switch(q3) {
		case "Feuduel Age": aztecs += 10; huns+=10; break;
		case "Castle Age": britons += 10; franks +=10; mongols +=10; mayans +=10; break;
		case "Imperial Age": celts += 10; byzantine+=10; break;
		case "Post Imp Trade Hell": spanish += 10; perisans +=10; saraceans +=10; goths +=10; break;
		}

		// Question 4
		Object[ ] choices4 = {"Military", "Economy"}; 
		String q4 = (String) JOptionPane.showInputDialog(null, "When do you want to attack/end?","Game Length", JOptionPane.QUESTION_MESSAGE, null, choices4,choices4[0]);
		switch(q4) {
		case "Military": huns +=10; goths +=10; mongols += 10; britons +=10; celts +=10; aztecs += 13; break;
		case "Economy":  mayans += 10; spanish +=10; teutons += 10; break;
		}
		

		// Question 5
		Object[ ] choices5 = {"Melee", "Ranged", "Seige", "Cavalry", "Monks", "Navy"}; 
		String q5 = (String) JOptionPane.showInputDialog(null, "What type of units do you like to play with", "Units", JOptionPane.QUESTION_MESSAGE, null, choices5,choices5[0]);
		switch(q5) {
		case "Melee": aztecs += 20; teutons += 10; goths += 10; japanese += 8; break;
		case "Ranged": spanish += 8; britons += 20; chinese += 10; japanese += 8; mayans += 15; mongols += 14; perisans += 7; break;
		case "Seige": celts += 14; japanese += 7; break;
		case "Cavalry": spanish += 5; byzantine += 13; franks += 21; huns += 13; mongols += 14; perisans += 7; saraceans += 11; break;
		case "Monks": spanish += 5;  mayans += 10; break;
		case "Navy":  vikings += 20; koreans += 7; break;
		}
		
		// gets location of maximum value in list of civs
		int[] allcivvalues = new int[] {aztecs, britons, byzantine, celts, chinese, franks, goths, huns, japanese, koreans, mayans, mongols, perisans, saraceans, spanish, teutons, turks, vikings};
		int max = Integer.MIN_VALUE;
		int location = 0;
		for(int i = 0; i < allcivvalues.length; i++) {
			if(allcivvalues[i] > max) {
				max = allcivvalues[i];
				location = i;
			}
		}
		
		String[] allcivs = new String[] {"Aztecs", "Britons", "Byzantine", "Celts", "Chinese", "Franks", "Goths", "Huns", "Japanese", "Koreans", "Mayans", "Mongols", "Perisans", "Saraceans", "Spanish", "Teutons", "Turks", "Vikings"};
		String bestciv = allcivs[location];  // gets name of the civ given to location
				
		JOptionPane.showMessageDialog(null, "Given that you play " + q2 + " " +  q1 + " games that last until " + q3 + ", and that you focus on " +q4 + " and use " + q5 + " units,\n"
							+ " I believe that you should choose " + bestciv + " in your next game");

		
	}

}
