/*------------------------------------------------------------
// AUTHOR: JACOB BELL <ID #1218096321>
// FILENAME: Roster.java
// SPECIFICATION: Class & IO
// FOR: CSE 110 - <Class #83311> Assignment 08
// TIME SPENT: 3 Hours 
//-----------------------------------------------------------*/

import java.io.*;
import java.util.*;

public class Roster {
	//Instance Variables
	private ArrayList<Player> players;
	private String fileName;
	private String fullName;
	private double attackStat;
	private double blockStat;
	
	//Default
	public Roster() {
		players = new ArrayList<Player>();
		fileName = null;
		fullName = null;
		attackStat = 0.0;
		blockStat = 0.0;
	}
	
	// Overloaded
	public Roster(String fileName) throws IOException {
		this.fileName = fileName;
		players = new ArrayList<Player>();
		
		FileReader file = new FileReader(this.fileName);
		BufferedReader buffered = new BufferedReader(file);
		String line = "";
		
		while((line = buffered.readLine()) != null) {
			
			String splitLine[] = line.split(" ");
			String firstName = splitLine[0];
			String lastName = splitLine[1];
			this.fullName = firstName + " " + lastName;
			this.attackStat = Double.parseDouble(splitLine[2]);
			this.blockStat = Double.parseDouble(splitLine[3]);
			
			players.add(new Player(fullName, attackStat, blockStat));
			
		}
	}
	
	
	
	// Add this new player with new stats to the ArrayList
	public void addPlayer(String fullName, double attackStat, double blockStat) {
		Player player= new Player(fullName, attackStat, blockStat);
		players.add(player);
	}
	
	
	
	// Simple ArrayList size
	public int countPlayers() {
		return players.size();
	}
	
	
	
	// Use for Changing players stats. Use .equals for String data type
	public Player getPlayerByName(String fullName) {
		Player byName = null;
		for(int i = 0; i < players.size(); i++) {
			if(fullName.equals(players.get(i).getName())) {
				byName = players.get(i);
			}
		}
		return byName;
	}
	
	
	
	// Determine two top attackers in descending order. Call the printPlayerInfo
	public void printTopAttackers() {
		double largestAttack = 0.0;
		double secondAttack = 0.0;
		Player largestAPlayer = null;
		Player secondAPlayer = null;
		
		// Loop for Top Attacker
		for (int i = 0; i < players.size(); i++) {
		   if (players.get(i).getAttackStat() > largestAttack) {
		      largestAttack = players.get(i).getAttackStat();
		      largestAPlayer = players.get(i);
		   }
		}
		
		// Loop for Second Top Attacker
		for(int i = 0; i < players.size(); i++) {
			if(players.get(i).getAttackStat() < largestAttack && players.get(i).getAttackStat() > secondAttack) {
			secondAttack = players.get(i).getAttackStat();
			secondAPlayer = players.get(i);
			}
		}
		
		// Print Top Attackers
		largestAPlayer.printPlayerInfo();
		secondAPlayer.printPlayerInfo();
	}
	
	
	
	// Determine two top blockers in descending order. Call the printPlayerInfo 
	public void printTopBlockers() {
		double largestBlock = 0.0;
		double secondBlock = 0.0;
		Player largestBPlayer = null;
		Player secondBPlayer = null;
		
		// Loop for Top Blocker
		for (int i = 0; i < players.size(); i++) {
		   if (players.get(i).getBlockStat() > largestBlock) {
		      largestBlock = players.get(i).getBlockStat();
		      largestBPlayer = players.get(i);
		   }
		}
		
		// Loop for Second Top Blocker
		for(int i = 0; i < players.size(); i++) {
			if(players.get(i).getBlockStat() < largestBlock && players.get(i).getBlockStat() > secondBlock) {
			secondBlock = players.get(i).getBlockStat();
			secondBPlayer = players.get(i);
			}
		}
		
		// Print Top Blockers
		largestBPlayer.printPlayerInfo();
		secondBPlayer.printPlayerInfo();
	}
	
	
	
	// Should iterate through ArrayList<Player> object. Call printPlayerInfo on each Player object.
	public void printAllPlayers() {
		for(int i = 0; i < players.size(); i++) {
			players.get(i).printPlayerInfo();
		}
	}
}
