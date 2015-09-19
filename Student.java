/*
 * Adrian Aponte
 * ITM 311
 * FINAL PROJECT
 */

public class Student {

	private String studentName1; 
	private String studentID1; 
	private double studentGPA1; 
	private int studentCredits1; 

	 public void setStudentName(String studentName) //method with String parameter to set Student Name
	 { 
		 studentName1 = studentName; 
	 } 
	 
	 public void setStudentID(String studentID) //method with String parameter to set Student ID
	 { 
		 studentID1 = studentID; 
	 } 
	 
	 public void setStudentGPA(double studentGPA) //method with double parameter to set Student GPA
	 { 
		 studentGPA1 = studentGPA; 
	 } 
	 
	 public void setStudentCredits(int studentCredits) //method with integer parameter to set Student GPA
	 { 
		 studentCredits1 = studentCredits; 
	 } 
	 //
	 public String getStudentName() //method that returns Student Name
	 { 
		 return studentName1; 
	 } 
	 
	 public String getStudentID() //method that returns Student ID
	 { 
		return studentID1; 
	 } 
	 
	 public double getStudentGPA() //method that returns Student GPA
	 { 
		return studentGPA1; 
	 } 
	 
	 public int getStudentCredits() //method that returns Student Credits
	 { 
		return studentCredits1; 
	 } 
}
