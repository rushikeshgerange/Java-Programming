import java.util.*;
class Program278
{
    public static int ToggleBit(int iNo)
    {
        int iResult = 0;
        int iMask = 0x00000040;
        
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

        iRet = ToggleBit(iNo);
        
        System.out.println("Updated number is : "+iRet);
    }
}