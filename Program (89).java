class Arithmatic
{
    public int Addition(int A, int B)
    {   
        return A+B;
    }

    public int Addition(int A ,int B ,int C)
    {
        return A+B+C;
    }

    public double Addition(double A , double B)
    {
        return A+B;
    }

    public void Addition(int A , double D)
    {
        System.out.println("Inside First Addition ");
    }

    public void Addition(double D ,int A)
    {
        System.out.println("Inside Second Addition ");
    }
}

class OverloadingX
{
    public static void main(String args[])
    {
        Arithmatic aobj = new Arithmatic();

        int iRet = 0;
        double dRet = 0.0;

        iRet = aobj.Addition(10,11);
        System.out.println("Addition is :" +iRet);

        iRet = aobj.Addition(10,11,21);
        System.out.println("Addition is :" +iRet);

        dRet = aobj.Addition(10.8, 12.5);
        System.out.println("Addition is :" +dRet);

        aobj.Addition(10,12.5);
        aobj.Addition(12.5,20);
    }
}