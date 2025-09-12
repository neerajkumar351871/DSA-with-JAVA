public class Pair
{// Pairs in array
public static void pair(int number[])
{
    for(int i=0;i<number.length;i++)
    {


        int var=number[i];
        for(int j=i+1;j<number.length;j++)
        {
            System.out.print("("+var+","+number[j]+")"+",");
        }
        System.out.println();
    }
}
    
    public static void main(String args[])
    {
        int number[]={2,4,6,8,10};
        pair(number);
     
     /*(2,4),(2,6),(2,8),(2,10),
     (4,6),(4,8),(4,10),
     (6,8),(6,10),
     (8,10)
     */
    }
}