import java.util.*;
class Program245
{
    public static int Factorial(int iNo)
    {
        int iCnt = 1;
        int iFact = 1;
        
        while(iCnt <= iNo)
        {
            iFact = iFact * iCnt;
            iCnt++;
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