//Thank you for being such an awesome teacher Mrs.Hunt! :)

package Unit6_Arrays;

import javax.swing.JOptionPane;

	public class math_rewrite {
		
		public static String error(String input) {
			JOptionPane.showMessageDialog(null, input + " isn't a valid number!");
			return JOptionPane.showInputDialog(null, "Re-enter a value, this time a number");
		}
	
		public static int check(String input) {
			int x = 0;
			try {
				x = Integer.parseInt(input);
			}
			catch(NumberFormatException e) {
				x = check(error(input)); 
			}

			return x;
		}
		public static void main(String[] args) {
			
			JOptionPane.showMessageDialog(null, "Welcome to my PEMDAS-free calculator!");
			int total_chars = 0;
			while (!(total_chars + 1 > 3) || !(total_chars % 2 != 0)) {
				total_chars = check(JOptionPane.showInputDialog(null, ""
					+ "How many entries do you need?\n"
					+ "Each number and operation counts as one entry, such as:\n"
					+ "'3 / 3' would be 3 entries\n"
					+ "'4 + 3 - 2' would be 5 entries\n"
					+ "'3 - 10 + 3' would be 5 entries\n"
					+ "'10 * 10' would be 3 entries\n"
					+ "NOTE: This needs to be greater than 3 and odd!"));
			}

			Object[ ] operations = {"+","-","/","*", "power"};
			double outcome = 0;
			String op = null; 
			double num = 0;
			
			for (int i = 1; i < total_chars+1; i++) {
				if (i == 1) {
					outcome = Double.parseDouble((String) JOptionPane.showInputDialog("Enter a NUMBER entry for #" + i));
				} else {
					if (i%2==0) {
						op = (String) JOptionPane.showInputDialog(null, "Select an operation for entry #" + i, null, JOptionPane.QUESTION_MESSAGE, null, operations, operations[0]);
					} else {
						num = Double.parseDouble((String) JOptionPane.showInputDialog("Enter a NUMBER entry for #" + i));
						switch(op) {
						case "+": outcome = outcome + num;
							break;
						case "-": outcome = outcome - num;
							break;
						case "*": outcome = outcome * num;
							break;
						case "power": outcome = Math.pow(outcome, num);
							break;
						}
					}
				}
			}

			JOptionPane.showMessageDialog(null, "You're answer is " + outcome)
		}

}
