import java.util.*;

class Digit
{
    public int iNo;
    public int iCnt;
    public int iDigit;

    public Digit(int A)
    {
        this.iNo = A;
        this.iCnt = 0;
        this.iDigit = 0;
    }

    public int CountRange()
    {
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit > 3) && (iDigit < 7))
            {
                iCnt++;
            }
            iNo = iNo / 10;
        }
        return iCnt;
    }
};

class Ass34Q3
{
    public static void main(String args[])
    {
        int iValue = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Digit dobj = new Digit(iValue);

        iRet = dobj.CountRange();
        System.out.println("Digits in between 3 and 7 is : "+iRet);

        sobj.close();
    }
}