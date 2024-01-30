import java.util.*;
import java.io.*;

class Program334
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String str = "     Hello  World  Demo     ";

        System.out.println("Length of str : " +str.length());

        str = str.trim();

        System.out.println("Length of string afer trim : " +str.length());

        sobj.close();
    }
}