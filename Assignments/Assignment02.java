/*------------------------------------------------------------
// AUTHOR: JACOB BELL <ID #1218096321>
// FILENAME: Assignment02.java
// SPECIFICATION: Work Site Calculations
// FOR: CSE 110 <Class #83311> - Assignment 02
// TIME SPENT: 6 Hours 
 * //-----------------------------------------------------------*/



import java.util.Scanner;

public class Assignment02 {
	public static void main(String[] args) 
	{
		// Input Variables & Scanner
		double length_road;
		int num_lanes;
		int depth_asphalt;
		int num_days;
		Scanner in = new Scanner(System.in);
		
		// Road Miles Input
		System.out.println("Length of road project (miles) : ");
		length_road = in.nextDouble();
	
		// Lanes Input
		System.out.println("Number of lanes                : ");
		num_lanes = in.nextInt();
	
		// Asphalt Depth Input
		System.out.println("Depth of asphalt (inches)      : ");
		depth_asphalt = in.nextInt();
	
		// Number of Days Input
		System.out.println("Days to complete project       : ");
		num_days = in.nextInt();
		
		// Output Variables
		double road_ft;
		double depth_ft;
		int loads_asphalt;
		int lights;
		int pipes;
		int members;
		int intersections;
		
		System.out.println("=== Amount of Materials Needed ===");
		
		// Amount of Loads ( Each Lane is 12 Feet, Asphalt Weighs 150 LBS Per Square Foot and Truck Loads Can Only Carry 10,000 LBS ) ( Round Up For Half Trucks )
		road_ft = (length_road * 5280);
		depth_ft = (double)depth_asphalt / 12;
		loads_asphalt = (int)Math.ceil((((12 * num_lanes * road_ft) * depth_ft ) * 150) / 10000);
		System.out.println("Truckloads of Asphalt : " + loads_asphalt);
		
		// Intersections ( One Intersections for Every Mile of Road )
		// Stop Lights ( 2 Stop Lights Per Each intersection and One Extra Light at Each Intersection Per Lane )
		intersections = (int)Math.floor(length_road);
		lights = (num_lanes * intersections) + (intersections * 2);
		System.out.println("Stoplights            : " + lights);
		
		// Conduit Pipes ( Each Pipe 24 ft, )
		pipes = (int)(road_ft / 24); 
		System.out.println("Conduit Pipes         : " + pipes);
		
		// Members ( Equation Given and Round Up For Half Members )
		members = (int)Math.ceil((50 * length_road * num_lanes) / num_days);
		System.out.println("Crew Members Needed   : " + members);
		
		System.out.println("=== Cost of Materials ============");
		
		// Cost Variables
		double cost_asphalt;
		double cost_lights;
		double cost_pipes = pipes * 500;
		double cost_labor;
		
		// $$ Asphalt ( 1,000 $ Per Load )
		cost_asphalt = 1000 * loads_asphalt;
		System.out.printf("Cost of Asphalt       : $%.2f%n", cost_asphalt);
		
		// $$ Stop Lights ( 25,000 Per Light )
		cost_lights = 25000 * lights;
		System.out.printf("Cost of Stoplights    : $%.2f%n", cost_lights);
		
		// $$ Pipes ( 500 $ Per 24ft of Pipe ) 
		cost_pipes = 500 * pipes;
		System.out.printf("Cost of Conduit pipes : $%.2f%n", cost_pipes);
		
		// $$ Labor ( 25 $ Per Member ) ( 8 Hour Days )
		cost_labor = ((25 * 8) * num_days) * members;
		System.out.printf("Cost of Labor         : $%.2f%n", cost_labor);
		
		System.out.println("=== Total Cost of Project ========");
		
		// $$ Total Cost 
		double cost_total = cost_asphalt + cost_lights + cost_pipes + cost_labor;
		System.out.printf("Total Cost of Project : $%.2f%n", cost_total);
		
		
	}
}
