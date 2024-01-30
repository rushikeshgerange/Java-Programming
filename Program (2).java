import java.util.*;

class StringDemo
{
    public String str;

    public StringDemo(String str1)
    {
        this.str = str1;
    }

    public int CountSmall()
    {
        int iCnt = 0;
        int iAns = 0;

        char Arr[] = this.str.toCharArray();

        for(iCnt=0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iAns++;
            }
        }
        return iAns;
    }
}

class Ass32Q2
{
    public static void main(String arg[])
    {
        int iRet = 0;
        String str = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        str = sobj.nextLine();

        StringDemo obj = new StringDemo(str);

        iRet = obj.CountSmall();
        System.out.println("Count of small letter is : "+iRet);

    }
}