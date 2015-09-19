/*
 * Adrian Aponte
 * ITM 311
 * FINAL PROJECT
 */

import java.util.Scanner;

public class Test {
	  public static void main(String[] args) 
	  {
	
	Course itm311= new Course();
	Student student1= new Student();
	Student student2= new Student();
	Student student3= new Student();
	Instructor instructorUno= new Instructor();
	Instructor instructorChange= new Instructor();
	
	student1.setStudentName("Adrian");
	student1.setStudentID("1234567");
	student1.setStudentGPA(3.2);
	student1.setStudentCredits(105);
	
	student2.setStudentName("David");
	student2.setStudentID("789223423");
	student2.setStudentGPA(3.5);
	student2.setStudentCredits(98);

	student3.setStudentName("Earl");
	student3.setStudentID("7432234323");
	student3.setStudentGPA(3.1);
	student3.setStudentCredits(92);
	
	instructorUno.setinstructorName("Omar");
	instructorUno.setinstructorID("34534657");
	instructorUno.setinstrucorSalary(5000000);
	instructorUno.setinstructorOfficeNum(212);
	
	itm311.addStudent(student1.getStudentName());
	itm311.addStudent(student2.getStudentName());
	itm311.addInstructor(instructorUno.getInstructorName());
	

	
	itm311.dropStudent(student1);
	//Strings are Immutable so I just made a new Instructor object that just set a new name but pointed to
	//all the previous attributes
	instructorChange.setinstructorName("Omar A"); 
	instructorChange.setinstructorID(instructorUno.getinstructorID());
	instructorChange.setinstrucorSalary(instructorUno.getinstrucorSalary());
	instructorChange.setinstructorOfficeNum(instructorUno.getinstructorOfficeNum());

	itm311.addInstructor(instructorChange.getInstructorName());
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the class you want info for:");
	String desiredClass=input.next();
	
	if (desiredClass.equals("ITM311"))
	{
		System.out.println("Intructor is:"+itm311.getInstructorName());
		System.out.println(student1.getStudentName()+" "+student1.getStudentGPA()+" "+student2.getStudentName()+" "+student2.getStudentGPA());
		System.out.println("Number of Students enrolled are:"+itm311.getNumberOfStudents());
		
	}
	else
	{
		System.out.println("Sorry no info for that class");
	}
	
	}
}

