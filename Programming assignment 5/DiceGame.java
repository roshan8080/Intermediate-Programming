// Name: Roshan Rijal           Date Assigned: 03/16/2017
//
// Course: CSCI 2003 63794       Date Due: 03/23/2017
//
// Instructor: Ms. Greer
//
// File name: DiceGame.java
//
// Program Description: This class will recreate a dice game called “Run for it!”.


import java.util.Random;    // import Random class
import java.util.Scanner;   // import Scanner class

public class DiceGame   
{
   public static void main(String[] args)
   {
      // display information 
      System.out.println("Run For It! - A Dice Game");
      System.out.println("\nRules");
      System.out.println("=====");
      System.out.println("1. 2 players take turns rolling 6 dice.");
      System.out.println("\n2. Get points if roll contains one or more sequences.");
      System.out.println("\n\t1. Sequence must start from 1 and not skip any numbers.");
      System.out.println("\n\t2. Get 5 points for each number in the sequence(s).");
      System.out.println("\n3. Get no points if roll contains no sequences.");
      System.out.println("\n4. First player to get to 100 points wins.");
      System.out.println("\n=======================================");
   
      Random generator = new Random();            // create random class object
      Scanner input = new Scanner(System.in);    // create scanner class object 
   
      int player = 1;
                            
      int score1=0;
      int score2 = 0;
   
      while(score1 < 100 && score2 < 100)    
      {
         while(player == 1)    // for player 1
         {
            System.out.print("\nPlayer "+player+" - Enter R to roll: ");
            String roll = input.nextLine();       // user input
         
            int a = generator.nextInt(6) + 1;
            int b = generator.nextInt(6) + 1;
            int c = generator.nextInt(6) + 1;   
            int d = generator.nextInt(6) + 1;     // generate random values
            int e = generator.nextInt(6) + 1;
            int f = generator.nextInt(6) + 1;
         
            // store the random value in a string 's'
            String s = a + " " + b + " " + c + " " + d + " " + e + " " + f;
         
         
            System.out.println("\nRoll: "+s);
         
            String a1="";
            String a2="";
            String a3="";  
            String a4="";
            String a5="";
            String a6="";
            int sequence = 0;
         
            // for calculation for the dice roll
            for(int q=0;q<s.length();q+=1)
            {
               if (s.charAt(q)=='1')
               {
                  a1 = s.substring(0, q) + s.substring(q + 1);
                  break;
               } 
            }
         
            for(int w=0;w<a1.length();w+=1)
            {
               if (a1.charAt(w)=='2')
               {
                  a2 = a1.substring(0,w) + a1.substring(w+1);
                  score1+=10;
                  sequence =1;
                  break;
               }
            }
         
            for(int r=0;r<a2.length();r+=1)
            {
               if (a2.charAt(r)=='3')
               {
                  a3 = a2.substring(0,r)+a2.substring(r+1);
                  score1+=5;
                  sequence = 2;
                  break;
               }
            }
         
            for(int t=0;t<a3.length();t+=1)
            {
               if (a3.charAt(t)=='4')
               {
                  a4 = a3.substring(0,t) + a3.substring(t+1);
                  score1+=5;
                  sequence = 3;
                  break;
               }
            }
         
            for(int y=0;y<a4.length();y+=1)
            {
               if (a4.charAt(y)=='5')
               {
                  a5 = a4.substring(0,y) + a4.substring(y+1);
                  score1+=5;
                  sequence=4;
                  break;
               }
            }
         
            for (int u=0;u<a5.length();u+=1)
            {
               if (a5.charAt(u)=='6')
               {
                  a6 = a5.substring(0,u)+a5.substring(u+1);
                  score1+=5;
                  sequence=5;
                  break;  
               }
            }
         
             // display the sequences based on sequence value
            if(sequence == 0)
            {
               System.out.println("\nNo Sequence!");
            }
            
            else if(sequence == 1)
            {
               System.out.println("\nSequence 1: 12");
            }
            
            else if(sequence == 2)
            {
               System.out.println("\nSequence 1: 123");
            }
            
            else if(sequence == 3)
            {
               System.out.println("\nSequence 1: 1234");
            }
            
            else if(sequence == 4)
            {
               System.out.println("\nSequence 1: 12345");
            }
            
            else if(sequence == 5)
            {
               System.out.println("\nSequence 1: 123456");
            }
           
            System.out.println("\nPlayer 1 Score: " + score1);
            System.out.println("Player 2 Score: " + score2);
            System.out.println("\n=======================================");
            player = 2; 
         }
            
         if (score1< 100)
         {
            while(player == 2)      // for player 2
            {
               System.out.print("\nPlayer "+player+" - Enter R to roll: ");
               String roll = input.nextLine();
               int a = generator.nextInt(6) + 1;
               int b = generator.nextInt(6) + 1;
               int c = generator.nextInt(6) + 1;
               int d = generator.nextInt(6) + 1;
               int e = generator.nextInt(6) + 1;
               int f = generator.nextInt(6) + 1;
            
               String s = a + " " + b + " " + c + " " + d + " " + e + " " + f;
               
            
               System.out.println("\nRoll: "+s);
            
               String a1="";
               String a2="";
               String a3="";
               String a4="";
               String a5="";
               String a6="";
            
               int sequence = 0;
            
            
               for(int q=0;q<s.length();q+=1)
               {
                  if (s.charAt(q)=='1')
                  {
                     a1 = s.substring(0, q) + s.substring(q + 1);
                     break;
                  }
               }
            
               for(int w=0;w<a1.length();w+=1)
               {
                  if (a1.charAt(w)=='2')
                  {
                     a2 = a1.substring(0,w)+a1.substring(w+1);
                     score2+=10;
                     sequence=1;
                     break;
                  }
               }
            
               for(int r=0;r<a2.length();r+=1)
               {
                  if (a2.charAt(r)=='3')
                  {
                     a3 = a2.substring(0,r)+a2.substring(r+1);
                     score2+=5;
                     sequence=2;
                     break;
                  }
               }
            
               for(int t=0;t<a3.length();t+=1)
               {
                  if (a3.charAt(t)=='4')
                  {
                     a4 = a3.substring(0,t)+a3.substring(t+1);
                     score2+=5;
                     sequence=3;
                     break;
                  }
               }
            
               for(int y=0;y<a4.length();y+=1)
               {
                  if (a4.charAt(y)=='5')
                  {
                     a5 = a4.substring(0,y)+a4.substring(y+1);
                     score2+=5;
                     sequence=4;
                     break;
                  }
               }
            
               for (int u=0;u<a5.length();u+=1)
               {
                  if (a5.charAt(u)=='6')
                  {
                     a6 = a5.substring(0,u)+a5.substring(u+1);
                     score2+=5;
                     sequence=5;
                     break;
                  }
               }
            
               if(sequence==0)
               {
                  System.out.println("\nNo Sequence!");
               }
               
               else if(sequence==1)
               {
                  System.out.println("\nSequence 1: 12");
               }
               
               else if(sequence==2)
               {
                  System.out.println("\nSequence 1: 123");
               }
               
               else if(sequence==3)
               {
                  System.out.println("\nSequence 1: 1234");
               }
               
               else if(sequence==4)
               {
                  System.out.println("\nSequence 1: 12345");
               }
               
               else if(sequence==5)
               {
                  System.out.println("\nSequence 1: 123456");
               }
               
               System.out.println("\nPlayer 1 Score: "+score1);
               System.out.println("Player 2 Score: "+score2);
               System.out.println("\n=======================================");
               player = 1;
            }
         }
      }
   
      if (score1>score2)        // display winner of the game
      {
         System.out.println("\t\n             Player 1 Wins!");
         System.out.println("\n=======================================");
      }
      
      else if(score1<score2)
      {
         System.out.println("\t\n             Player 2 Wins!");
         System.out.println("\n=======================================");
      }
   }
}
