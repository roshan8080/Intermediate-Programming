// Name: Roshan Rijal      Date Assigned: 01/24/2017
//
// Course: CSCI 2003 42733 Date Due: 01/31/2017
//
// Instructor: Ms. Greer
//
// File name: Employee.java
//
// Program Description: This class simulates employees.





public class Employee
{
   //declare instance variables
   private String employeeName;
   
   private int employeeID;
   
   private String employeeDepartment;
   
   private String employeePosition;
   
   
   /**
   Sets employeeName variable
   @param name value to set to employeeName
   */
   public void setEmployeeName(String name)
   {
      employeeName = name;
   }
   
   
   /**
   Sets employeeID variable
   @param ID value to set to employeeID
   */
   public void setEmployeeID(int ID)
   {
      employeeID = ID;
   }
   
   
   /**
   Sets employeeDepartment variable
   @param department value to set to employeeDepartment
   */
   public void setEmployeeDepartment(String department)
   {
      employeeDepartment = department;
   }
   
   
   /**
   Sets employeePosition variable
   @param position value to set to employeePosition
   */
   public void setEmployeePosition(String position)
   {  
      employeePosition = position;
   }
   
   
   /**
   Gets the current employeeName
   @return the employeeName
   */
   public String getEmployeeName()
   {
      return employeeName;
   }
  
   
   /**
   Gets the current employeeID
   @return the employeeID
   */
   public int getEmployeeID()
   {
      return employeeID;
   }
   
  
   /**
   Gets the current employeeDeaprtment
   @return the employeeDepartment
   */
   public String getEmployeeDepartment()
   {
      return employeeDepartment;
   }
   
  
   /**
   Gets the current employeePosition
   @return the employeePosition
   */
   public String getEmployeePosition()
   {
      return employeePosition;
   }
   
   
   //no-argument constructor
   public Employee()
   {
      employeeName = "Joy Rogers";
      
      employeeID = 81774;
      
      employeeDepartment = "Manufacturing";
      
      employeePosition = "Engineer";
   }
   
   
   //argument constructor
   public Employee(String employeeName1,int employeeID1,String employeeDepartment1,String employeePosition1)
   {
      employeeName = employeeName1;
      
      employeeID = employeeID1;
      
      employeeDepartment = employeeDepartment1;
      
      employeePosition = employeePosition1;
      
   }
   
}
