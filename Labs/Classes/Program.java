/*------------------------------------------------------------
// AUTHOR: JACOB BELL <ID #1218096321>
// FILENAME: Program.java
// SPECIFICATION: Classes
// FOR: CSE 110 <Class #83311> - Lab 7
// TIME SPENT: 5 Hours //-----------------------------------------------------------*/

import java.time.LocalDateTime;

public class Program {
	private String programName, description, createdDate, fileName;
	private Student author;
	
	
	
	// Default Constructor
	public Program() {        
		this.programName = null;       
		this.description = null;      
		this.fileName = null;       
		this.author = null;     
		this.createdDate = LocalDateTime.now().toString();   
		}   
	
	
	
	// Overloaded Constructor
	public Program(String programName, String description, String fileName, Student author) {        
		this.programName = programName;       
		this.description = description;      
		this.fileName = fileName;       
		this.author = author;     
		this.createdDate = LocalDateTime.now().toString();   
		}   
	
	
	// toString To Return program1
	public String toString() {      
		return String.format("Program: %s, Desc: %s, Filename: %s, Author: %s",         
				programName, description, fileName, author.toString());   
		}   
	
	
	
	// Getters For All Attributes * Accessors *
	public String getProgramName() {       
		return programName;   
	}  
		
	public String getDescription() {  
		return description;    
	}    
	
	public String getCreatedDate() {     
		return createdDate;   
	}   
	
	public String getFileName() {   
		return fileName;   
	}   
	
	public Student getAuthor() {    
		return author;   
	}
}

