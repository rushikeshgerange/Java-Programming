import java.util.*;
class Program270
{
    public static void main(String args[])
    {
        int iNo = 0;
        int iResult = 0;
        int iMask = 0x00000004;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();
        
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("3 rd bit is on");
        }
        else
        {
            System.out.println("3 rd bit is off");
        }
    }
}