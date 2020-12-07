/*------------------------------------------------------------
// AUTHOR: JACOB BELL <ID #1218096321>
// FILENAME: Weapon.java
// SPECIFICATION: Class
// FOR: CSE 110 - <Class #83311> Assignment07
// TIME SPENT: 5 Hours //-----------------------------------------------------------*/


public class Weapon {
	private String name;
	private int maxDamage;
	
	
	
	// Default Constructor
	public Weapon() {
		name = "Pointy Stick";
		maxDamage = 1;
	}
	
	
	
	// Overloaded Constructor
	public Weapon(String name, int maxDamage) {
		this.name = name;
		this.maxDamage = maxDamage;
	}
	
	
	
	// Name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	// Damage
	public void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}
	
	public int getMaxDamage() {
		return maxDamage;
	}

	
}
