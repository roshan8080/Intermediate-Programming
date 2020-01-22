// Name: Roshan Rijal           Date Assigned: 04/13/2017
//
// Course: CSCI 2003 63794       Date Due: 04/27/2017
//
// Instructor: Ms. Greer
//
// File name: Calendar.java
//
// Program Description: This class will create a single month of a calendar.
                     

import java.util.*;     // import all classes of java.util

public class Calendar
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);      // Create Scanner class object
      
      System.out.println("Create a Calendar");      
      System.out.println("=================\n");
      
      // Declare and initialize some varaibles
      int year = 0;
      int month = 0;
      int day = 0;
      
      
      do
      {
         //try-catch clause to catch InputMismatchException exception
         try
         {
            System.out.print("Enter Year: ");      
            year = in.nextInt();                   // Strore user input in year variable
         }
         catch(InputMismatchException e)
         {
           
         }
         in.nextLine();
      } 
      while(year <= 0);             // Executes only if year is negative or zero
      
    
      // displays months 
      System.out.println("\nEnter Month");
      System.out.println("-----------");
      System.out.println("1. January    5. May       9. September");
      System.out.println("2. February   6. June     10. October");
      System.out.println("3. March      7. July     11. November");
      System.out.println("4. April      8. August   12. December");
      System.out.println();
      
      
      do
      {
         //try-catch clause to catch InputMismatchException exception
         try
         {
            System.out.print("Enter Month (1 - 12): ");
            month = in.nextInt();                        // Strore user input in month variable    
         }
         catch(InputMismatchException e)
         {
           
         }
         in.nextLine();
      }
      while(month < 1 || month > 12);     // Executes only if month is out of range i.e > 12 or < 1
     
      // displays days   
      System.out.println("\nChoose Day of Week of the 1st Day");
      System.out.println("---------------------------------");
      System.out.println("1. Sunday       5. Thursday");
      System.out.println("2. Monday       6. Friday");
      System.out.println("3. Tuesday      7. Saturday");
      System.out.println("4. Wednesday");
      System.out.println();
      
    
      do
      {
         //try-catch clause to catch InputMismatchException exception
         try
         {
            System.out.print("Enter Day of the Week (1 - 7): ");
            day = in.nextInt();                                  // Store user input in day variable
         }
         catch(InputMismatchException e)
         {
            
         }
         in.nextLine();
      }
      
       while (day < 1 || day > 7);              // Executes only if day is out of range i.e > 7 or < 1
      
      
      // associating the number of month to the actual month
      String actualMonth = ""; 
      if (month == 1)
      {
         actualMonth = "January";
      }
      else if (month == 2)
      {
         actualMonth = "February";
      }
      else if (month == 3)
      {
         actualMonth = "March";
      }
      else if (month == 4)
      {
         actualMonth = "April";
      }
      else if (month == 5)
      {
         actualMonth = "May";
      }
      else if (month == 6)
      {
         actualMonth = "June";
      }
      else if (month == 7)
      {
         actualMonth = "July";
      }
      else if (month == 8)
      {
         actualMonth = "August";
      }
      else if (month == 9)
      {
         actualMonth = "September";
      }
      else if (month == 10)
      {
         actualMonth = "October";
      }
      else if (month == 11)
      {
         actualMonth = "November";
      }
      else 
      {
         actualMonth = "December";
      }
      
      int noOfDays = 0;
      
      
      // Leap year calculation
      boolean leapYear;
      
      if (year % 4 == 0 && year % 100 != 0)
      {
         leapYear = true;
      }
      else if (year % 400 == 0)
      {
         leapYear = true;
      }
      else
      {
         leapYear = false;
      }
      
      // check Leap year for February
      if (month == 2 )
      {
         if (leapYear == true)
         {
            noOfDays = 29;
         }
         else
         {
            noOfDays = 28;
         }
      }
      
      
      // assign total number of days to each month
      if (month == 1 || month == 3 || month == 5 || month == 7 || +
          month == 8 || month == 10 || month == 12 )
      {
         noOfDays = 31;
      }
      else if (month == 4 || month == 6 || month == 9 || month == 11)
      {
         noOfDays = 30;
      }    
      
      System.out.println("\n");
      System.out.printf(" %-10s%10d",actualMonth,year);
      System.out.println("\n --------------------");
      System.out.println("  S  M  T  W  T  F  S");
      System.out.println(" --------------------");
      
      // Declare and initialize some variables
      int m = 1;
      String week1 = "";
      String weeks ="";
      
      int dayArray[][] = new int[6][7];         // Create 2-D array which stores days
      
      // displays first week
      for (int i = 0; i < dayArray.length; i++)
      {
         if (i == 0)
         {
            for (int j = day -1; j < dayArray[i].length; j++ )
            {
               dayArray[i][j] = m;
               m++;
               week1 += dayArray[i][j]+ "  ";
               
            }
            System.out.printf("%23s\n",week1);
         }
         else
         {
            // displays remaining week
            for (int j = 0; j < dayArray[i].length; j++)
            {
               if (m > noOfDays)
               {
                  break;
               }
               dayArray[i][j] = m; 
               m++;
               weeks = dayArray[i][j] + "";
               System.out.printf("%3s",weeks);
            } 
            System.out.println();
         }
      } 
   }   
}