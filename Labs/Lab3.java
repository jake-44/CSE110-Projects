/*------------------------------------------------------------
// AUTHOR: JACOB BELL
// FILENAME: Lab3.java
// SPECIFICATION: Calculating A Student's Weighted Total
// FOR: CSE 110- Lab #3
// TIME SPENT: 6 Hours //-----------------------------------------------------------*/

import java.util.Scanner;
	
public class Lab3 {
	public static void main(String[] args) 
	{
		// Input Variables and Scanner Declaration
		Scanner scanner = new Scanner( System.in );
		double homework = 0;
		double midterm_exam = 0;
		double final_exam = 0;
		double weighted_total = 0;
		int limit = 0;
		
		// Begin Loop
		while ( limit < 3 ) {
		
			// Homework Grade Input
			if ( limit == 0 ) {  
				System.out.println( "Enter your HOMEWORK grade: " );
				homework = scanner.nextDouble();
				
					limit++;
				
				// Set Limits for Invalid Input
				if ( homework < 0 || homework > 100 ) {
					System.out.println( "[ERR] Invalid Inuput. A homework grade should be between 0 and 100.");
				
					limit--;
				}
				
				// Set Limits for Successful Input
				else if( homework >= 0 && homework < 100 ) {
					
				}
			}
			
			// Midterm Exam Grade Input
			if ( limit == 1) {
				System.out.println( "Enter your MIDTERM EXAM grade: " );
				midterm_exam = scanner.nextDouble();
				
					limit++;
					
				// Set Limits for Invalid Input
				if ( midterm_exam < 0 || midterm_exam > 100 ) {
					System.out.println( "[ERR] Invalid Inuput. A midterm exam grade should be between 0 and 100.");
					
					limit--;
				}
				
				// Set Limits for Successful Input
				else if ( midterm_exam >= 0 && midterm_exam <= 100 ) {
					
				}
			}
			
			// Final Exam Grade Input 
			else if ( limit == 2 ) {
				System.out.println( "Enter your FINAL EXAM grade: " );
				final_exam = scanner.nextDouble();
				
					limit++;
					
				// Set Limits for Invalid Input
				if ( final_exam < 0 || final_exam > 200 ) {
					System.out.println( "[ERR] Invalid Inuput. A final exam grade should be between 0 and 200 ");
					
					limit--;
				}
				
				// Set Limits for Successful Input
				else if ( final_exam >= 0 && final_exam <= 200 ) {
					
				}
			}
		}
			
			// Calculating and Printing the Weighted Total 
			if ( limit == 3) {
				weighted_total = ( final_exam / 200 ) * 50 + ( midterm_exam * 0.25 ) + ( homework * 0.25 );
				System.out.println("Student's Weighted Total is " + weighted_total );
				
				// Inform Student if Pass or Fail
				if (weighted_total >= 50) {
					System.out.println( "[INFO] The student PASSED the class" );
				}
				else {
					System.out.println( "[INFO] The student FAILED the class" );
					
				}	
			}
	}
}
