public class arrayfunction
{   public static void  updatevalue(int marks[],int update)
{      update=30;
    System.out.println("Funcation inner vlaue:"+update);
    for(int i=0;i<marks.length;i++)
    {
         marks[i]+=1;
       
    }
}
    public static void main(String args[])
    {
        int marks[]={97,98,99};
        int update= 4;
        updatevalue(marks,update);
        System.out.println("Update value:"+update);
        //  After update the value
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("after updation value:"+marks[i]);
        }
    }
}