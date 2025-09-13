import java.util.*;
public class max
{
    // Max sub array
    public static void  maxSubarray(int array[])
    {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = i; j < array.length; j++)
            {
                sum = 0;
                for (int k = i; k < j + 1; k++)
                {
                    sum += array[k];
                }
                System.out.print(sum);

                if (maxsum < sum)   
                {
                    maxsum = sum;
                }
                if(minsum>sum)
                {
                    minsum=sum;
                }

                System.out.println();
            }
        }
        System.out.println("Max of  Subarray: " + maxsum);
        System.out.println("Min of  Subarray: " + minsum);

    }

    public static void main(String args[])
    {
        int array[] = {1,-2,6,-3};
        maxSubarray(array);
    }
}
