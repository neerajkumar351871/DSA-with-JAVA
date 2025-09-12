 import java.util.*;
  public class Question
  {
    public  static void main(String args[])
    { 
        /*Scanner input=new  Scanner(System.in);
        System.out.print("Enter ther number :");
        int whether =input.nextInt();
         Question1:Writea Java program to geta number from the user and print whether it is positive or negative.
        if(whether>=0)
        {
         System.out.println("Weathe is Positive");
        }
        else
        {
        System.out.println("Weathe is  Negative");
        */

    /*Question2:FinishthefollowingcodesothatitprintsYouhaveafeverifyourtemperatureis above 100 and otherwise prints You don't have a fever   
  
       Scanner input=new  Scanner(System.in);
        System.out.print("Enter your body Temprature :");
        double tem=input.nextDouble();
       if(tem>=100)
       {
        System.out.println(" fever");
       }
       else
       {
        System.out.print("Not fever");
       }  */
   
//Question3: WriteaJavaprogramtoinputweeknumber(1-7)andprintdayofweeknameusing switch case
  

        /* Scanner input=new  Scanner(System.in);
        System.out.print("You want to chek the day   with number 1-7  :");
         int days=input.nextInt();
         switch(days)
         {
         case 1: 
             System.out.print("Monday"); 
             break;
         case 2: 
             System.out.print("Tuesday"); 
              break; 
         case 3: 
             System.out.print("Wednesday"); 
              break;
         case 4:
              System.out.print("Thrusday"); 
               break;
        case 5: 
             System.out.print(" Friday"); 
           break;
         case 6: 
             System.out.print(" Saturday"); 
              break;
        case 7: 
             System.out.print("Sunday"); 
              break;
      
        } 
        */
       //Question5:Write a Java program that takes ayear from the user and print whether that year is a leap year or not.         

    Scanner leap = new Scanner(System.in);
     System.out.println("Enter the year you want to  check leap year or not:");
    int  year = leap.nextInt();
    if(year%4==0)
    {
        System.out.println((year)+" leap year");
    }
    else
    {
     System.out.println((year)+" Not leap year");
     }
    }
      
    }
  
  