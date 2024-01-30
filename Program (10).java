import java.util.*;

class ArrayDemo
{
    public void Display(int Brr[])
    {
        int iCnt = 0;

        System.out.println("Number divisible by 11 is : ");
       
        for(iCnt=0; iCnt < Brr.length; iCnt++)
        {
            if((Brr[iCnt] % 11) == 0)
            {
                System.out.print(Brr[iCnt]+"\t");
            }
        }
    }
}

class Ass33Q5
{
    public static void main(String args[])
    {
        int iSize = 0;
        int iCnt = 0;

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