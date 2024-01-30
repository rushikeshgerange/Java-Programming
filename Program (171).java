import java.util.*;
import java.io.*;

class Program341
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        str = str.trim();

        System.out.println("After trim string is : " +str);

        str = str.replaceAll("\\s+"," ");

        System.out.println("After replace the string is : " +str);

        sobj.close();
    }
}