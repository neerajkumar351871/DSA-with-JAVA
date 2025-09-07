public class funoverload
{
    public static void sum(int a,int b)
    {
        int sum=a+b;
        System.out.println("Add to Two number:"+sum);
    }
   /* public static void sum(int a, int b,int c)
    {
        int sum=a+b+c;
        System.out.println("Add of three number:"+sum);
    }
    */
   public static void sum(float a, float b)
    {
        float sum=a+b;
        System.out.println("Add of three number:"+sum);
    }
    public static void main(String args[])
    {
        int a=10;
        float b=20.6f;
        sum(a,b);
        sum(a,b);
    }
}