/*------------------------------------------------------------
// AUTHOR: JACOB BELL <ID #1218096321>
// FILENAME: Student.java
// SPECIFICATION: Files
// FOR: CSE 110 - <Class #83311> Lab 10
// TIME SPENT: 2 Hours 
//-----------------------------------------------------------*/

public class Student {
	// Instance Variables
	private String fullName, asuID;
	private double grade;
	
	
	
	// Default Constructor
	public Student() {
		this.asuID = null;
		this.fullName = null;
		this.grade = -1; // Unattainable Grade
	}
	
	
	
	// Overloaded Constructor
	public Student(String fullName, String asuID, double grade) {
		this.asuID = asuID;
		this.fullName = fullName;
		this.grade = grade;
	}
	
	
	// Comparison Method
	public boolean equals(Student other) {
		// Check to see if the [asuID]'s classes match
		if(this.asuID != null && other.asuID != null) {
			if(this.asuID.getClass().equals(other.asuID.getClass())) {
				if(this.asuID.equals(other.asuID)) {
					return true;
				}
			}
		
			// Check to see if the [asuID] 's match 
			
		}
		return false;
	}
	
	
	// String Return Format
	public String toString() {
		return String.format("\" %s","\" %s" , fullName, asuID);
	}
	// Setter Methods
	public void setName(String fullName) {
		this.fullName = fullName;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public void setId(String asuID) {
		this.asuID = asuID;
	}
	// Getter Methods
	public String getFullName() {
		return fullName;
	}
	public String getId() {
		return asuID;
	}
	public double getGrade() {
		return grade;
	}
	
}
