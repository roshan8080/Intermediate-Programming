// Name: Roshan Rijal           Date Assigned: 02/21/2017
//
// Course: CSCI 2003 63794       Date Due: 02/28/2017
//
// Instructor: Ms. Greer
//
// File name: PetStore.java
//
// Program Description: This class will use the Dog class to simulate an order from the PetStore website.




import java.util.Scanner;

public class PetStore
{
   public static void main(String[] args)
   {
      // creates dog class object
      Dog obj = new Dog();
      
      // create scanner class object
      Scanner in = new Scanner(System.in);
      
      // displays information
      System.out.println("Welcome! Select traits to choose a dog!");
      System.out.println("=======================================");
      System.out.println();
      System.out.println("======================");
      System.out.println("|  AVAILABLE PRICES  |");
      System.out.println("======================");
      System.out.println("Small Dog ----- $40.00");
      System.out.println("Medium Dog ---- $60.00");
      System.out.println("Large Dog ----- $80.00");
      System.out.println();
      System.out.println();
      System.out.println("  Sizes  ");
      System.out.println("=========");
      System.out.println("1. Small");
      System.out.println("2. Medium");
      System.out.println("3. Large");
      System.out.println();
      
      // stores dog size in choice1 variable
      System.out.print("Enter choice (1, 2, or 3): ");
      String choice1 = in.nextLine();
      
      // displays information
      System.out.println();
      System.out.println();
      System.out.println("  Coats  ");
      System.out.println("=========");
      System.out.println("1. Short");
      System.out.println("2. Medium");
      System.out.println("3. Long");
      System.out.println();
      
      // stores coat length in choice2 variable
      System.out.print("Enter choice (1, 2, or 3): ");
      String choice2 = in.nextLine();
      
      // conditions based on choice1 and choice2
      if (choice1.equals("1"))
      {
         String a = "";
         obj.setSize("Small");
         if (choice2.equals("1"))
         {
            a = "Short";
         }         
         else if (choice2.equals("2"))
         {
            a = "Medium";
         }
         else if (choice2.equals("3"))
         {
            a = "Long";
         }
         obj.setCoatLen(a);
      }
   
      if (choice1.equals("2"))
      {
         String a = "";
         obj.setSize("Medium");  
         if (choice2.equals("1"))
         {
            a = "Short";
         }         
         else if (choice2.equals("2"))
         {
            a = "Medium";
         }
         else if (choice2.equals("3"))
         {
            a = "Long";
         }
         obj.setCoatLen(a);
      }
      
      if (choice1.equals("3"))
      {
         String a = "";
         obj.setSize("Long");
         if (choice2.equals("1"))
         {
            a = "Short";
         }         
         else if (choice2.equals("2"))
         {
            a = "Medium";
         }
         else if (choice2.equals("3"))
         {
            a = "Long";
         }
         obj.setCoatLen(a);
      }
      
      System.out.println();
      System.out.println("Based on your responses, we suggest a " + obj.getBreed() + "!");
      System.out.println();
      
      // assigns proper value to subtotal based on choice1 input
      double subtotal = 0;
      if (choice1.equals("1"))
      {
         subtotal = 40.00;
      }
      else if (choice1.equals("2"))
      {
         subtotal = 60.00;
      }
      else if (choice1.equals("3"))
      {
         subtotal = 80.00;
      }
      
      // calculates tax and total price 
      double tax = 0.11 * subtotal;
      double total = subtotal + tax;
      
      // stores user input in choice3 variable
      System.out.printf("Would you like to adopt a %s for $%4.2f? (y/n): ",obj.getBreed(),subtotal);
      String choice3 = in.nextLine();
   
      // displays information based on user inputs
      if (choice3.equals("y"))
      {
         System.out.println();
         System.out.println();
         System.out.printf("%-11s%s","Breed:",obj.getBreed());
         System.out.println();
         System.out.println("---------------------------");
         System.out.printf("%-21s%s%5.2f","Subtotal:","$",subtotal);
         System.out.println();
         System.out.printf("%-21s%s%5.2f","Tax:","$",tax);
         System.out.println();
         System.out.printf("%-21s%s%5.2f","Total:","$",total);
         System.out.println("\n");
         System.out.println("Please come again!");
      }
      else if (choice3.equals("n"))
      {
         System.out.println();
         System.out.println("Please come again!");
      }            
   }
}
      

