import java.util.*;

class Number
{
    public void Display(int Brr[], int iStart, int iEnd)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            if((Brr[iCnt] >= iStart) && (Brr[iCnt]) <= iEnd)
            {
                System.out.print(Brr[iCnt]+ "\t");
            }
        }
    }
}

class Ass35Q4
{
    public static void main(String args[])
    {
        int iSize = 0;
        int iNo1 = 0;
        int iNo2 = 0;
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

        System.out.println("Enter the starting point ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the ending point");
        iNo2 = sobj.nextInt();

        Number nobj = new Number();
        nobj.Display(Arr, iNo1, iNo2);

    }
}