import java.util.*;
import java.io.*;

class Program344
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

        String words[] = str.split(" ");

        System.out.println("Number of wrods in the sentence are : "+words.length);

        for(String s : words)    // foreach loop
        {
            System.out.println(s);
        }

        sobj.close();
    }
}