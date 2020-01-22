// Name: Roshan Rijal      Date Assigned: 01/31/2017
//
// Course: CSCI 2003 42733 Date Due: 02/07/2017
//
// Instructor: Ms. Greer
//
// File name: Room.java
//
// Program Description: This class simulates a room.






public class Room
{
  
   //declare instance variables
   private int noOfWalls;
   
   private double height;
   
   private double width;
   
   
   //argumented constructor
   public Room(int noOfWalls,double height,double width)
   {    
      this.noOfWalls = noOfWalls;
      
      this.height = height;
      
      this.width = width;
   }
   
   
   //no-argumented constructor
   public Room()
   {
      this.noOfWalls = 1;
      
      this.height = 2;
      
      this.width = 3;
   }
   
   
   /**
   Gets the current noOfWalls
   @return the noOfWalls
   */
   public int getNoOfWalls()
   {
      return noOfWalls;
   }
   
  
   /**
   Gets the current height
   @return the height
   */  
   public double getHeight()
   {
      return height;
   }
   
  
   /**
   Gets the current width
   @return the width
   */  
   public double getWidth()
   {
      return width;
   }
   
   
   /**
   Sets noOfWalls variable
   @param noOfWallls value to set this.noOfWalls
   */
   public void setNoOfWalls(int noOfWalls)
   {
      this.noOfWalls = noOfWalls;
   }
   
   
   /**
   Sets height variable
   @param heigth value to set to this.heigth
   */
   public void setHeight(double height)
   {
      this.height = height;
   }
   
   
   /**
   Sets width variable
   @param width value to set to this.width
   */
   public void setWidth(double width)
   {
      this.width = width;
   }
   
   
   /**
   Gets the current area
   @return the area
   */
   public double getArea()
   {
      return noOfWalls*height*width;
   }
   
   
   //returns the string representation of the object. 
   public String toString()
   {
      return "Walls:  " + noOfWalls +
             "\nHeight: " + height + " ft" +
             "\nWidth:  " + width + " ft" + "\n"; 
   }
         

}