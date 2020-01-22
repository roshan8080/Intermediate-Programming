// Name: Roshan Rijal           Date Assigned: 04/27/2017
//
// Course: CSCI 2003 63794       Date Due: 05/02/2017
//
// Instructor: Ms. Greer
//
// File name: Student.java
//
// Program Description: This class will represents a student.



public class Student
{
   private String nameOfStudent;
   private int studentID;
   
   public Student(String nameOfStudent,int studentID)
   {
      this.nameOfStudent = nameOfStudent;
      this.studentID = studentID;
   }
      
   public Student()
   {
      this.nameOfStudent = "XXX";
      this.studentID = 00000;
   }
      
   public void setNameOfStudent(String nameOfStudent)
   {
      this.nameOfStudent = nameOfStudent;
   }
      
   public void setStudentID(int studentID)
   {
      this.studentID = studentID;
   }
   
   public String getNameOfStudent()
   {
      return this.nameOfStudent;
   }
   
   public int getStudentID()
   {
      return studentID;
   }
      

}