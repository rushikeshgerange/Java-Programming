import java.util.*;
import java.io.*;

class Program318
{
    public static void main(String args[]) throws Exception
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

       System.out.println("Enter the name of Directory : ");
       String DirectoryName = sobj.nextLine();

       File fobj = new File(DirectoryName);

       bRet = fobj.isDirectory();

       if(bRet == true)
       {
            System.out.println("Directory is present");

            File Arr[] = fobj.listFiles();
            System.out.println("Number of files in the directory are : "+Arr.length);
       }
       else
       {
            System.out.println("There is no such a directory");
       }

       sobj.close();
    }
}