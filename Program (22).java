import java.util.*;

class StringDemo
{
    public boolean StrCompare(String src, String dest)
    {
        int iRet = 0;
        

        if((src.length() != dest.length()))
        {
            return false;
        }

        iRet = src.compareTo(dest);

        if(iRet == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Ass36Q2
{
    public static void main(String args[])
    {
        String Str1 = null;
        String Str2 = null;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first string : ");
        Str1 = sobj.nextLine();

        System.out.println("Enter the second string : ");
        Str2 = sobj.nextLine();

        try
        {

            StringDemo dobj = new StringDemo();
            bRet = dobj.StrCompare(Str1, Str2);
        }
        catch(Exception obj)
        {

        }

        if(bRet == true)
        {
            System.out.println("Both string are same");
        }
        else
        {
            System.out.println("Both string are not same");
        }

    }
}