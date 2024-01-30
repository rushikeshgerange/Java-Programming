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

class Single
{
    public static void main(String args[])
    {
        System.out.println("Inside Main");

        Derived dobj = new Derived();

        dobj.fun();
        dobj.gun();

    }
}
