/*------------------------------------------------------------
// AUTHOR: JACOB BELL <ID #1218096321>
// FILENAME: Assignment01.java
// SPECIFICATION: Pizza Party
// FOR: CSE 110 <Class #83311> - Assignment 01
// TIME SPENT: 3 Hours //-----------------------------------------------------------*/


import java.util.Scanner;

public class Assignment01 {
	
	public static void main(String[] args) 
	{
		int num_pizzas;
		int num_slices;
		int num_adults;
		int num_children;
		
		Scanner in = new Scanner(System.in);
		
		// Taking user input
		System.out.print("Number of pizzas purchased                    : ");
		num_pizzas = in.nextInt();
		
		System.out.print("Number of slices per pizza                    : ");
		num_slices = in.nextInt();
		
		System.out.print("Number of adults                              : ");
		num_adults = in.nextInt();
		
		System.out.print("Number of children                            : ");
		num_children = in.nextInt();
		
		System.out.println(); // White line to break input and output
		
		// Total Slices
		int slices = num_slices * num_pizzas;
		System.out.println("Total number of slices of pizza               : " + slices);	
		
		// Each adult will get 2 slices of pizza
		final int SLICE_PER_ADULT = 2;
		int adult_slices = num_adults * SLICE_PER_ADULT;
		System.out.println("Total number of slices given to adults        : " + adult_slices);
		
		// Slices available for children
		int children_slices = (slices - adult_slices);
		System.out.println("Total number of slices available for children : " + children_slices);
		
		// Each child will get the same portions of the remaining pizza
		final int SLICE_PER_CHILD = children_slices / num_children;
		System.out.println("Number of slices each child will get          : " + SLICE_PER_CHILD);
		
		// Total slices not not able to be dispersed evenly to children
		int slices_leftover = children_slices % num_children;
		System.out.println("Number of slices left over                    : " + slices_leftover);
		
		
	}

}
