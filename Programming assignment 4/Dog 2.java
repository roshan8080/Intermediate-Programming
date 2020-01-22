// Name: Roshan Rijal           Date Assigned: 02/21/2017
//
// Course: CSCI 2003 63794       Date Due: 02/24/2017
//
// Instructor: Ms. Greer
//
// File name: Dog.java
//
// Program Description: This program will simulate a dog. It determines the breed of dog
                        
//                      based on its size and coat length.






// class declaration
public class Dog
{
   // instance variable 
   private String size;
   private String coatLength;
   
   /**
   argument constructor

   @param s is size of dog
   @param c is length of dog's coat 
   */   
   public Dog(String s, String c)
   {
      size = s;
      coatLength = c;
   }
   
   // no-argument constructor
   public Dog()
   {
      size = "";
      coatLength = "";
   }
     
   /**
   sets size variable
   @param s value to size
   */
   public void setSize(String s)
   {
      size = s;
   }
   
   /**
   sets coatLength variable
   @param c value to coatLength
   */ 
   public void setCoatLen(String c)
   {
      coatLength = c;
   }
      
   /**
   Gets the current size 
   @returns size
   */
   public String getSize()
   {
      return size;
   }
   
   /**
   Gets the current coatLength 
   @returns coatLength
   */
   public String getCoatLen()
   {
      return coatLength;
   }
   
   /**
   Gets the current breed 
   @returns breed
   */
   public String getBreed()
   {
      String breed = "";
      if (size.equals("Small"))
      {
         if (coatLength.equals("Short"))
         {
            breed = "Pug";
         }
         
         
         else if (coatLength.equals("Medium"))
         {
            breed = "Shiba Inu";
         }
      
         
         else if (coatLength.equals("Long"))
         {
            breed = "Cocker Spaniel";
         }
      
      }
       
      else if (size.equals("Medium"))
      {
         if (coatLength.equals("Short"))
         {
            breed = "Basset Hound";
         }
         
         else if (coatLength.equals("Medium"))
         {
            breed = "Gordon Setter";
         }
         
         else if (coatLength.equals("Long"))
         {
            breed = "Irish Setter";
         }
         
      }
       
      else if (size.equals("Large"))
      {
         if (coatLength.equals("Short"))
         {
            breed = "Weimaraner";
         }
         
         else if (coatLength.equals("Medium"))
         {
            breed = "Goldendoodle";
         }
         
         else if (coatLength.equals("Long"))
         {
            breed = "Belgian Sheepdog";
         }
      }
       
      return breed;
   }     

}

   
   

   
   

