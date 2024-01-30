import java.util.*;
class Program244
{
    public static int Factorial(int iNo)
    {
        int iCnt = 0;
        int iFact = 1;
        
        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            iFact = iFact * iCnt;
        }
        return iFact;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iAns = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        iAns = Factorial(iValue);

        System.out.println("Factoruial is : "+iAns);

        sobj.close();
    }
}