import java.util.*;
class Program261
{
    public static void main(String args[])
    {
        int iNo = 0;
        int iDigit = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        while(iNo != 0)
        {
            iDigit = iNo % 2;
            iNo = iNo / 2;
            System.out.print(iDigit);
        }
        System.out.println();
    }
}