/*------------------------------------------------------------
// AUTHOR: JACOB BELL <ID #1218096321>
// FILENAME: Assignment06.java
// SPECIFICATION: Arrays
// FOR: CSE 110 - <Class #83311> Assignment06
// TIME SPENT: 5 Hours //-----------------------------------------------------------*/

public class Assignment06 {
	public static void main(String[] args) {    
		
		// Mimic User Input...
		int[] newArray = {1, 22, 333, 400, 5005, 9};
		
		// Call Methods And Print...
		System.out.print("Original Array                : ");
		printArray(newArray, ", ");
		System.out.println();
		
		int getFirst = getFirst(newArray);
		System.out.println("First Number                  : " + getFirst);
		
		int getLast = getLast(newArray);
		System.out.println("Last Number                   : " + getLast);
		
		System.out.print("Without The First Number      : ");
		int[] getAllButFirst = getAllButFirst(newArray);
		printArray(getAllButFirst, ", ");
		System.out.println();
		
		int getIndexOfMin = getIndexOfMin(newArray);
		System.out.println("Index Of The Smallest Number  : " + getIndexOfMin);
		
		int getIndexOfMax = getIndexOfMax(newArray);
		System.out.println("Index Of The Largest Number   : " + getIndexOfMax);
		
		System.out.print("Swapping Two Numbers          : ");
		int [] swapByIndex = swapByIndex(newArray, 0, 2);
		printArray(swapByIndex, ", ");
		System.out.println();
		
		// Mimic User Input... Insert New Array
		int[] newNewArray = {1, 22, 333, 400, 5005, 9};
		
		System.out.print("Removing A Number             : ");
		int[] removeAtIndex = removeAtIndex(newNewArray, 3);
		printArray(removeAtIndex, ", ");
		System.out.println();
		
		System.out.print("Inserting A Number            : ");
		int[] insertAtIndex = insertAtIndex(newNewArray, 3, 999);
		printArray(insertAtIndex, ", ");
		System.out.println();
		
		boolean isSorted = isSorted(newNewArray);
		System.out.println("Is The Original Array Sorted? : " + isSorted);
		
	}    
	
		// 1) Write a public static method named printArray,     
		//   that takes two arguments. The first argument is an Array of int     
		//   and the second argument is a String. The method should print out     
		//   a list of the values in the array, each separated by the value of the second argument.
	
	public static void printArray(int[] printArray, String text) {
		for (int i = 0; i < printArray.length; i++)
		{
		   System.out.print(printArray[i]);
		   
		   // The Comma Cannot Be Placed At The End Of The Array
		   if(i + 1 != printArray.length)
		   System.out.print(text);
		}
	}

	// 2) Write a public static method named getFirst,     
	//    that takes an Array of int as an argument and returns     
	//    the value of the first element of the array. 

	public static int getFirst(int[] firstArray) {
		return firstArray[0]; 
	}
	
	// 3) Write a public static method named getLast,     
	//    that takes an Array of int as an argument and returns     
	//    the value of the last element of the array.  
	
	public static int getLast(int[] lastArray) {
		return lastArray[lastArray.length - 1];
	}
	
	// 4) Write a public static method named getAllButFirst,     
	//    that takes an Array of int as an argument and creates and returns     
	//    a new array with all of the values in the argument array except the firstvalue.   
	
	public static int[] getAllButFirst(int[] myArray) {
		
		// Utilize The Remove Method With Parameters (Array, 0)
		int[] getAllButFirst = removeAtIndex(myArray, 0);
		
		return getAllButFirst; 
	}
	
	// 5) Write a public static method named getIndexOfMin,     
	//    that takes an Array of int as an argument and returns     
	//    the index of the least value in the array.    
	
	public static int getIndexOfMin(int[] minArray) {
		
		int  index = 0, min = minArray[index];
		for( int i = 0; i < minArray.length; i++) {
			
			if( minArray[i] <= min )
	        { 
				min = minArray[i];
				index = i;
	        }
		}
		return index;
	}
	
	// 6) Write a public static method named getIndexOfMax,     
	//    that takes an Array of int as an argument and returns    
	//    the index of the largest value in the array.    
	
	public static int getIndexOfMax(int[] maxArray) {
	
		int max = maxArray[0], index = 0;
		for( int i = 0; i < maxArray.length; i++) {
		
			if(max < maxArray[i])
			{ 
				max = maxArray[i];
				index = i;
			}
		}
		return index;
	}
	
	// 7) Write a public static method named swapByIndex,
	//    that takes three arguments. The first argument is an Array of int,     
	//    and the second and third arguments are int indexes.    
	//    This method will swap the values at the two given index arguments   
	//    in the array, and return a reference to the array.  
	
	public static int[] swapByIndex(int[] swapArray , int index, int index2) {
		
		// Temp As A Placeholder 
		int temp = swapArray[index]; 
		swapArray[index] = swapArray[index2];
		swapArray[index2] = temp; 
		
		return swapArray;
	}
	
	//8) Write a public static method named removeAtIndex,    
	//  that takes two arguments. The first argument is an Array of int,   
	//  and the second argument is an int index. This method create and return 
	//  a new array with all of the values in the argument array   
	//  except the value at the argument index.
	
	public static int[] removeAtIndex(int[] removeArray, int index) {
		
		// Declare Two Variables... i = Ascending Index... j = Counter Used To Place Num Required Into New Array
		int [] newRemoveArray = new int [removeArray.length - 1];
		for (int i = 0, j = 0; i < removeArray.length; i++)
		{ 
			if(i == index) {
				
			}
			else {
				newRemoveArray[j++] = removeArray[i];
			}		
		}
		
		return newRemoveArray;
	}
	
	//9) Write a public static method named insertAtIndex,    
	//   that takes three arguments. The first argument is an Array of int,    
	//   the second argument is an int index, and the third argument is an int value. 
	//   This method create and return a new array with all of the values    
	//   in the argument array and including the third argument value
	//   inserted at the index specified by the second argument value. 
	
	public static int[] insertAtIndex(int[] insertArray, int index, int newNum) {
		
		int[] newInsertArray = new int[insertArray.length + 1];
		
		for (int i = 0; i < index; i++) {
			newInsertArray[i] = insertArray[i];
		}

		newInsertArray[index] = newNum;

		// Rotate Nums Back An Index After The Inserted Num
		for (int i = index + 1; i <= insertArray.length; i++) {
			newInsertArray[i] = insertArray[i - 1];
		}

		return newInsertArray; 
	}
	
	//10) Write a public static method named isSorted,    
	//    that takes an Array of int as an argument.    
	//    This method should return the boolean value true    
	//    if all the element values in the array are in ascending order;     
	//    otherwise the method should return the boolean value false.}
	
	// Compare Ascending 
	public static boolean isSorted(int[] sortArray) {
		boolean result = true; 
		for ( int i = 0; i < sortArray.length - 1; i++ ) {
			if (sortArray[i] > sortArray[i + 1]) {
				result = false; 
			}
		}
		return result;
	}
}
