import java.util.*;

class StringDemo
{
    public String str;

    public StringDemo(String str1)
    {
        this.str = str1;
    }

    public int CountFrequency()
    {
        int iCnt = 0;
        int iSmall = 0;
        int iCapital = 0;
        int iAns = 0;

        char Arr[] = this.str.toCharArray();

        for(iCnt=0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iSmall++;
            }
            else if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                iCapital++;
            }
        }
        iAns = iSmall - iCapital;
        return iAns;
    }
}

class Ass32Q3
{
    public static void main(String arg[])
    {
        int iRet = 0;
        String str = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        str = sobj.nextLine();

        StringDemo obj = new StringDemo(str);

        iRet = obj.CountFrequency();
        System.out.println("Frequency is : "+iRet);

    }
}