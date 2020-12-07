/*------------------------------------------------------------
// AUTHOR: JACOB BELL <ID #1218096321>
// FILENAME: Lab6.java
// SPECIFICATION: Grouping Grades With Arrays 
// FOR: CSE 110 <Class #83311> - Lab6
// TIME SPENT: 6 Hours //-----------------------------------------------------------*/


import java.util.Scanner;

public class Lab6 {    
	public static void main(String[] args) {     
	    	
		Scanner scanner = new Scanner(System.in);       
		int numStudents, groupNum = 0, gradeNum;
		int[] studentGroups = null; 
		double[] studentGrades = null, groupAverages = null;
		int[] groupSizes = null;
		
		// ask for number of students       
		System.out.println("How many students do you have?");
		numStudents = scanner.nextInt();
		
		// Create Arrays For studentGroups and studentGrades
		studentGroups = new int[numStudents];
		studentGrades = new double[numStudents]; 
		
		// Fill Arrays With User Input
		for(int i = 0; i < numStudents; i++){
		    	
			System.out.println("[Group #] and [Grade] for Entry " + (i + 1));
			groupNum = scanner.nextInt();
			gradeNum = scanner.nextInt();
			studentGroups[i] = groupNum;
			studentGrades[i] = gradeNum;
			
		}
		
		scanner.close();   
		
		// Print Student Records For Part 1
		System.out.println();
		System.out.println("= List of Student Records =");
		
		for( int i = 0; i < numStudents; i++ ) {
			
		System.out.println( "Group " + studentGroups[i] + " - " + studentGrades[i] + " Points" );
		
		}
		
		System.out.println();
		
		// Part 2   
		
		System.out.println("====== Group Statistics ======");
		
		int max = studentGroups[0]; 
		groupAverages = new double[numStudents];  // Avoid group 0       
		groupSizes = new int[numStudents];  // Avoid group 0       
		
		// Finding the Max Amount of Groups
		for ( int i = 0; i < numStudents; i++) {
			
			if(max < studentGroups[i])
	        { 
				max = studentGroups[i];
	        }
			
		}	
		
		// Filling Out groupSizes Array
		for ( int i = 0; i < max; i++ ) {
			   
			int count = 0;
			int total = 0;
			for ( int j = 0; j < numStudents; j++) {

				if ((i + 1) == studentGroups[j]) {
				count++;	
				total += studentGrades[j];
				}
				   
			}
			
			// Declare groupSizes and groupAverages equations 
			groupSizes[i] = count;
			groupAverages[i] = ((double)total / count);
		   
			// Print Group Statistics 
			if (groupSizes[i] > 0) {
				System.out.println("Group #" + (i + 1) + " has " + groupSizes[i] + " students, average is " + groupAverages[i]);
			}
			
			
		}  
			
	}	
}