class Base
{
    public int A,B;

    public Base()
    {
        System.out.println("Base Constructor");
    }

    public void fun()
    {
        System.out.println("Base fun");
    }
}

class Derived extends Base
{
    int X,Y;

    public Derived()
    {
        System.out.println("Derived Constructor");
    }

    public void gun()
    {
        System.out.println("Derived gun");
    }
}

class DerivedX extends Derived
{
    public int P,Q;

    public DerivedX()
    {
        System.out.println("DerivedX Constructor");
    }

    public void sun()
    {
        System.out.println("DerivedX sun");

    }
}

class MultiLevel
{
    public static void main(String args[])
    {
        System.out.println("Inside Main");

        DerivedX dobj = new DerivedX();

        dobj.fun();
        dobj.gun();
        dobj.sun();

    }
}