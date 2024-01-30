import java.util.*;
class Program260
{
    public static int CountCapital(String str)
    {
        int iCnt = 0;
        int iAns = 0;

        char Arr[] = str.toCharArray();

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                iAns++;
            }
        }
        return iAns;
    }
    public static void main(String arg[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter your name : ");
        str = sobj.nextLine();

        iRet = CountCapital(str);
        System.out.println("Capital letter is : "+iRet);
        
        sobj.close();
    }
}