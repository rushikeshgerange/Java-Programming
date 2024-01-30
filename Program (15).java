import java.util.*;

class Digit
{
    public int iNo;
    public int iResult;
    public int iDigit;

    public Digit(int A)
    {
        this.iNo = A;
        this.iResult = 0;
        this.iDigit = 0;
    }

    public int CountDifference()
    {
        int iEven = 0;
        int iOdd = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;

            if((iDigit % 2) == 0)
            {
                iEven = iEven + iDigit;
            }
            else if((iDigit % 2) != 0)
            {
                iOdd = iOdd + iDigit;
            }
            iResult = iEven - iOdd;
        }
        return iResult;
    }
};

class Ass34Q5
{
    public static void main(String args[])
    {
        int iValue = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Digit dobj = new Digit(iValue);

        iRet = dobj.CountDifference();
        System.out.println("Difference between even and odd digits is : "+iRet);

        sobj.close();
    }
}