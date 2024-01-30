import java.util.*;
import java.io.*;

class Program315
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

            if(bRet)
            {
                FileInputStream fiobj = new FileInputStream(FileName);

                byte Arr[] = new byte[100];

                fiobj.read(Arr);

                System.out.println(Arr);

                fiobj.close();
            }

        }
        catch(Exception obj)
        {
            System.out.println("Exception occured");
        }

        sobj.close();
    }
}