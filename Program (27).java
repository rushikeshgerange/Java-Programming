abstract class Demo
{
    public int A;
    public int B;

    public Demo()
    {
        System.out.println("Inside Demo Constructor");
        this.A = 0;
        this.B = 0;
    }

//  virtual void Fun()=0;
    abstract void fun();

    public void gun()
    {
        System.out.println("Inside Demo gun");
    }

}

class Hello extends Demo
{
    public Hello()
    {
        System.out.println("Inside Hello constructor");
    }

    public void fun()
    {
        System.out.println("Inside Hello fun");
    }
}

class AbstractDemo1
{
    public static void main(String args[])
    {
        System.out.println("Inside main");

       // Demo obj = new Demo();
       Hello hobj = new Hello();
       hobj.fun();
       hobj.gun();
    }
}