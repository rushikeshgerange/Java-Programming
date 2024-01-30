import java.util.*;
import java.io.*;

class Program337
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String str = "    Hello     World    Demo     ";

        str = str.replaceAll(" ","");

        System.out.println("After replace string is : " +str);

        sobj.close();
    }
}