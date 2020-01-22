// Name: Roshan Rijal           Date Assigned: 02/14/2017
//
// Course: CSCI 2003 63794       Date Due: 02/21/2017
//
// Instructor: Ms. Greer
//
// File name: ThemeParkOnlineTickets.java
//
// Program Description: This program will run an order for tickets for a theme park.





import java.util.Scanner;

/**
this program use ThemeParkOrder class to 
display ticket information for customers
*/
public class ThemeParkOnlineTickets
{
   public static void main(String[] args)
   {
      // Scanner object
      Scanner in = new Scanner(System.in);
      
      //// ThemeParkOrder class object
      ThemeParkOrder obj = new ThemeParkOrder();
      
      //Using printf to dispaly the order information      
      System.out.println("        Welcome! Please complete your ticket order below!        ");
      System.out.println("=================================================================\n"); 
      System.out.println("    +-----------------------+-----------------+-----------------+");
      System.out.println("    |      THEME  PARK      |  ADULT  TICKET  |  CHILD TICKET   |"); 
      System.out.println("+---+-----------------------+-----------------+-----------------+");
      System.out.println("| 1 |   Universal Studios   |     $105.00     |     $100.00     |");
      System.out.println("+---+-----------------------+-----------------+-----------------+");
      System.out.println("| 2 |     Magic Kingdom     |     $124.00     |     $118.00     |");
      System.out.println("+---+-----------------------+-----------------+-----------------+");  
      System.out.println("| 3 |         Epcot         |     $114.00     |     $108.00     |");
      System.out.println("+---+-----------------------+-----------------+-----------------+\n");
      
      /*Asking user to choose number between 1 and 3
      and storing in variable option
      */
   
      System.out.print("Choose a Theme Park (1-3): ");
      int option = in.nextInt();
      System.out.print("\n\n");
      
      double adultTicketPrice = 0;
      double childTicketPrice = 0;
      String nameOfThemePark = "";
      
      
      // printing order information based on user input
      if (option == 1)
      {
         nameOfThemePark = "Universal Studios";
         adultTicketPrice = 105.00;
         childTicketPrice = 100.00;
         
         System.out.println("+-----------------------+-----------------+-----------------+");
         System.out.println("|      THEME  PARK      |  ADULT  TICKET  |  CHILD  TICKET  |");
         System.out.println("+-----------------------+-----------------+-----------------+");
         System.out.println("|   Universal Studios   |     $105.00     |     $100.00     |");
         System.out.println("+-----------------------+-----------------+-----------------+");
      }
       
      if (option == 2)
      {
         nameOfThemePark = "Magic Kingdom";
         adultTicketPrice = 124.00;
         childTicketPrice = 118.00;
         
         System.out.println("+-----------------------+-----------------+-----------------+");
         System.out.println("|      THEME  PARK      |  ADULT  TICKET  |  CHILD  TICKET  |");
         System.out.println("+-----------------------+-----------------+-----------------+");
         System.out.println("|     Magic Kingdom     |     $124.00     |     $118.00     |");
         System.out.println("+-----------------------+-----------------+-----------------+");
       }
       
      if (option == 3)
      {
         nameOfThemePark = "Epcot";
         adultTicketPrice = 114.00;
         childTicketPrice = 108.00;
         
         System.out.println("+-----------------------+-----------------+-----------------+");
         System.out.println("|      THEME  PARK      |  ADULT  TICKET  |  CHILD  TICKET  |");
         System.out.println("+-----------------------+-----------------+-----------------+");
         System.out.println("|         Epcot         |     $114.00     |     $108.00     |");
         System.out.println("+-----------------------+-----------------+-----------------+");
       }
   
      System.out.println();
      
      //asks user for total number of tickets
      System.out.print("Number of Adult Tickets: ");
      int noOfAdultTickets = in.nextInt();
      System.out.print("Number of Child Tickets: ");
      int noOfChildTickets = in.nextInt();
         
      // setters to pass user input
      obj.setNameOfThemePark(nameOfThemePark);
      obj.setAdultTicketPrice(adultTicketPrice);
      obj.setChildTicketPrice(childTicketPrice);
      obj.setNoOfChildTickets(noOfChildTickets);
      obj.setNoOfAdultTickets(noOfAdultTickets);
      System.out.print("\n");
      
      // method call to display order information            
      obj.printOrder();        
   } 

}