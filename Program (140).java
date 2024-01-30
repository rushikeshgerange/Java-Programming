import java.util.*;
import java.io.*;

class Program308
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

            bRet = fobj.createNewFile();

            if(bRet == true)
            {
                System.out.println("File gets successfully created");
            }
            else
            {
                System.out.println("Unable to create file");
            }

        }
        catch(IOException obj)
        {
            System.out.println("Exception occured");
        }

        catch(Exception obj)
        {
            System.out.println("Exception occured");
        }

        sobj.close();
    }
}