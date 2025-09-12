import java.util.*;
public class Factorial
{
    public static  void fact(int act)
    {
     int fact=1;
    for(int i=1;i<=act;i++)
    {
        fact*=i;
    }
    System.out.print("Factorial number :"+fact);
    }
   public static void main(String arg[])
   {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the numbe you Want to Factorial:");
    int no= sc.nextInt();
   fact(no);

   }
}