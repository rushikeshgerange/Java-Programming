import java.util.*;
class Program281
{
    public static int OffBit(int iNo,int iPos)
    {
        int iResult = 0;
        int iMask = 0x00000001;
        
        iMask = iMask << (iPos-1);

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            return(iNo ^ iMask);
        }
        else
        {
            return iNo;
        }
    }

    public static void main(String args[])
    {
        int iNo = 0;
        int iPos = 0;
        int iRet = 0;
        

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        System.out.println("Enter the position : ");
        iPos = sobj.nextInt();

        iRet = OffBit(iNo,iPos);
        
        System.out.println("Updated number is : "+iRet);
    }
}