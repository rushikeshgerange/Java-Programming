import java.util.*;



class Collection11
{
    public static void main(String args[])
    {
        LinkedList<Integer> lobj = new LinkedList<Integer>();

        lobj.add(10);
        lobj.add(20);
        lobj.add(30);
        lobj.add(40);

        System.out.println(lobj);

        lobj.addFirst(5);

        System.out.println(lobj);

        if(lobj.contains(30))
        {
            System.out.println("LL contain 30 in it ");
        }
        else
        {
            System.out.println("There is no 30 in it");
        }

        System.out.println("Index of 30 : "+lobj.indexOf(30));

        lobj.clear();

        System.out.println(lobj);

        Iterator iobj = lobj.iterator();

        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

    }
}