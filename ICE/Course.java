// Name: Roshan Rijal           Date Assigned: 04/27/2017
//
// Course: CSCI 2003 63794       Date Due: 05/02/2017
//
// Instructor: Ms. Greer
//
// File name: Course.java
//
// Program Description: This class will represents a course.



public class Course
{
   private String courseName;
   private String courseCode;
   private int sectionNumber;
   private int availableSeats;;
   public Student[] studentArray;
   private static int totalEnrollment;
   private int currentNoOfStudent = 0;
   
   Student object = new Student();
  
   public Course(String courseName, String courseCode, int sectionNumber, int availableSeats)   
   {
      this.courseName = courseName;
      this.courseCode = courseCode;
      this.sectionNumber = sectionNumber;
      this.availableSeats = availableSeats;
      this.studentArray = new Student[availableSeats];
   }
   
   public Course()
   {
      this.courseName = "xxx";
      this.courseCode = "123";
      this.sectionNumber = 123;
      this.availableSeats = 123;
      this.studentArray = new Student[availableSeats];
   }
   
   public void setCourseName(String courseName)
   {
      this.courseName = courseName;
   }
   
   public void setCourseCode(String courseCode)
   {
      this.courseCode = courseCode;
   }
   
   public void setSectionNumber(int sectionNumber)
   {
      this.sectionNumber = sectionNumber;
   }

   public void setAvailableSeats(int availableSeats)
   {
      this.availableSeats = availableSeats;
   }
   
   public void setStudentArray(Student[] object)
   {
      studentArray = object;
   }
   
   public String getCourseName()
   {
      return this.courseName;
   }
   
   public String getCourseCode()
   {
      return this.courseCode;
   }
   
   public int getSectionNumber()
   {
      return this.sectionNumber;
   }
   
   public int getAvailableSeats()
   {
      return this.availableSeats;
   }
   
   public Student[] getStudentArray()
   {
      return studentArray;
   }
   
   public int getTotalEnrollment()
   {
      return totalEnrollment;
   }

   public void addStudent(Student obj)
   {
      if (availableSeats <= 0)
      {
         System.out.println("\nClass Full!\n");
         return;
      }
      
      else
      {
         studentArray[currentNoOfStudent] = obj; 
         currentNoOfStudent++;
         totalEnrollment ++;
         availableSeats --;
      }        
   }
   
   public void displayCourseInfo()
   {
      System.out.printf("\n%-9s%s","Name:",getCourseName());
      System.out.printf("\n%-9s%s","Course:",getCourseCode());
      System.out.printf("\n%-9s%d","Section:",getSectionNumber());
      System.out.printf("\n%-9s%d","Seats:",getAvailableSeats());
      System.out.println();   
   }
   
   public void displayStudents()
   {
      
      System.out.println("\n");
      System.out.println(courseCode+" - "+sectionNumber+": "+courseName);
      if (availableSeats == 35)
               {
                  System.out.println("\nNo students enrolled!\n");
               }
               
               else
               {
                  System.out.println("\nID          Name");
                  System.out.println("--          ----");
                  
               }

      for (int i = 0 ;  i < currentNoOfStudent ;i++ )
      {
         System.out.printf("%-12s%s\n", studentArray[i].getStudentID(), studentArray[i].getNameOfStudent());
         
      }
      System.out.println("\n----------------------------------------------------\n");
   }   
}