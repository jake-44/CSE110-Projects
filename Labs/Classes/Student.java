/*------------------------------------------------------------
// AUTHOR: JACOB BELL <ID #1218096321>
// FILENAME: Student.java
// SPECIFICATION: Classes
// FOR: CSE 110 <Class #83311> - Lab 7
// TIME SPENT: 5 Hours //-----------------------------------------------------------*/

public class Student {
	private String asuID, firstName, lastName, fullName;
	private double grade;

	
	
	// Default Constructor
	public Student() {
		this.firstName = null;
		this.lastName = null;
		this.asuID = null;
		this.fullName = firstName + " " + lastName;
	}
	
	
	
	// Overloaded Constructor
	public Student(String fName, String lName, String asuID) {
		this.firstName = fName;
		this.lastName = lName;
		this.asuID = asuID;
		this.fullName = firstName + " " + lastName;
		this.grade = -1; // Add -1 Grade To The Student Record In Order To Mark N/A
	}
	
	
	
	// toString To Return student1
	public String toString() {
		return String.format("[Student: %s, ASUID: %s, Grade: %.2f]", fullName, asuID, grade);
	}
	
	
		
	// Getters For All Attributes * Accessors *
	public double getGrade() {
		return grade;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public String getAsuID() {
		return asuID;
	}
	
	
	
	// Grade Setter Called From Lab7.java With user Input * Mutator *
	public void setGrade(double grade) {
		this.grade = grade;
	}
}



