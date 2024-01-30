import java.util.*;

class ArrayDemo
{
    public void Display(int Brr[])
    {
        int iCnt = 0;

        System.out.println("Number which are even and divisible by 5 is : ");
       
        for(iCnt=0; iCnt < Brr.length; iCnt++)
        {
            if(((Brr[iCnt] % 2) == 0) && ((Brr[iCnt] % 5)== 0))
            {
                System.out.print(Brr[iCnt]+"\t");
            }
        }
    }
}

class Ass33Q3
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

        aobj.Display(Arr);

        sobj.close();
    }
}