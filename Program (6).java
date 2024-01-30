import java.util.*;

class ArrayDemo
{
    public int ArrayDifference(int Brr[])
    {
        int iCnt = 0;
        int iEven = 0;
        int iOdd = 0;
        int iAns = 0;

        for(iCnt=0; iCnt < Brr.length; iCnt++)
        {
            if((Brr[iCnt] % 2) == 0)
            {
                iEven = iEven + Brr[iCnt];
            }
            else if((Brr[iCnt] % 2) != 0)
            {
                iOdd = iOdd + Brr[iCnt];
            }
        }
        iAns = iEven - iOdd;
        return iAns;
    }
}

class Ass33Q1
{
    public static void main(String args[])
    {
        int iSize = 0;
        int iCnt = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements of the array : ");

        for(iCnt=0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayDemo aobj = new ArrayDemo();

        iRet = aobj.ArrayDifference(Arr);

        System.out.println("Difference is : "+iRet);

        sobj.close();
    }
}