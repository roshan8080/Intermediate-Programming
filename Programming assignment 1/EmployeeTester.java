// Name: Roshan Rijal      Date Assigned: 01/24/2017
//
// Course: CSCI 2003 42733 Date Due: 01/31/2017
//
// Instructor: Ms. Greer
//
// File name: EmployeeTester.java
//
// Program Description: This class tests the methods and constructors of the Employee Class..





public class EmployeeTester
{
   public static void main(String [] args)
   {
   
   //create 2 Employee class objects
   Employee obj1 = new Employee("Tyler Greer",12345,"Computer Science","Instructor");
   
   Employee obj2 = new Employee();
   
   
   //testing argument constructor
   System.out.println("TESTING ARGUMENT CONSTRUCTOR");
   
   System.out.println("----------------------------\n");
   
   System.out.println(obj1.getEmployeeName());
   
   System.out.println("Expected: Tyler Greer\n");
   
   System.out.println(obj1.getEmployeeID());
   
   System.out.println("Expected: 12345\n");
   
   System.out.println(obj1.getEmployeeDepartment());
   
   System.out.println("Expected: Computer Science\n");
   
   System.out.println(obj1.getEmployeePosition());
   
   System.out.println("Expected: Instructor\n");
   
   
   //set values for obj2 object
   obj2.setEmployeeName("Desiree Wilson");
   
   obj2.setEmployeeID(45678);
   
   obj2.setEmployeeDepartment("Orthopaedics");
   
   obj2.setEmployeePosition("Registered Nurse");
   
   
   //testing no-argument constructor
   System.out.println("TESTING NO-ARGUMENT CONSTRUCTOR");
   
   System.out.println("-------------------------------\n");
   
   System.out.println(obj2.getEmployeeName());
   
   System.out.println("Expected: Desiree Wilson\n");
   
   System.out.println(obj2.getEmployeeID());
   
   System.out.println("Ex[ected: 45678\n");
   
   System.out.println(obj2.getEmployeeDepartment());
   
   System.out.println("Expected: Orthopaedics\n");
   
   System.out.println(obj2.getEmployeePosition());
   
   System.out.println("Expected: Registered Nurse\n");
   
   }
}