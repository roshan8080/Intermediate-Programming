// Name: Nitesh Karki        Date Assigned: 03/23/2017
//
// Course: CSCI 2003 63794       Date Due: 03/29/2017
//
// Instructor: Ms. Greer
//
// File name: Planner.java
//
// Program Description: The program allows the user to add a new event to the planner, display all the events currently stored in the planner, or to quit the program

//Importing java utility and i/o classes
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;        
import java.io.PrintWriter;

public class Planner

{

   // Displays exception message when found
   public static void main(String[] args) throws FileNotFoundException       
   
   { 
      System.out.println("Personal Planner");
      System.out.println("================");
      
     //scanner object input is made to take user choice
      Scanner input = new Scanner (System.in);    
            
   
      
      int choice = 0;
      do 
      
      { 
      //displays choices for the user
         System.out.println("\nOptions:");
         System.out.println("========");
         System.out.println("1. Add Event");
         System.out.println("2. Display Events");       
         System.out.println("3. Quit\n");
      
         System.out.print("Enter options (1, 2 or 3): ");
         
         choice = input.nextInt();        
         System.out.println("");

          File temp = new File("temporary.txt");                     //File object temp is created refering to tempprary.txt 
          PrintWriter pw2 = new PrintWriter("temporary.txt");  //PrintWriter pw2 object to write information into temporary.txt file
            
         
         if (choice == 1)                          
         
         {
            input.nextLine();      
            File planner = new File("planner.txt");        //File object planner is created referring to planner.txt 
            
            if (planner.exists())                          //executes the body of if, if planner object having reference od planner.txt exists
            {
            
               Scanner scan = new Scanner (planner);             //Scanner object to read from planner.txt
               Scanner scanTemp = new Scanner (temp);            //Scanner object to read from temporary.txt
            
              
            
               while (scan.hasNextLine())                      //reads the content of planner.txt and prints it in temporary.txt file through pw2 object
               {
               
                  pw2.println(scan.nextLine());
               
               }
            
            //takes information from user
            
               System.out.print("Enter date (MM/DD/YY): ");         //for date
               String date = input.nextLine();
               
               System.out.print("Enter time (HH:MM): ");            //for time  
               String time = input.nextLine();
               
               System.out.print("Enter location: ");
               String location = input.nextLine();        //for location
               
               System.out.print("Enter event: ");
               String event = input.nextLine();           //for event
            
               pw2.println(date);
               pw2.println(time);
               pw2.println(location);           //appends information in temporary.txt  file
               pw2.println(event);
               pw2.println("");
               System.out.println("");
            
            
               pw2.close();
               scan.close();           //closes the input stream and reading stream of temporary and planner file respectively
            
            
               PrintWriter pw = new PrintWriter("planner.txt");//copies content of temporary file to planner file            
               while (scanTemp.hasNextLine())
               
               {
               
                  pw.println(scanTemp.nextLine());             // writes everything from temporary.txt back to planner.txt
               
               }
            
               scanTemp.close();
               pw.close();        //closees the input stream and reading stream of planner and temporary file  
            }
            
           //executes if the planner.txt file doesn't exist 
            else
            {
               PrintWriter pw = new PrintWriter("planner.txt");//initializes the planner.txt file if it doesnt exist             
              
              //repetation of all processes as above
               Scanner scan = new Scanner (planner);                   
               Scanner read_temp = new Scanner (temp);
            
               Scanner user_input = new Scanner (System.in);
            
            
               while (scan.hasNextLine())
               {
               
                  pw2.println(scan.nextLine());             
               
               }
            
         //takes input from the user            
               System.out.print("Enter date (MM/DD/YY): ");         
               String date = input.nextLine();
               
               System.out.print("Enter time (HH:MM): ");
               String time = input.nextLine();     
               
               System.out.print("Enter location: ");     
               String location = input.nextLine();    
               
               System.out.print("Enter event: ");          
               String event = input.nextLine();
            
               pw2.println(date);
               pw2.println(time);
               pw2.println(location);                 //writes new information to temporary.txt
               pw2.println(event);
               pw2.println("");
               System.out.println("");
            
            
               pw2.close();
               scan.close();          
                           
               while (read_temp.hasNextLine())
               
               {
               
                  pw.println(read_temp.nextLine());    // transferring the updated data back to planner.
               
               }
            
               read_temp.close();                        
               pw.close();          
            
            
            }
         
         }
         
                  
         
         else if (choice == 2)      //executes this block of statement if user input is 2         {
         {   
            input.nextLine();
            File planner = new File("planner.txt");  
            
            if (planner.exists())                    //if planner.txt already exist
            {
               Scanner scan = new Scanner (planner);   //Scanner object to read from planner.txt
              
               if (!scan.hasNextLine())            //displays the message if the file has nothing written 
               {
                  System.out.println("No events added!\n");
               }
               
               while (scan.hasNextLine())         //displays the contents from planner file
               {
                  System.out.println(scan.nextLine());
               }
               scan.close();           //closing reading stream object.
            }
            
            else  //executes if the file do not exist and user want to view the contents 
            {
               PrintWriter pw = new PrintWriter("planner.txt");       //otherwise if planner.txt doesnot exist planner.txt is created at first
               
               Scanner scan = new Scanner (planner);    //Scanner object to read from planner.txt     
               
               if (!scan.hasNextLine())
               {
                  System.out.println("No events added!\n");                 //displays if there is no content in the file        
               }
               
               while (scan.hasNextLine())                                  //displays everything from planner.txt
               {
                  System.out.println(scan.nextLine());
               }
               scan.close();
            }
         
         }     
         
        
         
      }
      while(choice != 3);// loops until user enters 3 to quit

   }
}