import java.util.*;

class StringDemo
{
    public boolean StrCompare(String src, String dest, int iNo)
    {
        int iCnt = 0;
        String s1= "";
        String s2 = "";
        int iRet = 0;

        for(iCnt = 0; iCnt < iNo; iCnt++)
        {
           s1 = s1 + src.charAt(iCnt);
           s2 = s2 + dest.charAt(iCnt);
        }

        iRet = s1.compareTo(s2);         // return 0 if string is equal

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

class Ass36Q3
{
    public static void main(String args[])
    {
        String Str1 = null;
        String Str2 = null;
        boolean bRet = false;
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first string : ");
        Str1 = sobj.nextLine();

        System.out.println("Enter the second string : ");
        Str2 = sobj.nextLine();

        System.out.println("Enter the length of string that you want to compare : ");
        iValue = sobj.nextInt();

        try
        {

            StringDemo dobj = new StringDemo();
            bRet = dobj.StrCompare(Str1, Str2, iValue);
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