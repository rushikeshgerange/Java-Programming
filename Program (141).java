import java.util.*;
import java.io.*;

class Program309
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

            if(bRet == true)
            {
                System.out.println("File is present");
            }
            else
            {
                System.out.println("There is no such a file");
            }

        }
        catch(Exception obj)
        {
            System.out.println("Exception occured");
        }

        sobj.close();
    }
}