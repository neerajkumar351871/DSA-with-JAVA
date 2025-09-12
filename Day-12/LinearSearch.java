public class LinearSearch
{
    public static  int linearSearch(int  marks[],int key)
    {
        for(int i=0;i<marks.length;i++)
        {
           if(marks[i]== key)
           {
            return 1;
           }
           }
        return -1;
    }
  public static void main(String args[])
  {
     int marks[]={97,98,99,10,23,30};
     int key=89;
    int index=linearSearch(marks,key);
    
    if(index == 1)
    {
    System.out.print("Key is found :"+key);
    }
    else
    {
    System.out.print("Key is  not  found :"+key);
}
  }
}