public class HalfPyramid
{  public static void halfPyramid(int n)
{
    // Tracing the lines
    for(int i=1;i<=n;i++)
    {    // Print the space
        for(int k=1;k<=n-i;k++)
        {
            System.out.print(" ");
        }
         for(int j=1;j<=i;j++)
           {
            System.out.print("*");
           } 
        System.out.println();
        
    }
}

    public static void main(String args[])
    {
     halfPyramid(15);
    
    }
}