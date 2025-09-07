public class Dectobin
{
    public static void binarytodecmial(int number)
    {
        int bin=0;
        int power=0;
        while(number>7)
        {
      int remainder=number%2;
        bin=remainder+(int)Math.pow(10,power);
        power++;    
   }

   System.out.print(bin);
    }

    
        public static void main(String arg[])
        {
                  binarytodecmial(101);
        }
    }  
