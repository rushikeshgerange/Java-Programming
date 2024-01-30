// Queue

class node
{
    public int data;
    public node next;

    public node(int no)
    {
        data = no;
        next = null;
    }
}

class Queue
{
    public node first;

    public Queue()
    {
        first = null;
    }

    public void Enqueue(int no)
    {
        node newn = new node(no);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            node temp = first;

            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
    }

    public int Dequeue()
    {
        int iValue = 0;

        if(first == null)
        {
            System.out.println("Queue is empty...");
        }
        else
        {
            iValue = first.data;
            first = first.next;
        }
        return iValue;
    }

    public void Display()
    {
        System.out.println("Elements of the queue is : ");

        node temp = first;

        while(temp != null)
        {
            System.out.println("| "+temp.data+" |");
            temp = temp.next;
        }
        System.out.println("| null |");
    }
}

class Program419
{
    public static void main(String args[])
    {
        int iRet = 0;

        Queue obj = new Queue();

        obj.Enqueue(11);
        obj.Enqueue(21);
        obj.Enqueue(51);
        obj.Display();

        iRet = obj.Dequeue();
        System.out.println("Dequeue element is : "+iRet);
        obj.Display();
        System.out.println();

        iRet = obj.Dequeue();
        System.out.println("Dequeue element is : "+iRet);
        obj.Display();
        System.out.println();


        iRet = obj.Dequeue();
        System.out.println("Dequeue element is : "+iRet);
        obj.Display();
        System.out.println();

        iRet = obj.Dequeue();
        System.out.println("Dequeue element is : "+iRet);
        obj.Display();
        System.out.println();

    }
}