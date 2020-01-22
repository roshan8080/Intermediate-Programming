// Name: Roshan Rijal           Date Assigned: 02/14/2017
//
// Course: CSCI 2003 63794       Date Due: 02/21/2017
//
// Instructor: Ms. Greer
//
// File name: ThemeParkOrder.java
//
// Program Description: This program will simulate an order for tickets to a theme park.





//Class Declaration
public class ThemeParkOrder
{
   //Instance Variable Declaration
   private String nameOfThemePark;
   private double adultTicketPrice;
   private int noOfAdultTickets;
   private double childTicketPrice;
   private int noOfChildTickets;  
   
   //no-argument constructor
   public ThemeParkOrder()
   {
      this.nameOfThemePark = " ";
      this.adultTicketPrice = 0;
      this.noOfAdultTickets = 0;
      this.childTicketPrice = 0;
      this.noOfChildTickets = 0;
   }
   
   /**
   argumented Constructor

   @param nameOfThemePark is name of theme park
   @param adultTicketPrice is ticket price for adult
   @param noOfAdultTickets is tickets purchased for adults
   @param childTicketPrice is ticket price for child
   @param noOfChildTickets is tickets purchased for child
   */
   public ThemeParkOrder(String nameOfThemePark, double adultTicketPrice, int noOFAdultTickets, double childTicketPrice, int noOfChildTickets)
   {
      this.nameOfThemePark = nameOfThemePark;
      this.adultTicketPrice = adultTicketPrice;
      this.noOfAdultTickets = noOfAdultTickets;
      this.childTicketPrice = childTicketPrice;
      this.noOfChildTickets = noOfChildTickets;
   }
    
   // setters
   
   /**
   sets nameOfThemePark variable
   @param nameOfThemePark value to this.nameOfThemePark
   */  
   public void setNameOfThemePark(String nameOfThemePark)
   {
      this.nameOfThemePark = nameOfThemePark;
   }

   /**
   sets adultTicketPrice variable
   @param adultTicketPrice value to this.adultTicketPrice
   */
   public void setAdultTicketPrice(double adultTicketPrice)
   {
      this.adultTicketPrice = adultTicketPrice;
   }
   
   /**
   sets noOfAdultTickets variable
   @param noOfAdultTickets value to this.noOfAdultTickets
   */
   public void setNoOfAdultTickets(int noOfAdultTickets)
   {
      this.noOfAdultTickets = noOfAdultTickets;
   }

   /**
   sets childTicketPrice variable
   @param childTicketPrice value to this.childTicketPrice
   */
   public void setChildTicketPrice(double childTicketPrice)
   {
      this.childTicketPrice = childTicketPrice;
   }

   /**
   sets noOfChildTickets variable
   @param noOfChildTickets value to this.noOfChildTickets
   */
   public void setNoOfChildTickets(int noOfChildTickets)
   {
      this.noOfChildTickets = noOfChildTickets;
   }
   
   //Getter Methods

   /**
   Gets the current nameOfThemePark 
   @returns nameOfThemePark
   */
   public String getNameOfThemePark()
   {
      return this.nameOfThemePark;
   }
   
   /**
   Gets the current adultTicketPrice 
   @returns adultTicketPrice
   */
   public double getAdultTicketPrice()
   {
      return this.adultTicketPrice;
   }
   
   /**
   Gets the current noOfAdultTickets
   @returns noOfAdultTickets
   */
   public int getNoOfAdultTickets()
   {
      return this.noOfAdultTickets;
   }
   
   /**
   Gets the current childTicketPrice 
   @returns childTicketPrice
   */
   public double getChildTicketPrice()
   {
      return this.childTicketPrice;
   }
   
   /**
   Gets the current noOfChildTickets 
   @returns noOfChildTickets
   */
   public int getNoOfChildTickets()
   {
      return this.noOfChildTickets;
   }
   
   /**
   calculates discount based on number of tickets purchased
   @return discount
   */
   public double getDiscountPrice()
   {
      double discount;
      int totalNoOfTickets = noOfAdultTickets + noOfChildTickets;

      if (totalNoOfTickets < 3)
      {
         discount = 0;
      }
      else if (totalNoOfTickets == 3)
      {
         discount = 5;
      }
      else if (totalNoOfTickets == 4)
      {
         discount = 10;
      }
      else if (totalNoOfTickets == 5)
      {
         discount = 15;
      }
      else 
      {
         discount = 20;
      }
      return discount; 
   }
    
   /**
   calclates total price without adding taxes
   @return subTotal
   */
   public double getSubTotal()
   {
      double totalPrice = (adultTicketPrice * noOfAdultTickets) + (childTicketPrice * noOfChildTickets);
      double subTotal = totalPrice - (totalPrice * getDiscountPrice()/100) ;
      return subTotal; 
   }
    
   /**
   calculates tax and prints the complete order using printf
   */
   public void printOrder()
   {
      System.out.println();
      System.out.println(nameOfThemePark + " Ticket Order");
      System.out.println("------------------------------------");
      System.out.printf("%-21s %2.0f%s","Discount:",getDiscountPrice(),"%");
      System.out.println("\n");
      System.out.printf("%-11s %d %s %2s %6.2f","Adult:",noOfAdultTickets,"X","$",adultTicketPrice);
      System.out.printf("\n%-11s %d %s %2s %6.2f","Child:",noOfChildTickets,"X","$",childTicketPrice);
      System.out.println("\n------------------------------------");
      
      double tax = 0.11 * getSubTotal();
      double total = getSubTotal() + tax; 
      System.out.printf("%-15s %s %7.2f","Subtotal:","$",getSubTotal());
      System.out.printf("\n%-15s %s %7.2f","Tax","$",tax);
      System.out.printf("\n%-15s %s %7.2f","Total","$",total);
         
   
   }
       
      


}
