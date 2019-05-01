/*
Programmer:	Max Vogel
Goal:		Practice loops and functions
			One function will print numbers from 1 - 50
			The other function will be a guessing game
Github:     https://github.com/Mehvix/IntroToComputerProgramming/tree/master/Unit4_Loops
*/

package Unit4_Loops;

public class for_loop_functions {
	
	public static void print_fifty() {
		for (int i = 1; i < 51; i++) {
			if (i%10==0) {
				System.out.println(i);
			} else {
				if(i<11) {
					System.out.print(i + "  ");
				} else {
					System.out.print(i + " ");
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_fifty();
	}

}
