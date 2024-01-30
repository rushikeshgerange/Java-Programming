import java.util.*;
class Program247
{
    public static void EvenOddFactorial(int iNo)
    {
        int iCnt = 1;
        int iSumEven = 0;
        int iSumOdd = 0;
        
        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                if((iCnt % 2)== 0)
                {
                    iSumEven = iSumEven + iCnt;
                }
                else
                {
                    iSumOdd = iSumOdd + iCnt;
                }
            }
        }
        System.out.println("Addition of even factor is : "+iSumEven);
        System.out.println("Addition of odd factor is : "+iSumOdd);

    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iAns = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        EvenOddFactorial(iValue);

        sobj.close();
    }
}