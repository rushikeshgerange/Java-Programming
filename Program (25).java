import java.util.*;

class StringDemo
{
    public boolean CheckPalindrome(String src)
    {
        int iCnt = 0;
        String nstr = "";
        int iRet = 0;
;
        for(iCnt = 0; iCnt < src.length(); iCnt++)
        {
            nstr = src.charAt(iCnt) + nstr;
        }

        iRet = src.compareToIgnoreCase(nstr);

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
class Ass36Q5
{
    public static void main(String args[])
    {
        String str = null;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string :");
        str = sobj.nextLine();

        try
        {
            StringDemo dobj = new StringDemo();
            bRet = dobj.CheckPalindrome(str);
        }
        catch(Exception obj)
        {

        }

        if(bRet == true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }

    }
}