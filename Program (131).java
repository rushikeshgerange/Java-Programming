import java.util.*;
class Program275
{
    public static int OffBit(int iNo)
    {
        int iResult = 0;
        int iMask = 0x00000008;

        iResult = iNo & iMask;

        if(iResult == iMask)    // 4th bit is on
        {
            return(iNo ^ iMask);
        }
        else            // bit is off
        {
            return iNo;
        }

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