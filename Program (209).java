class node      // struct node
{
    public int data;
    public node next;       // struct node *next;

    public node(int no)
    {
        data = no;
        next = null;
    }
}

class SinglyLL
{
    private node first;
    private int Count;

    public SinglyLL()
    {
        first = null;
        Count = 0;
    }

    public void InsertFirst(int no)
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
        Count++;
    }

    public void InsertLast(int no)
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
        Count++;
    }

    public void DeleteFirst()
    {
        if(first == null)       // LL is empty
        {
            return;
        }
        else if(first.next == null)     // LL contains 1 node
        {
            first = null;
        }
        else        // LL contains more than one node
        {
            first = first.next;
        }
        Count--;
    }

    public void DeleteLast()
    {
        if(first == null)       // LL is empty
        {
            return;
        }
        else if(first.next == null)     // LL contains 1 node
        {
            first = null;
        }
        else        // LL contains more than one node
        {
            node temp = first;
            
            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
        }
        Count--;
    }

    public void Display()
    {
        node temp = first;

        System.out.println("Elements of the linked list are : ");

        while(temp != null)
        {
            System.out.print("| "+ temp.data + " |->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int Count()
    {
        return Count;
    }

    public void InsertAtPos(int no, int ipos)
    {
        if((ipos < 1) || (ipos >( Count+1)))
        {
            System.out.println("Invalid Position");
            return;
        }

        if(ipos == 1)
        {
            InsertFirst(no);
        }
        else if(ipos == Count + 1)
        {
            InsertLast(no);
        }
        else
        {
            node temp = first;
            node newn = new node(no);

            int i = 0;

            for(i = 1; i < ipos-1; i++)
            {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next = newn;

            Count++;
        }
    }

    public void DeleteAtPos(int ipos)
    {
        if((ipos < 0) || (ipos > Count))
        {
            System.out.println("Invalid Position");
            return;
        }

        if(ipos == 1)
        {
            DeleteFirst();
        }
        else if(ipos == Count)
        {
            DeleteLast();
        }
        else
        {

            Count--;
        }
    }
}

class Program413
{
    public static void main(String arg[])
    {
        int iRet = 0;

        SinglyLL obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();

        iRet = obj.Count();
        System.out.println("Number of elements are : "+iRet);
        System.out.println();

        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(121);

        obj.Display();

        iRet = obj.Count();
        System.out.println("Number of elements are : "+iRet);
        System.out.println();

        obj.InsertAtPos(105,5);

        obj.Display();

        iRet = obj.Count();
        System.out.println("Number of elements are : "+iRet);
        System.out.println();

        obj.DeleteFirst();
        obj.Display();

        iRet = obj.Count();
        System.out.println("Number of elements are : "+iRet);
        System.out.println();

        obj.DeleteLast();
        obj.Display();

        iRet = obj.Count();
        System.out.println("Number of elements are : "+iRet);
        System.out.println();

        

    }
}