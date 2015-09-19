/*
 * Adrian Aponte
 * ITM 311
 * FINAL PROJECT
 */

public class Course {
  private String courseName;//String that will hold the course name
  private String instructor1;//string that will hold instructor's name
  private String[] students = new String[100];//array to hold students
  private int numberOfStudents=0;//integer that will hold number of students
    
  public Course() {
	    
	  }
  
  public Course(String courseName) {//adds course name
    this.courseName = courseName;
  }
  public void addInstructor(String instructor1) {//adds instructor
	    this.instructor1 = instructor1;
	  }
  public void addStudent(String student) {//adds new student to array
  
   this.students[numberOfStudents] = student;
   numberOfStudents++;
    
  }
  
  public String[] getStudents() {//retrieves students
    return students;
  }

  public int getNumberOfStudents() {//retrieves student count
    numberOfStudents++;
    return numberOfStudents;
  }  

  public String getCourseName() {//retrieves Course Name
    return courseName;
  }  
  
  public String getInstructorName() {//retrieves Instructor Name
	    return instructor1;
	  }  
  
  public Student dropStudent(Student student) {//sets student to null
	  
     student=null;
     return student;
  }
}
