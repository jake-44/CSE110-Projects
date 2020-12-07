/*------------------------------------------------------------
// AUTHOR: JACOB BELL <ID #1218096321>
// FILENAME: Player.java
// SPECIFICATION: Class & IO
// FOR: CSE 110 - <Class #83311> Assignment 08
// TIME SPENT: 3 Hours 
//-----------------------------------------------------------*/


public class Player {
	//Instance Variables
	private String name;
	private double attackStat;
	private double blockStat;
	
	// Overloaded 
	public Player(String name, double attackStat, double blockStat) {
		this.name = name;
		this.attackStat = attackStat;
		this.blockStat = blockStat;
	}
	
	
	
	// Setters for Attackers and Blockers
	public void setBlockStat(double blockStat) {
		this.blockStat = blockStat;
	}
	
	public void setAttackStat(double attackStat) {
		this.attackStat = attackStat;
	}
	
	
	
	// Getters for Name, Attack, and Block
	public String getName() {
		return name;
	}
	
	public double getAttackStat() {
		return attackStat;
	}
	
	public double getBlockStat() {
		return blockStat;
	}
	
	
	
	// Printing the String and Player Info
	public void printPlayerInfo() {
		System.out.printf("%s%s%.2f%s%s%.2f%s%n" , name, " (attack = ", attackStat, ", ", "block = ", blockStat, ")" );
	}
}
