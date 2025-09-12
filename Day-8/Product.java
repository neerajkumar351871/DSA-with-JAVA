import java.util.*;
public class Product
{
    public static void multiply(int a,int b)
    {
        int c=a*b;
        System.out.print("Multiple of  A*b :"+c);
    }
    public static void main(String arg[])
    {
      Scanner  sc=new  Scanner(System.in);
      System.out.print("Enter the vlaue of A:");
      int a =sc.nextInt();
      System.out.print("Enter the vlaue of B:");
      int b =sc.nextInt();
      multiply(a,b);
    

    }
}