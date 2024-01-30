import java.util.*;
import java.io.*;

class Program335
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String str = "Hello World";

        str = str.replaceAll("l","_");

        System.out.println("After replace string is : " +str);

        sobj.close();
    }
}