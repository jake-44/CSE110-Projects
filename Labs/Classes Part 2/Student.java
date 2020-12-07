/*------------------------------------------------------------
// AUTHOR: JACOB BELL <ID #1218096321>
// FILENAME: Student.java
// SPECIFICATION: Classes (Part 2)
// FOR: CSE 110 <Class #83311> - Lab 8
// TIME SPENT: 5 Hours //-----------------------------------------------------------*/



public class Student {
	// Instance Variables
	private String fullName, asuID;
	private double grade;
	private int numOfUpdates, numOfAccessed;
	
	
	
	// Default Constructor
	public Student() {
		this.asuID = null;
		this.fullName = null;
		this.grade = -1; // Unattainable Grade
		this.numOfUpdates = 0;
		this.numOfAccessed = 0;
	}
	
	
	
	// Overloaded Constructor
	public Student(String fullName, String asuID, double grade) {
		this.asuID = asuID;
		this.fullName = fullName;
		this.grade = grade;
		this.numOfUpdates = 0;
		this.numOfAccessed = 0;
	}
	
	
	// Comparison Method
	public boolean equals(Student other) {
		// Check to see if the [asuID]'s match
		if(this.asuID != null && other.asuID != null) {
			if(this.asuID.equals(other.asuID)) {
				return true;
			}
		}
		
		// Check to see if the [fullName] 's match regardless of upper / lower case
		if (this.fullName != null && other.fullName != null) {
			if(this.fullName.toLowerCase().equals(other.fullName.toLowerCase())) {
				return true;
			}
		}
		return false;
	}
	
	
	// String Return Format
	public String toString() {
		return String.format("[Name: %s, ASUID: %s, Grade: %.2f]", fullName, asuID, grade);
	}
	// Setter Methods...When set, update the [numOfUpdates]
	public void setName(String fullName) {
		this.numOfUpdates++;
		this.fullName = fullName;
	}
	public void setGrade(double grade) {
		this.numOfUpdates++;
		this.grade = grade;
	}
	public void setId(String asuID) {
		this.numOfUpdates++;
		this.asuID = asuID;
	}
	// Getter Methods...When got, update the [numOfAccessed]
	public String getFullname() {
		this.numOfAccessed++;
		return fullName;
	}
	public String getAsuID() {
		this.numOfAccessed++;
		return asuID;
	}
	public double getGrade() {
		this.numOfAccessed++;
		return grade;
	}
	public int getNumOfUpdates() {
		this.numOfAccessed++;
		return numOfUpdates;
	}
	public int getNumOfAccessed() {
		this.numOfAccessed++;
		return numOfAccessed;
	}
}
