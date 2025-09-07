
import java.util.*;
public class  prime
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the prime number:");
        int  primenumber=sc.nextInt();
        if(primenumber==2)
        {
            System.out.print("No is Prime");
        }
        else
        {
          boolean prime= true;
         for(int i=2;i<=primenumber -1;i++)
         {
            if(primenumber%2==0)
            {
              prime = false;
            }
          
         }
         if( prime== true)
         {
         System.out.print("Number is prime:"+primenumber);
         }
         else
         {
        System.out.print("Number is Not prime:"+primenumber);
        }
        }
         
    }
}