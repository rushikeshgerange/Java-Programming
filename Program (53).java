import java.util.*;

class ExceptionDemo1 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
        int iNo2 = sobj.nextInt();

        int iAns = 0;
        iAns = iNo1 / iNo2;

        System.out.println("Division is : "+ iAns);
    } 
}