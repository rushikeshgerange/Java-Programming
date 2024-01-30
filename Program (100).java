import java.util.*;
import Marvellous.Arithmatic;

class Program243
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0;
        int iAns = 0;

        System.out.println("Enter First Number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
        iNo2 = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iNo1,iNo2);

        iAns = aobj.Addition();
        System.out.println("Addition is : "+iAns);

        sobj.close();
    }
}
// javac -d . Arithmatic.java