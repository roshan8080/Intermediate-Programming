// Name: Roshan Rijal      Date Assigned: 01/24/2017
//
// Course: CSCI 2003 42733 Date Due: 01/31/2017
//
// Instructor: Ms. Greer
//
// File name: Company.java
//
// Program Description: This class uses the Employee class to simulate 3 employees.





public class Company
{
   public static void main(String [] args)
   {
      //create 3 Employee class objects
      Employee obj1 = new Employee("Susan Meyers",47899,"Accounting","Vice President");
      
      Employee obj2 = new Employee("Mark Jones",39119,"IT","Programmer");
      
      Employee obj3 = new Employee();
      
      
      //display info using printf
      System.out.printf("%-20s %-20s %-20s %-20s","Name","ID Number","Department","Position");
      
      System.out.println("\n--------------------------------------------------------------------------------");
      
      System.out.printf("%-20s %-20s %-20s %-20s",obj1.getEmployeeName(),obj1.getEmployeeID(),obj1.getEmployeeDepartment(),obj1.getEmployeePosition());
      
      System.out.printf("\n%-20s %-20s %-20s %-20s",obj2.getEmployeeName(),obj2.getEmployeeID(),obj2.getEmployeeDepartment(),obj2.getEmployeePosition());
      
      System.out.printf("\n%-20s %-20s %-20s %-20s",obj3.getEmployeeName(),obj3.getEmployeeID(),obj3.getEmployeeDepartment(),obj3.getEmployeePosition());
  
   } 
}