import java.util.*;

class StringDemo
{
    public String ReverseString(String src)
    {
        int iCnt = 0;
        String s1 = "";
        char c = '\0';
;
        for(iCnt = 0; iCnt < src.length(); iCnt++)
        {
            c = src.charAt(iCnt);

            if((c >= 'A') && (c <= 'Z'))
            {
                c = Character.toLowerCase(c);
            }
            else
            {
                c = Character.toUpperCase(c);
            }
            s1 = c + s1;
        }
        return s1;
    }
}

class Ass36Q4
{
    public static void main(String args[])
    {
        String str = null;
        String sRet = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string :");
        str = sobj.nextLine();

        try
        {
            StringDemo dobj = new StringDemo();
            sRet = dobj.ReverseString(str);
        }
        catch(Exception obj)
        {

        }

        System.out.println("Reverse string is : "+ sRet);

    }
}