// Stack

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

class Stack
{
    public node first;

    public Stack()
    {
        first = null;
    }

    public void Push(int no)
    {
        node newn = new node(no);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first = newn;
        }
    }

    public int Pop()
    {
        int iValue = 0;

        if(first == null)  
        {
            System.out.println("Stack is empty...");
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
        System.out.println("Elements of the stack are : ");
        node temp = first;

        while(temp != null)
        {
            System.out.println("| "+temp.data+" |");
            temp = temp.next;
        }
        System.out.println("| null | ");
    }
}


class Program418
{
    public static void main(String args[])
    {
        int iRet = 0;

        Stack obj = new Stack();

        obj.Push(51);
        obj.Push(21);
        obj.Push(11);

        obj.Display();

        iRet = obj.Pop();
        System.out.println("Pop element is : "+iRet);
        System.out.println();
        obj.Display();
        System.out.println();

        iRet = obj.Pop();
        System.out.println("Pop element is : "+iRet);
        System.out.println();
        obj.Display();
        System.out.println();

        iRet = obj.Pop();
        System.out.println("Pop element is : "+iRet);
        System.out.println();
        obj.Display();
        System.out.println();

        iRet = obj.Pop();
        System.out.println("Pop element is : "+iRet);
        System.out.println();
        obj.Display();
        System.out.println();

    }
}