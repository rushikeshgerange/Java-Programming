import java.util.*;

class StringDemo
{
    public String str;

    public StringDemo(String str1)
    {
        this.str = str1;
    }

    public int CountCapital()
    {
        int iCnt = 0;
        int iAns = 0;

        char Arr[] = this.str.toCharArray();

        for(iCnt=0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                iAns++;
            }
        }
        return iAns;
    }
}

class Ass32Q1
{
    public static void main(String arg[])
    {
        int iRet = 0;
        String str = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        str = sobj.nextLine();

        StringDemo obj = new StringDemo(str);

        iRet = obj.CountCapital();
        System.out.println("Count of capital letter is : "+iRet);

    }
}