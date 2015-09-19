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
	
	 public void setinstructorName(String instructorName) //method with String parameter to set Instructor Name
	 { 
		 instructorName1 = instructorName; 
	 } 
	 
	 public void setinstructorID(String instructorID) //method with String parameter to set Instructor ID
	 { 
		 instructorID1 = instructorID; 
	 } 
	 
	 public void setinstrucorSalary(double instrucorSalary) //method with double parameter to set Instructor Salary
	 { 
		 instrucorSalary1 = instrucorSalary; 
	 } 
	 
	 public void setinstructorOfficeNum(double instructorOfficeNum) ////method with double parameter to set Instructor Office Number
	 { 
		 instructorOfficeNum1 = instructorOfficeNum; 
	 } 
	 //
	 
	 public String getInstructorName() //method to return Instructor Name
	 { 
		 return instructorName1; 
	 } 
	 
	 public String getinstructorID() //method to return Instructor ID
	 { 
		 return instructorID1; 
	 } 
	 
	 public double getinstrucorSalary() //method to return Instructor Salary
	 { 
		 return instrucorSalary1; 
	 } 
	 
	 public double getinstructorOfficeNum() //method to return Instructor Office Num
	 { 
		 return instructorOfficeNum1 ; 
	 } 
	 public String changeInstructor(String original, String changed) //method to change instructor name
	 { 
		
		String instructorChange = instructorName1.replaceAll(original, changed); 
		return instructorChange;
	 } 
	 
	 
}
