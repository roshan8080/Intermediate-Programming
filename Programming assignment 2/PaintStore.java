// Name: Roshan Rijal      Date Assigned: 01/31/2017
//
// Course: CSCI 2003 42733 Date Due: 02/07/2017
//
// Instructor: Ms. Greer
//
// File name: PaintStore.java
//
// Program Description: This class uses the Room class to simulate a customer buying paint to paint a room.






import java.util.Scanner;

public class PaintStore
{
   public static void main(String[] args)
   {
      //create object of Scanner class to use it
      Scanner input = new Scanner(System.in);
      
      System.out.println("Welcome to the Paint Store!");
      System.out.println("===========================\n");      
      System.out.println("Step 1: choose your paint color");
      System.out.println("-------------------------------");
      System.out.printf("%-10s %-10s","purple","green");
      System.out.printf("\n%-10s %-10s","blue","teal");   
      System.out.printf("\n%-10s %-10s","yellow","red");
      System.out.print("\n\nEnter a paint color: ");
      
      //Get user to input paint colornand store it in color variable
      String color = input.nextLine();
      
      System.out.println("\n\nStep 2: Tell us about your room");
      
      System.out.println("-------------------------------");
      
            
      //Prompt user to input no of walls in the room and store it in noOfWalls variable
      System.out.print("Enter the number of walls in the room: ");

      int noOfWalls = input.nextInt();
      
            
      //Prompt user to input heigth of one wall and store it in heigth variable
      System.out.print("Enter the height of one wall: ");

      double height = input.nextDouble();
      
      
      //Prompt user to input width of one wall and store it in width variable
      System.out.print("Enter the width of one wall: ");
      
      double width = input.nextDouble();
      
      System.out.println("\n\nStep 3: Paint needed");
      
      System.out.println("--------------------");
   

      //create Room class object and pass customer's input 
      Room obj = new Room(noOfWalls,height,width);


      //calculate no of cans needed,subtotal,tax and total
      double cans = Math.ceil(obj.getArea()/ 250);
      
      double subtotal = cans * 8.99;
      
      double tax = 0.11 * subtotal;
      
      double total = subtotal + tax;
      
      
      //display info   
      System.out.printf("You need %.0f cans of purple paint to cover %.1f sqft.",cans,obj.getArea());
   
      System.out.println("\n\n\nStep 4: Final price");
      
      System.out.println("-------------------");
      
      System.out.printf("%-9s %s%.2f","Subtotal:","$",subtotal);
      
      System.out.printf("\n%-9s %s%.2f","Tax:","$",tax);
      
      System.out.printf("\n%-9s %s%.2f","Total:","$",total);
      
      System.out.println("\n\nThank you for shopping with us!");
   
   }
   
   

}