import java.util.*;

class StringDemo
{
    public String str;

    public StringDemo(String str1)
    {
        this.str = str1;
    }

    public boolean CheckVowels()
    {
        int iCnt = 0;
        boolean flag = false;

        char Arr[] = str.toCharArray();

        for(iCnt=0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] == 'a') || (Arr[iCnt] == 'e') || (Arr[iCnt] == 'i') || (Arr[iCnt] == 'o') || (Arr[iCnt] == 'u') || (Arr[iCnt] == 'A') || (Arr[iCnt] == 'E') || (Arr[iCnt] == 'I') || (Arr[iCnt] == 'O') || (Arr[iCnt] == 'U'))
            {
                flag = true;
            }
        }
        return flag;
    }
}

class Ass32Q4
{
    public static void main(String args[])
    {
        boolean bRet = false;
        String str = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        str = sobj.nextLine();

        StringDemo obj = new StringDemo(str);

        bRet = obj.CheckVowels();

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