import java.util.*;

class Number
{
    public int LastOccurance(int Brr[], int iNo)
    {
        int iCnt = 0;
        int iCnt1 = 0;
        int iPos = -1;

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            if(Brr[iCnt] == iNo)
            {
                iPos = iCnt;
            }
        }
        return iPos;
    }
}

class Ass35Q3
{
    public static void main(String args[])
    {
        int iSize = 0;
        int iValue = 0;
        int iCnt = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the number that you want to search it : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.LastOccurance(Arr,iValue);

        System.out.println("Index of last occurance number " + iValue + " is : " +iRet);
        
        sobj.close();
    }
}