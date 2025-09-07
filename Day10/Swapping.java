public class Swapping
{
     public static void swapp(int a, int b)
     {
    System.out.println("Before  Swapping :"+"A:"+a+",B:"+b); 
    int c=a+b;
     b=c-b;
     a=c-a;
    System.out.println(" After   Swapping :"+"A:"+a+",B:"+b); 

     }
    public static void main(String args[])
    {
        int a=5; //20
        int b=10; //10
    /* System.out.print(a+""+ b+"\n");
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.print("Value of a:"+a+"Value of B:"+b);
         */
    /*Second method 
     int c=a+b;
     b=c-b;
     a=c-a;
     System.out.print("After  Swapping a:"+a+"Value of b"+b);
     */
    swapp(a,b);
    }
}