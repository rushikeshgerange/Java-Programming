import java.util.*;
class Program246
{
    public static void EvenOddFactorial(int iNo)
    {
        int iCnt = 0;
        int iFact = 1;
        
        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                if((iCnt % 2)== 0)
                {
                    System.out.println("Even factor is : "+iCnt);
                }
                else
                {
                    System.out.println("Odd factor is : "+iCnt);
                }
            }
        }
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