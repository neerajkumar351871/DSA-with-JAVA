 public class Pattern
{
    public static void main(String args[])
    { /*
        for(int i=0;i<10;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
          System.out.println(" ");  
        }
        */
       // Inverted  pattern
   /*  int n=4;
    for(int i=1;i<=n;i++)
    {
    for(int j=1;j<=(n-i+1);j++)
   {
    System.out.print("*");
   }
   System.out.println(" ");
    }
    */
  /*
   1
   12
   123
   1234 
  int n=4;
     for(int i=1;i<=n;i++)
     {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j);
        }
        System.out.println(" ");
     } 
     */

    /*
    A
    BC
    DEF
    GHIJ
    */ 
   int a=4;
   char  ch='A';
   for(int i=1;i<=a;i++)
   {
    for(int j=1;j<=i;j++)
    {
        System.out.print(ch);
        ch++;
    }
    System.out.println(" ");
   }
 
    }
}