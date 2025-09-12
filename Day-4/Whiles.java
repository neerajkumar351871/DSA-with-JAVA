import java.util.*;
public class Whiles
{
 public static void main (String args[])
 {

    Scanner inputs= new Scanner(System.in);
  System.out.print(" Enter the number:");
int  count =inputs.nextInt();    
int i=1;
int sum=0;
while(i<=count)
{
    sum+=i;
    i++;
}
System.out.print("Sum of numbers: "+sum);
}
}