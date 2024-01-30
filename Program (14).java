import java.util.*;

class Digit
{
    public int iNo;
    public int iDigit;
    public int iAns;

    public Digit(int A)
    {
        this.iNo = A;
        this.iDigit = 0;
        this.iAns = 1;
    }

    public int Multiply()
    {
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 0)
            {
                iDigit = 1;
            }
            iAns = iAns * iDigit;
            iNo = iNo / 10;
        }
        return iAns;
    }
};

class Ass34Q4
{
    public static void main(String args[])
    {
        int iValue = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Digit dobj = new Digit(iValue);

        iRet = dobj.Multiply();
        System.out.println("Multiplication of digits is : "+iRet);

        sobj.close();
    }
}