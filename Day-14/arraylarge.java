 import java.util.*;
 public class arraylarge
 { // find large value in array
    public static  void  arraylarge(int number[])
    {  int store=0;
        for(int i=0;i<number.length;i++)
        {
           if(store<number[i])
           {
            store=number[i];
           }
        }
       System.out.print("Large value: "+ store); 
    } 
    public static  int getLargevalue(int number[])
    {
      int  largest= Integer.MIN_VALUE;
      int  smallest =Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++)
        {
            if(largest<number[i])
            {
                largest=number[i];
            }
            if(smallest>number[i])
            {
                smallest=number[i];
            }
        }
        System.out.println("Largest value  is :"+ largest);
        System.out.println("Smallest  value is :"+ smallest);
        return 0 ;
    }

    public static void main( String args[])
    {
       int number[]={0,2,-3,6,5,11};
       getLargevalue(number);
       
     }
 }