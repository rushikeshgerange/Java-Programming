import java.util.*;
import java.io.*;

class Program310
{
    public static void main(String args[]) throws Exception
    {
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        String FileName = sobj.nextLine();

        try
        {

            File fobj = new File(FileName);

            bRet = fobj.exists();

            if(bRet)            //if(bRet == true)
            {
                System.out.println("Name of file is : " + fobj.getName());
                System.out.println("Absolute path of file is : " + fobj.getAbsolutePath());
                System.out.println("Size of file is : " + fobj.length());
                System.out.println("We can read from file : " + fobj.canRead());
                System.out.println("We can write into file : " + fobj.canWrite());
            }

        }
        catch(Exception obj)
        {
            System.out.println("Exception occured");
        }

        sobj.close();
    }
}