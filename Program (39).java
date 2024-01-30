import java.util.*;

class Collection13
{
    public static void main(String args[])
    {
        Hashtable <String, Integer> hobj = new Hashtable<>();

        hobj.put("PPA", 185000);
        hobj.put("LB",19700);
        hobj.put("Angular", 20500);
        hobj.put("Python", 17500);


        System.out.println(hobj.get("LB"));

        Enumeration eobj = hobj.keys();
        while(eobj.hasMoreElements())
        {
            System.out.println(eobj.nextElement());
        }

    }
}