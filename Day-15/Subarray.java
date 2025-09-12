public class Subarray
{
    public static void  subarray(int array[])
    {
      //Inner loop
      int totalPair=0;
      for(int i=0;i<array.length;i++)
       { int add=0;
        for(int j=i;j<array.length;j++)
        {
        int end=j;
         for(int k=i;k<j+1;k++)
         {
            System.out.print(array[k]+" ");
        }
         
          totalPair++;
         System.out.print(add);

         System.out.println();
        }
        System.out.println();

      }
      System.out.print("Total no of paris:"+ totalPair);
    }
    public static void main(String args[])
    {
         int array[]={2,4,6,8,10};
         subarray(array);
    }
}