import java.util.*;
import java.io.*;

class Program312
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
                System.out.println("Enter the that you want to write in the file : ");
                String Data = sobj.nextLine();

                FileOutputStream fwobj = new FileOutputStream(FileName);

                byte Arr[] = Data.getBytes();

                fwobj.write(Arr);
                fwobj.close();
            }

        }
        catch(Exception obj)
        {
            System.out.println("Exception occured");
        }

        sobj.close();
    }
}