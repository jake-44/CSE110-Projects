/*------------------------------------------------------------
// AUTHOR: JACOB BELL <ID #1218096321>
// FILENAME: Assignment04.java
// SPECIFICATION: Mastermind Game
// FOR: CSE 110 <Class #83311> - Assignment 04
// TIME SPENT: 5 Hours //-----------------------------------------------------------*/

import java.util.Scanner;

public class Assignment04 {
	
	public static void main(String[] args) 
	{    
		// Initialize Variables
		String secret_num;
		Scanner scanner = new Scanner(System.in);
		String user_num;
		String choice;
		int num_guesses = 1, first_num_matches, second_num_matches, third_num_matches, forth_num_matches;
		char user_num1, user_num2, user_num3, user_num4;
		char secret_num1, secret_num2, secret_num3, secret_num4;
		
		// Startup
		do {
			
			// Reset Secret Number and Number of Matches After Every Game
			secret_num = ""+((int)(Math.random()*9000)+1000);
			int num_matches = 0;
			System.out.println("------ MASTERMIND ------");
			System.out.println("Guess the 4 digit number!");
			System.out.println();
			
		// While (For) num_matches != 4 Loop
		for (num_guesses = 1; num_matches != 4; num_guesses++) {	
			System.out.println("Guess " + num_guesses + ": ");
			user_num = scanner.nextLine();
				
				// First Number 
				user_num1 = user_num.charAt(0);
				secret_num1 = secret_num.charAt(0);
				
				if(user_num1 == secret_num1) {
					first_num_matches = 1;
					}
				else 
				{
					first_num_matches = 0;
				}
				
				// Second Number
				user_num2 = user_num.charAt(1);
				secret_num2 = secret_num.charAt(1);
				
				if(user_num2 == secret_num2) {
					second_num_matches = 1;
				}
				else
				{
					second_num_matches = 0;
				}
				
				// Third Number
				user_num3 = user_num.charAt(2);
				secret_num3 = secret_num.charAt(2);
				
				if(user_num3 == secret_num3) {
					third_num_matches = 1;
				}
				else 
				{
					third_num_matches = 0;
				}
				
				// Forth Number
				user_num4 = user_num.charAt(3);
				secret_num4 = secret_num.charAt(3);
				
				if(user_num4 == secret_num4) {
					forth_num_matches = 1;			
				}
				else
				{
					forth_num_matches = 0;			
				}
				
				// Print Number of Matches After Every Guess
				num_matches = first_num_matches + second_num_matches + third_num_matches + forth_num_matches;
				System.out.println("You Matched " + num_matches);
				System.out.println();
				
				// Break the Loop if Matches Equal 4
				if (num_matches == 4){
					
					break;
					
				}
		}
			
			// User Wins the Game. Show Amount of Guesses It Took
			if (num_matches == 4) {
				System.out.println("Congratulations! You Guessed the right number in " + num_guesses + " guesses.");
				}
			
				// Ask The User if They Would Like to Play Again
				System.out.println("Would you like to pay again (yes/no)?");
				choice = scanner.nextLine();
			
		// Go to Startup Do Loop if User Types "yes"
		} while(choice.equals("yes"));
		
		// else, Say Goodbye
		System.out.println("Bye!");
		
		scanner.close();
	}
}
	

	

