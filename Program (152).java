import java.util.*;
import java.io.*;

class Program320
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

            for(int i=0; i<Arr.length; i++)
            {
                System.out.println("File name : " +Arr[i].getName()+ "File size : " +Arr[i].length());
            }
       }
       else
       {
            System.out.println("There is no such a directory");
       }

       sobj.close();
    }
}