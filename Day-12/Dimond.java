 public class  Dimond
 {  public  static void DimondPattern(int n)
 {
    //inner loop
    for(int i=1;i<=n;i++)
    {
        // space
        for(int sp=1;sp<=(n-i);sp++)
        {
             System.out.print(" ");
        }
        // Star
        for(int j=1;j<=(2*i)-1;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    // Reverse
    {
       //inner loop
    for(int i=n;i>=1;i--)
    {
        // space
        for(int sp=1;sp<=(n-i);sp++)
        {
             System.out.print(" ");
        }
        // Star
        for(int j=1;j<=(2*i)-1;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    } 
    }
 }
    public  static void main(String args[])
    {
       DimondPattern(5);
    }
 }