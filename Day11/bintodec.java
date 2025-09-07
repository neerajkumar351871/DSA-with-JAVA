    public class bintodec
    {
    public static void dectobin(int number)
{    int n=number;
    int pow=0;
    int binnum=0;
    while(n>0)
    {
        int rem= n%2;
        binnum=binnum+(rem*(int)Math.pow(10,pow));
        pow++;
        n=n/2;

    }
    System.out.print("Decmila to Binary:"+binnum);
}

public static void main(String args[])
{
    dectobin(9
    
    );
}
}