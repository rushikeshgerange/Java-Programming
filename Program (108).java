import java.util.*;
class Program251
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;
        int iCnt = 0;

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");

        for(iCnt=0; iCnt<iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of the array : ");

        for(iCnt=0; iCnt<iSize; iCnt++)
        {
            System.out.print(Arr[iCnt]+"\t");
        }

        sobj.close();
    }
}