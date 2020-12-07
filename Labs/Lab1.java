/*------------------------------------------------------------
// AUTHOR: JACOB BELL
// FILENAME: Lab1.java
// SPECIFICATION: DECLARING TEST SCORE AVERAGES
// FOR: CSE 110- Lab #1
// TIME SPENT: 3 Hours //-----------------------------------------------------------*/


import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		int case1_test1;
		int case1_test2;
		int case1_test3;
		final double NUM_TESTS = 3;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Test Case 1:");
		
		System.out.print("Enter the score on the first test: ");
		case1_test1 = in.nextInt();
		
		System.out.print("Enter the score on the second test: ");
		case1_test2 = in.nextInt();
		
		System.out.print("Enter the score on the third test: ");
		case1_test3 = in.nextInt();
		
		double case1_average = (case1_test1 + case1_test2 + case1_test3) / NUM_TESTS;
		
		System.out.print("Your average score is: ");
		System.out.print(case1_average);
		System.out.println("\n");
		
	}

}
