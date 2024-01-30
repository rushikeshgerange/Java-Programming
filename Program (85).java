class Demo extends Thread
{
    public void run()
    {
        String name = Thread.currentThread().getName();

        for(int i=1; i<=100; i++)
        {
            System.out.println("Name of thread is " +name+ " with counter : "+i);
        }
    }
}

class Multi10
{
    public static void main(String args[])
    {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        Demo obj3 = new Demo();

        obj1.setName("First");
        obj2.setName("Second");
        obj3.setName("Third");

        obj1.start();
        obj2.start();
        obj3.start();
    }
}