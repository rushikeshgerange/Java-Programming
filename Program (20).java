import java.util.*;

class Number
{
    public int Product(int Brr[])
    {
        int iCnt = 0;
        int iAns = 1;

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            if((Brr[iCnt] % 2) != 0)
            {
                iAns = iAns * Brr[iCnt];
            }
        }
        if(iAns == 1)
        {
            return 0;
        }
        else
        {
            return iAns;
        }
    }
}

class Ass35Q5
{
    public static void main(String args[])
    {
        int iSize = 0;
        int iRet = 0;
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        Number nobj = new Number();
        iRet = nobj.Product(Arr);

        System.out.println("Product of odd element is : "+ iRet);

    }
}