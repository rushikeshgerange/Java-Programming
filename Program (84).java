class Demo extends Thread
{
    public void run()      //Running State
    {
        
    }

    synchronized public void Display()
    {

    }
}

class Multi7
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("Current thread is : "+ Thread.currentThread().getName());

        Demo obj1 = new Demo();     // New State 
        Demo obj2 = new Demo();     // New State 

        obj1.setName("First");

        obj1.setPriority(2);
        obj2.setPriority(10);

        obj1.start();           // Runnable State
        obj2.start();           // Runnable State
        obj1.join();
        obj2.join();

        System.out.println("Priority of thread is "+obj1.getPriority());
        System.out.println("Priority of thread is "+obj2.getPriority());

        System.out.println("End of main thread.");
    }
}