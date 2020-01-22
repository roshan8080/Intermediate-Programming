// Name: Roshan Rijal      Date Assigned: 01/31/2017
//
// Course: CSCI 2003 42733 Date Due: 02/07/2017
//
// Instructor: Ms. Greer
//
// File name: RoomTester.java
//
// Program Description: This class tests the methods and constructors of the Room Class..






public class RoomTester
{
   public static void main(String[] args)
   {
   
      //create 2 Room class objects
      Room obj1 = new Room(3,10,15);
      
      Room obj2 = new Room();
   
      
      //testing argument constructor
      System.out.println("TESTING ARGUMENT CONSTRUCTOR");
      
      System.out.println("----------------------------\n");
      
      System.out.println(obj1.getNoOfWalls());
      
      System.out.println("Expected: 3\n");
      
      System.out.println(obj1.getHeight());
      
      System.out.println("Expected: 10.0\n");
      
      System.out.println(obj1.getWidth());
      
      System.out.println("Expected: 15.0\n");
      
      System.out.println(obj1.getArea());
      
      System.out.println("Expected: 450.0\n");
      
      
      //testing toString method for argumented constructor
      System.out.println("Testing toString Method");
      
      System.out.println("-----------------------");
      
      System.out.println(obj1);
        
           
      //set values for obj2 object
      obj2.setNoOfWalls(5);
      
      obj2.setHeight(8);
      
      obj2.setWidth(11);
      
      
      //testing no-argemented constructor
      System.out.println("TESTING NO-ARGUMENT CONSTRUCTOR");
      
      System.out.println("-------------------------------\n");

      System.out.println(obj2.getNoOfWalls());
      
      System.out.println("Expected: 5\n");
      
      System.out.println(obj2.getHeight());
      
      System.out.println("Expected: 8.0\n");
                
      System.out.println(obj2.getWidth());
      
      System.out.println("Expected: 11.0\n");
      
      System.out.println(obj2.getArea());
      
      System.out.println("Expected: 440.0\n");

      
      //testing toString method for no-argumented constructor
      System.out.println("Testing toString Method");
      
      System.out.println("-----------------------");

      System.out.println(obj2);
   }
   
}