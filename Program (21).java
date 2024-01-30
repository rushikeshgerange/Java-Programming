import java.util.*;

class StringDemo
{
    public String StrConcat(String src, String dest, int iNo)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < iNo; iCnt++)
        {
            src = src + dest.charAt(iCnt);
        }

        return src;
        
    }
}

class Ass36Q1
{
    public static void main(String args[])
    {
        String Str1 = null;
        String Str2 = null;
        int iValue = 0;
        String sRet = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first string : ");
        Str1 = sobj.nextLine();

        System.out.println("Enter the second string : ");
        Str2 = sobj.nextLine();

        System.out.println("Enter the length that you want to concate the string : ");
        iValue = sobj.nextInt();

        StringDemo dobj = new StringDemo();
        sRet = dobj.StrConcat(Str1, Str2, iValue);

        System.out.println("After the concatenation string is : " +sRet);

    }
}