import java.util.*;
class Program263
{
    public static void main(String args[])
    {
        int iNo = 0;
        int iCnt = 0;
        int iDigit = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        while(iNo != 0)
        {
            iDigit = iNo % 2;
            if(iDigit == 1)
            {
                iCnt++;
            }
            iNo = iNo / 2;
        }
        System.out.println("Number of 1 bit are : "+iCnt);
    }
}