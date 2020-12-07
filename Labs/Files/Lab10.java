/*------------------------------------------------------------
// AUTHOR: JACOB BELL <ID #1218096321>
// FILENAME: Lab10.java
// SPECIFICATION: Files
// FOR: CSE 110 - <Class #83311> Lab 10
// TIME SPENT: 3 Hours 
//-----------------------------------------------------------*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab10
{    
	public static void main(String[] args) throws FileNotFoundException, IOException    
	{        
		/* Create an array of Student */        
		final int NUM_STUDENTS = 10;      
		Student[] gradebook = new Student[NUM_STUDENTS];        
		int count = 1;
	
		/* Read the input file and add new records into the Student array */
		FileReader file = new FileReader("lab10_student_data.txt");
		BufferedReader buffered = new BufferedReader(file);
		String line = "";
		
		// While there's an input add variables to gradebook[] 
		while((line = buffered.readLine()) != null) {
			String fullName = line.substring(0, line.indexOf(","));
			String asuId = line.substring(line.indexOf(",") + 1, line.lastIndexOf(","));
			String grade = line.substring(line.lastIndexOf(",") + 1);
			double intGrade = Double.parseDouble(grade);
			gradebook[count - 1] = new Student(fullName, asuId, intGrade);
			
			// Count is for gradebook[] index and printing Students
			count++;
		}
		
		// Print the formatted information
		for(int i = 0; i < NUM_STUDENTS; i++) {
				System.out.printf("%-8s%1s%17s%10s%n", 
						"Read #" + (i + 1), ":", gradebook[i].getFullName(), gradebook[i].getId());
		}
			
		
		
		System.out.println();
		System.out.println();
		
		
		/* Find out duplicate student records by .equals() */        
		for (int i = 0; i < NUM_STUDENTS; i++)        
		{            
			for (int j = i + 1; j < NUM_STUDENTS; j++)            
			{                
				if (gradebook[i].equals(gradebook[j]))                
				{                    
					System.out.printf("\"%s\" and \"%s\": %s\n",                          
							gradebook[i].getFullName(), gradebook[j].getFullName(),gradebook[i].getId());
				}            
			}        
		}    
	}
}

