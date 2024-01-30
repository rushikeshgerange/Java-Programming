import java.util.*;

class StringDemo
{
    public String str;

    public StringDemo(String str1)
    {
        this.str = str1;
    }

    public void ReverseString()
    {
        int iCnt = 0;
        String str2 = "";
        char ch = '\0';

        char Arr[] = str.toCharArray();

        for(iCnt=0; iCnt< Arr.length; iCnt++)
        {
            // ch = Arr[iCnt];
            str2 = Arr[iCnt]+str2;
        }
        System.out.println(str2);
    }   
    
}

class Ass32Q5
{
    public static void main(String arg[])
    {
        int iRet = 0;
        String str = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        str = sobj.nextLine();

        StringDemo obj = new StringDemo(str);

        obj.ReverseString();

    }
}