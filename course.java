/*
 * Adrian Aponte
 * ITM 311
 * FINAL PROJECT
 */

public class Course {
  private String courseName;
  private String instructor1;
  private String[] students = new String[100];
  private int numberOfStudents=0;
    
  public Course() {
	    
	  }
  
  public Course(String courseName) {
    this.courseName = courseName;
  }
  public void addInstructor(String instructor1) {
	    this.instructor1 = instructor1;
	  }
  public void addStudent(String student) {
  
   this.students[numberOfStudents] = student;
   numberOfStudents++;
    
  }
  
  public String[] getStudents() {
    return students;
  }

  public int getNumberOfStudents() {
    numberOfStudents++;
    return numberOfStudents;
  }  

  public String getCourseName() {
    return courseName;
  }  
  
  public String getInstructorName() {
	    return instructor1;
	  }  
  
  public Student dropStudent(Student student) {
	  
     student=null;
     return student;
  }
}
