/*------------------------------------------------------------
// AUTHOR: JACOB BELL<ID #1218096321>
// FILENAME: Lab4.java
// SPECIFICATION: Calculations Menu
// FOR: CSE 110- <Class #83311> Lab #4
// TIME SPENT: 5.5 Hours //-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab4 {
	public static void main(String[] args) 
	{
		// Variables
		Scanner scanner = new Scanner( System.in );
		int case_1_input = 0;
		long case_2_input = 0;
		int case_3_input = 0;
		int choice = 0;
	
		do {
			
			// Display the Menu
			displayMenu();
			choice = scanner.nextInt();
			
			//Begin Switch Including Four Cases 
			switch( choice ) {
			
			// Calculating The Sum of 1 to a Number
			case 1 :
				
				int sum = 0;
				
				System.out.println("Enter a number: ");
				case_1_input = scanner.nextInt();
				
					for(int i = 1; i <= case_1_input; i++ ) 
					{
						sum = sum + i;
					}
					
					// Print The Result Outside of The Loop
					System.out.println( "The sum of 1 to " + case_1_input + " is " + sum );
					System.out.println();
					
				break;
			
			// Calculating the Factorial
			case 2 :
				
				int factorial = 1;
				
				System.out.println("Enter a number: ");
				case_2_input = scanner.nextInt();
				
					for(int i = 1; i <= case_2_input; i++ ) 
					{
						factorial = factorial * i;
					}
					
					// Print The Result Outside of The Loop
					System.out.println( "The factorial of " + case_2_input + " is " + factorial );
					System.out.println();
					
				break;
			
			// Display The Leftmost Digit
			case 3 :
				
				System.out.println("Enter a number: ");
				case_3_input = scanner.nextInt();
				int left_digit = case_3_input;
				
					while( left_digit >= 10)
					{
						left_digit /= 10;	
					}
				
					// Print The Result Outside of The Loop
					System.out.println( "The leftmost digit of " + case_3_input + " is " + left_digit );
					System.out.println();
				
				break;
				
			// Quit Option
			case 4 :
				
				System.out.println("Bye");
			}
			
		// While Loop While The Choice is Not 4...Open The Menu
		} while (choice != 4);
			
		scanner.close();
		
	}

	// Print Menu
	private static void displayMenu() { 
		System.out.println("Please choose one option from the following menu:");  
		System.out.println("1) Calculate the sum of integers from 1 to m");    
		System.out.println("2) Calculate the factorial of a given number");      
		System.out.println("3) Display the leftmost digit of a given number");   
		System.out.println("4) Quit");
	
	}
}

	
	