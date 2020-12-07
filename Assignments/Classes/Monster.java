/*------------------------------------------------------------
// AUTHOR: JACOB BELL <ID #1218096321>
// FILENAME: Monster.java
// SPECIFICATION: Class
// FOR: CSE 110 - <Class #83311> Assignment07
// TIME SPENT: 5 Hours //-----------------------------------------------------------*/


public class Monster {
	private String name;
	private int healthScore;
	private Weapon weapon;
	
	
	// Constructor
	public Monster(String name, int healthScore, Weapon weapon) {
		this.name = name;
		this.healthScore = healthScore;
		this.weapon = weapon;
	}
	
	
	
	// Name of Monster
	public String getName() {
		return name;
	}
	
	// Health Amount
	public int getHealthScore() {
		return healthScore;
	}
	
	// Weapon Name
	public String getWeaponName() {
		return weapon.getName();
	}
	
	// Monster Attack...Create A Random Number Between 0 - maxDamage...healthScore Needs To Be Mutated Based On Damage Done
	public int attack(Monster monster) {
		double damage = Math.random() * weapon.getMaxDamage();
		monster.healthScore = monster.getHealthScore() - (int)damage;
		return (int)damage;
	}
}
