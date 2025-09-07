public class Hollow
{
  public static void hollowprint(int row, int colu)
  {  // Column
    for(int i=1;i<=colu;i++)
    {
         // Row
         for(int j=1;j<=row;j++)
         {
            if(i==1 || i==colu || j==1 || j==row)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
         }
        System.out.println();
    }
  }
public static void main(String arg[])
{
    hollowprint(4,5);
}
}