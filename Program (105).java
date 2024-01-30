import java.util.*;
class Program248
{
    public static void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt=1; iCnt<=5; iCnt++)
        {
            System.out.print(iCnt+"\t"+"*\t");
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iAns = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Display(iValue);

        sobj.close();
    }
}