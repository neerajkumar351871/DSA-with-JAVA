import java.util.*;
public class array
{
    public static void main( String args[])
    {
        // creating array
        int marks[]= new int[100];
         
         // input 
         Scanner sc=new Scanner(System.in);
          marks[0]=sc.nextInt();//phy
          marks[1]=sc.nextInt();// chem
          marks[2]=sc.nextInt();//math
          //output
          System.out.println("Phy"+marks[0]);
          System.out.println("chem"+marks[1]);
          System.out.println("Math"+marks[2]);




    }
}