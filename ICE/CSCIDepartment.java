// Name: Roshan Rijal           Date Assigned: 04/13/2017
//
// Course: CSCI 2003 63794       Date Due: 05/02/2017
//
// Instructor: Ms. Greer
//
// File name: CSCIDepartment.java
//
// Program Description: This class will uses Student and Course classes.



import java.util.Scanner; 

public class CSCIDepartment
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      Course obj = new Course();
      Course course1 = new Course("Introduction to Programming","CSCI 2000",60536,35);
      Course course2 = new Course("Intermediate Programming","CSCI 2003",63972,35);
      Student student3 = new Student();
      boolean flag = false;
      
      System.out.println("Course Information Access");
      System.out.println("=========================\n");
   
      while(!flag)
      {
         System.out.println("Options");
         System.out.println("=======");
         System.out.println("1. View Available Course Information");
         System.out.println("2. View Students Enrolled in Course");
         System.out.println("3. Add Student to a Course");
         System.out.println("4. View Total Enrollment for Department");
         System.out.println("5. Quit\n");
      
         System.out.print("Enter choice (1 - 5): ");
         int choice = in.nextInt();
         
         System.out.println("\n----------------------------------------------------");
      
         if (choice == 1)
         {
            System.out.println("\nAvailable Courses");
            System.out.println("=================");
            
            course1.displayCourseInfo();
            
            System.out.println();
            
            course2.displayCourseInfo();
            
            System.out.println("\n----------------------------------------------------\n");
         }
         
         else if (choice == 2)
         {
            System.out.println("\nCourse Display Options");
            System.out.println("========================");
            System.out.println("1. Introduction to Programming");
            System.out.println("2. Intermediate Programming\n");
            
            System.out.print("Enter choice (1 or 2): ");
            int choice1 = in.nextInt();
         
            if(choice1 == 1)
            {
               //System.out.println("\n\nCSCI 2000 - 60535: Introduction to Programming");
               
               course1.displayStudents();
            }
            
            else if(choice1 == 2)
            {
               System.out.println("\n\nCSCI 2003 - 63972: Intermediate Programming");
               
               if (course2.getAvailableSeats() == 35)
               {
                  System.out.println("\nNo students enrolled!");
               }
               
               else
               {
                  System.out.println("\nID          Name");
                  System.out.println("--          ----");
                  course2.displayStudents();
               }
            }
         }
         
         else if (choice == 3)
         {
            System.out.println("\nCourse Options");
            System.out.println("==============");
            System.out.println("1. Introduction to Programming");
            System.out.println("2. Intermediate Programming\n");
            
            System.out.print("Enter choice (1 or 2): ");
            int choice1 = in.nextInt();
            
            System.out.println("\nAdd a Student");
            System.out.println("=============\n");
            
            if (choice1 == 1)
            {
               System.out.print("Enter Student's Name: ");
               in.nextLine();
               String name = in.nextLine();
            
               System.out.print("Enter Student's ID: ");
               int ID = in.nextInt();
            
               Student student1 = new Student();
               student1.setNameOfStudent(name);
               student1.setStudentID(ID);
            
               course1.addStudent(student1);
            
            }
            
            else if (choice1 == 2)
            {
               System.out.print("Enter Student's Name: ");
               in.nextLine();
               String name = in.nextLine();
            
               System.out.print("Enter Student's ID: ");
               int ID = in.nextInt();
               
               System.out.println();
               System.out.println("----------------------------------------------------");
               System.out.println();
                           
               Student student1 = new Student();
               student1.setNameOfStudent(name);
               student1.setStudentID(ID);
            
               course2.addStudent(student1);
            }  
         }
         
         else if (choice == 4)
         {
            System.out.println("Total Students Enrolled: " + obj.getTotalEnrollment());
         }
         
         else
         {
            flag = true;
         }
      }
      System.out.println("\nGoodbye!");
   }
}