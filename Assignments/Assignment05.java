/*------------------------------------------------------------
// AUTHOR: JACOB BELL <ID #1218096321>
// FILENAME: Assignment05.java
// SPECIFICATION: Methods
// FOR: CSE 110 - <Class #83311> Assignment05
// TIME SPENT: 5 Hours //-----------------------------------------------------------*/

public class Assignment05 {    
	
	public static void main(String[] args) {
		// Mimic User Input
		
				String text1 = "code", text2 = "coding", text3 = "programming";
				int num1 = 0, num2 = 1, num3 = 3;
				
				// Call Methods
				
				displayGreeting();
				
				System.out.print("The displayed text is                           : ");
				displayText(text1);
				
				System.out.print("The printed total is                            : ");
				printTotal(num1, num2, num3);
				
				int getTotal = getTotal(num1, num2, num3);
				System.out.println("The total returned is                           : " + getTotal);
				
				double getAverage = getAverage(num1, num2, num3);
				System.out.println("The average is                                  : " + getAverage);
				
				double averageLength = averageLength(text1, text2, text3 );
				System.out.println("The average length of the texts is              : " + averageLength);
				
				int lengthOfShortest = lengthOfShortest(text1, text2);
				System.out.println("The length of the shortest text is              : " + lengthOfShortest);
				
				String stringOfStars = stringOfStars(text1);
				System.out.println("The text converted into stars is                : " + stringOfStars);
				
				String maxStringOfStars = maxStringOfStars(text1, text2);
				System.out.println("The longest text converted into stars is        : " + maxStringOfStars);
				
				String midStringOfStars = midStringOfStars(text1, text2, text3);
				System.out.println("The second longest text converted into stars is : " + midStringOfStars);
				
	}
	
//  1) Display Greeting
	
	static void displayGreeting() {
		System.out.println("Hello, and welcome!");
	}
	
	//  2) Write (define) a static method named displayText,     
	//  that takes a single String argument and returns no value.     
	//  When this function is called, it should print the value of the argument that was passed to it. 
	
	static void displayText(String text) {
		System.out.println(text);
	}
		   
	// 3) Write (define) a static method named printTotal,     
	//  that takes three int arguments.     
	//  When this function is called, it should print the sum of the three arguments passed to it.     
	//  This function should return no value.
	
	static void printTotal(int num1, int num2, int num3) {
		int total = (num1 + num2 + num3);
		System.out.println(total);
	}
	
	//  4) Write (define) a static method named getTotal,     
	//  that takes three int arguments.     
	//  When this function is called, it should return the sum     
	//  of the three arguments passed to it as an int. 
	
	static int getTotal(int num1, int num2, int num3) {
		int total = (num1 + num2 + num3);
		return total; 
	}
	
	//  5) Write (define) a static method named getAverage,     
	//  that takes three int arguments.     
	//  When this function is called, it should return the average     
	//  of the three arguments passed to it as a double.   
	
	static double getAverage(int num1, int num2, int num3) {
		double total = ((double)num1 + num2 + num3) / 3;
		return total; 
	}
	
	//  6) Write (define) a static method named averageLength,     
	//  that takes three String arguments.
	//  When this function is called, it should return the average length (number of characters)     
	//  of the String arguments passed to it as a double.    
	
	static double averageLength(String text1, String text2, String text3) {
		double total = ((double)text1.length() + text2.length() + text3.length()) / 3;
		return total; 
	}
	
	//  7) Write (define) a static method named lengthOfShortest,     
	//  that takes two String arguments. When this function is called,     
	//  it should return the length (number of characters)     
	//  of the shortest String argument passed to it as an int.  
	
	static int lengthOfShortest(String text1, String text2) {
		if (text1.length() < text2.length()) {
			return text1.length();
		}
		else 
		{
			return text2.length();
		}
	}
	
	//  8) Write (define) a static method named stringOfStars,     
	//  that takes one String argument.
	//  When this function is called, it should return a String of asterisks (*)     
	//  that is the same length as the string argument passed to it.    
	
	static String stringOfStars(String text) {
		String str = "*", result = "";
		
		for (int i = 0; i < text.length(); i++) {
			result += str;
		}
		
		return result;
	}
	
	//  9) Write (define) a static method named maxStringOfStars,     
	//  that takes two String arguments.     
	//  When this function is called, it should return a String of asterisks (*)     
	//  that is the same length as the longest string argument passed to it.    
	
	static String maxStringOfStars(String text1, String text2) {
		
		String str = "*", result = "";
		
		if (text1.length() < text2.length()) {
			for (int i = 0; i < text2.length(); i++) {
				result += str;
			}
		}
		else 
		{
			for (int i = 0; i < text1.length(); i++) {
				result += str;
			}
		}
		
		return result;
	}
	
	//   10) Write (define) a static method named midStringOfStars,     
	//   that takes three String arguments.     
	//   When this function is called, it should return a String of asterisks (*)     
	//   that is the same length as the string argument with the length     
	//   that would be in the middle if the lengths of the arguments were arranged in ascending order.
	
	static String midStringOfStars(String text1, String text2, String text3) {

		String str = "*", result = "";
		
		// First String
		if ((text1.length() < text2.length() && text1.length() > text3.length()) || (text1.length() > text2.length() && text1.length() < text3.length())) {
			for (int i = 0; i < text1.length(); i++) {
				result += str;
			}
		}
		
		// Second String
		if ((text2.length() < text1.length() && text2.length() > text3.length()) || text2.length() > text1.length() && text2.length() < text3.length()) {
			for (int i = 0; i < text2.length(); i++) {
				result += str;
			}
		}
		
		// Third String
		if ((text3.length() < text1.length() && text3.length() > text2.length()) || (text3.length() > text1.length() && text3.length() < text2.length())) {
			for (int i = 0; i < text3.length(); i++) {
				result += str;
			}
		}
		
		return result;
	}
}
