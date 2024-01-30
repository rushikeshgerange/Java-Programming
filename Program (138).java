import java.util.*;
class Program282
{
    public static boolean CheckBit(int iNo,int iPos)
    {
        int iResult = 0;
        int iMask = 0x00000001;
        
        iMask = iMask << (iPos-1);

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String args[])
    {
        int iNo = 0;
        int iPos = 0;
        boolean bRet = false;
        

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        System.out.println("Enter the position : ");
        iPos = sobj.nextInt();

        bRet = CheckBit(iNo,iPos);

        if(bRet == true)
        {
            System.out.println("Bit is on at the position : "+iPos);
        }
        else
        {
            System.out.println("Bit is off at the position : "+iPos);
        }

        sobj.close();
    }
}