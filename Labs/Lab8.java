/*------------------------------------------------------------
// AUTHOR: JACOB BELL <ID #1218096321>
// FILENAME: Lab8.java
// SPECIFICATION: More Classes
// FOR: CSE 110 - <Class #83311> Lab 8.5
// TIME SPENT: 2 Hours //-----------------------------------------------------------*/

import java.time.LocalDate;
import java.util.Scanner;

public class Lab8 
{    
	public static void main(String[] args) 
	{        
		Scanner scan = new Scanner(System.in); 
		
		/* Ask the user for month/year */        
		System.out.println("Which month/year would you like to look up the calendar?\n(ex. 11 2020)");
		int month = scan.nextInt(), day = 1, year = scan.nextInt();
		
		
		
		/* Get the weekday and # of months of the given month/year */
		int numOfDays = getNumOfDays(month, year);        
		int weekDay = getWeekDayOf(month, day, year);
		
		
		
		/* Create a 2D array with enough space for at least 30 days */        
		String[][] calendar = new String[6][7];       
		
		
		
		/* Initialize the content of calendar by "-" */        
		for(int i = 0; i < calendar.length; i++) {
			for(int j = 0; j < calendar[0].length; j++) {
				calendar[i][j] = "-";
			}
		}
		
		
		
		/*        
		 * Fill in the 2D array by the calendar in November 2020 You need to align         
		 * weekdays with indices in your 2D array. The first index of a row of week is
		 * Sunday and the last is Saturday.         
		 */  
		// Provide counter...Fill only first week...Start at specified weekDay
		int days = 1; 	
		for(int i = 0; i < calendar.length; i++) {
			if(i == 0) { 	
				for(int j = weekDay - 1; j < calendar[0].length; j++) { 	
					calendar[i][j] = "" + days;
					days++;
				}
			} 
			
			
			
			// Weeks 2-5...Fill normally...Until days of the month are complete
			else { 	
				for(int j = 0; j < calendar[0].length; j++) { 	
					if (days < numOfDays + 1) { 
					calendar[i][j] = "" + days;
					days++;
					}
				}
			}
		}
	
		
		
		/**        
		 * Print out the calendar        
		 */        
		System.out.println();   
		System.out.printf("     The Calendar for %2d/%4d\n", month, year);        
		System.out.printf("-----------------------------\n");      
		System.out.printf("  Su  Mo  Tu  We  Th  Fr  Sa\n");   
		for (int i = 0; i < 6; i++) 	// Had to change parameter i < 5 to i < 6 to fit all dates
		{           
			for (int j = 0; j < 7; j++)        
			{             
				System.out.printf("%4s", calendar[i][j]);          
				}          
			System.out.println();       
		}

        scan.close();  
	}    
	/**     
	 * where the week begins with Sunday.     
	 *     
	 * @param date     
	 * @return the weekday of date in integer (1 is Sunday, 7 is Saturday)     
	 */    
	private static int getWeekDayOf(int month, int day, int year)    
	{        
		LocalDate date = LocalDate.of(year, month, day); // ISO 
		int val = date.getDayOfWeek().getValue() + 1;  
		return val == 8 ? val - 7 : val;    
	}    
	
	/**     
	 * Get the length of a given month in year.    
	 *      
	 * @param month   
	 * @param year     
	 * @return the length of month in year    
	 */    
	private static int getNumOfDays(int month, int year)   
	{        
		return LocalDate.of(year, month, 1).lengthOfMonth(); 
	}
}
