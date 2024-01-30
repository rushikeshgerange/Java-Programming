import java.util.*;

class Program519
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        StringFBuffer sbobj = new StringBuffer(str);

        sbobj = sbobj.reverse();

        System.out.println("Updated string is : "+sbobj);

        sobj.close();
    }
}