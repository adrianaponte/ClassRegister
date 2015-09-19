/*
 * Adrian Aponte
 * ITM 311
 * FINAL PROJECT
 */

public class Instructor {

	private String instructorName1; 
	private String instructorID1; 
	private double instrucorSalary1; 
	private double instructorOfficeNum1;
	
	 public void setinstructorName(String instructorName) 
	 { 
		 instructorName1 = instructorName; 
	 } 
	 
	 public void setinstructorID(String instructorID) 
	 { 
		 instructorID1 = instructorID; 
	 } 
	 
	 public void setinstrucorSalary(double instrucorSalary) 
	 { 
		 instrucorSalary1 = instrucorSalary; 
	 } 
	 
	 public void setinstructorOfficeNum(double instructorOfficeNum) 
	 { 
		 instructorOfficeNum1 = instructorOfficeNum; 
	 } 
	 //
	 
	 public String getInstructorName() 
	 { 
		 return instructorName1; 
	 } 
	 
	 public String getinstructorID() 
	 { 
		 return instructorID1; 
	 } 
	 
	 public double getinstrucorSalary() 
	 { 
		 return instrucorSalary1; 
	 } 
	 
	 public double getinstructorOfficeNum() 
	 { 
		 return instructorOfficeNum1 ; 
	 } 
	 public String changeInstructor(String original, String changed) 
	 { 
		
		String instructorChange = instructorName1.replaceAll(original, changed); 
		return instructorChange;
	 } 
	 
	 
}
