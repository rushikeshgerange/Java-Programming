import java.util.*;
class Program271
{
    public static boolean checkBit(int iNo)
    {
        int iResult = 0;
        int iMask = 0x00000100;

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
        boolean bRet = false;
        

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        bRet = checkBit(iNo);

        if(bRet == true)
        {
            System.out.println("9th bit is ON");
        }
        else
        {
            System.out.println("9th bit is OFF");
        }   
    }
}