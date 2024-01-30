import java.util.*;

class Number
{
    public boolean CheckNumber(int Brr[], int iNo)
    {
        boolean flag = false;
        int iCnt = 0;

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            if(Brr[iCnt] == iNo)
            {
                flag = true;
            }
        }
        return flag;
    }
}

class Ass35Q1
{
    public static void main(String args[])
    {
        int iSize = 0;
        int iValue = 0;
        int iCnt = 0;
        boolean bRet = false;

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

        bRet = nobj.CheckNumber(Arr,iValue);

        if(bRet == true)
        {
            System.out.println("Number is present. ");
        }
        else
        {
            System.out.println("Numebr is absent. ");
        }
        
        sobj.close();
    }
}