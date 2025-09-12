import  java.util.*;
public class Prime
{
    public static void CheckPrime(int number)
    {
         boolean isPrime = true;
         for(int i=2;i<=number-1;i++)
         {
            if( number%i==0)
            {
                isPrime=false;
            }
         }
         if(isPrime)
         {
           System.out.println("This no is  Prime:"+number);
         }
         else
         {
         System.out.println("This no is Not  Prime :"+number);
         }
    }
    public static void main(String  args[])
    {
     Scanner sc= new Scanner(System.in);
     System.out.print(" If you watn to check no is Prime or Not:");
      int num=sc.nextInt();
       CheckPrime(num);
    }
}