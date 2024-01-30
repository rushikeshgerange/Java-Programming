
class ClassDemo
{
    public static void main(String args[])
    {
        System.out.println("Inside Demo");
    

    Marvellous mobj1 = new Marvellous();
    Marvellous mobj2 = new Marvellous(11,21);

    System.out.println(mobj2.i);
    System.out.println(mobj2.j);

    }
}

class Marvellous
{
    public int i;
    public int j;

    public Marvellous()
    {
        System.out.println("Inside default constructor.");
        this.i = 0;
        this.j = 0;
    }

    public Marvellous(int a , int b)
    {
        System.out.println("Inside parameterised constructor.");
        this.i = a;
        this.j = b;
    }

    public void fun()
    {
        System.out.println("Inside fun.");
    }

    
}
