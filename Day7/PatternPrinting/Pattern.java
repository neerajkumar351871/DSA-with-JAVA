import java.util.*;

public class Pattern
{
    public static void main(String args[])
    {
        /*
        Scanner  value = new  Scanner(System.in);
        int data=value.nextInt();
      
       for(int i=1;i<=data;i++)
       {
          System.out.println("*****"); 
       
       

    }
       */

        //Reverxe value 4321
       
   /*    System.out.println("Heel");
   
    int a=5;
    for(int j=5;j>=0;j--)
    {
        System.out.println(j);
    } */

 int  n=24072003;
 while(n>0)
 {
    int  lastdigit=n%10;
    System.out.print(lastdigit + "");
    n/=10;
 }
    }
}