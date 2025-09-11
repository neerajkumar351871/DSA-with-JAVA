public class BinarySearch
{
    public static int binarySearch(int numbers[],int key)
    {
        int start=0;
        int end= numbers.length-1;
        
         while(start<=end)
         {
        
            int mid=(start+end) / 2;
            
            if(numbers[mid]==key)
            {
                return mid;
            }
             if(numbers[mid]<key)
             {
                // Right update start;
                start=mid+1;
             } 
             else
             {
                //Left update end 
                end=mid-1;
             }
         }
            return -1;
            }
    public static void main(String args[])
    { int number[]={2,4,6,8,10,12,14};
      int key=12;

        System.out.print("Key inddex value : "+binarySearch(number,key));
    }
}