import Marvellous.Maths;
import Marvellous.Infosystem.Arithmatic;

class PackageDemo
{
    public static void main(String args[])
    {
        Maths mobj = new Maths();
        int iRet = mobj.Addition(10,11);
        System.out.println("Addition is : "+ iRet);

        Arithmatic aobj = new Arithmatic();
        int fRet = aobj.Substraction(51,30);
        System.out.println("Substraction is : "+ fRet);
    }
}