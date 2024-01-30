import java.util.*;
class Program279
{
    public static int OffBit(int iNo)
    {
        int iResult = 0;
        int iMask = 0x00004000;
        
        iResult = iNo ^ iMask;
        return iResult;

    }

    public static void main(String args[])
    {
        int iNo = 0;
        int iRet = 0;
        

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        iRet = OffBit(iNo);
        
        System.out.println("Updated number is : "+iRet);
    }
}