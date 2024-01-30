// Doubly Circular Linked List

class node
{
    public int data;
    public node next;
    public node prev;

    public node(int no)
    {
        data = no;
        next = null;
        prev = null;
    }
}

class DoublyCL
{
    node first;
    node last;
    int Count;

    public DoublyCL()
    {
        first = null;
        last = null;
        Count = 0;
    }

    public void InsertFirst(int no)
    {
        node newn = new node(no);

        if((first == null) || (last == null))
        {
            first = newn;
            last = newn;
        }
        else
        {
            newn.next = first;
            first = newn;
        }
        last.next = first;
        first.prev = last;
        Count++;
    }

    public void InsertLast(int no)
    {
        node newn = new node(no);

        if((first == null) || (last == null))
        {
            first = newn;
            last = newn;
        }
        else
        {
            last.next = newn;
            newn.prev = last;
            last = last.next;
        }
        last.next = first;
        first.prev = last;
        Count++;
    }

    public void DeleteFirst()
    {
        if((first == null) && (last == null))
        {
            return;
        }
        else if(first == last)
        {
            first = null;
            last = null;
        }
        else 
        {
            first = first.next;
            last.next = first;
            first.prev = last;
        }
        Count--;
    }

    public void DeleteLast()
    {
        if((first == null) && (last == null))
        {
            return;
        }
        else if(first == last)
        {
            first = null;
            last = null;
        }
        else 
        {
            last = last.prev;
            last.next = first;
            first.prev = last;
        }
        Count--;
    }

    public void Display()
    {
        System.out.println("Elements of the linked list are : ");

        if((first != null) && (last != null))
        {
            do
            {
                System.out.print("| "+first.data+" |<=>");
                first = first.next;
            }
            while(first != last.next);
            System.out.println();
        }
    }

    public int Count()
    {
        return Count;
    }

    public void InsertAtPos(int no, int iPos)
    {
        if((iPos < 1) || (iPos > Count +1))
        {
            System.out.println("Invalid Position");
            return;
        }

        if(iPos == 1)
        {
            InsertFirst(no);
        }
        else if(iPos == Count + 1)
        {
            InsertLast(no);
        }
        else
        {
            node newn = new node(no);
            node temp = first;
            int i = 0;

            for(i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next.prev = newn;
            newn.prev = temp;
            temp.next = newn;
            Count++;
        }
    }

    public void DeleteAtPos(int iPos)
    {
        if((iPos < 1) || (iPos > Count +1))
        {
            System.out.println("Invalid Position");
            return;
        }

        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == Count + 1)
        {
            DeleteLast();
        }
        else
        {
            node temp = first;
            int i = 0;

            for(i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            Count--;
        }
    }

}

class Program417
{
    public static void main(String args[])
    {
        int iRet = 0;
        DoublyCL obj = new DoublyCL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements in the linked list are : "+iRet);
        System.out.println();

        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(121);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements in the linked list are : "+iRet);
        System.out.println();

        obj.InsertAtPos(105,5);
        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements in the linked list are : "+iRet);
        System.out.println();

        obj.DeleteAtPos(5);
        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements in the linked list are : "+iRet);
        System.out.println();

        obj.DeleteFirst();
        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements in the linked list are : "+iRet);
        System.out.println();

        obj.DeleteLast();
        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements in the linked list are : "+iRet);
        System.out.println();



    }
}