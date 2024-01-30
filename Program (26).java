abstract class Demo
{
    public int A;
    public int B;

    public Demo()
    {
        System.out.println("Inside Constructor");
        this.A = 0;
        this.B = 0;
    }

//  virtual void Fun()=0;
    abstract void fun();

    public void gun()
    {
        System.out.println("Inside gun");
    }

}

class AbstractDemo
{
    public static void main(String args[])
    {
        System.out.println("Inside main");

        Demo obj = new Demo();           //Error
    }
}