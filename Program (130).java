import java.util.*;
class Program274
{
    public static boolean checkBit(int iNo)
    {
        int iResult = 0;
        int iMask = 0x00000a00;

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
            System.out.println("10th and 12th bit is ON");
        }
        else
        {
            System.out.println("Bit is OFF");
        }   
    }
}