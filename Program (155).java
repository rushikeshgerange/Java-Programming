import java.util.*;
import java.io.*;

class Program323
{
    public static void main(String args[]) throws Exception
    {
        boolean bRet = false;
     //    byte Buffer[] = new byte[1024];
     //    int iRet = 0;
        Scanner sobj = new Scanner(System.in);

       System.out.println("Enter the name of Directory : ");
       String DirectoryName = sobj.nextLine();

       System.out.println("Enter the name of packed file that you want to create");
       String PackedFile = sobj.nextLine();

       File fobjPack = new File(PackedFile);
       bRet = fobjPack.createNewFile();

       if(bRet == false)
       {
            System.out.println("Unable to packed file...");
            System.exit(0);
       }

       File fobj = new File(DirectoryName);     // Creating the directory
       bRet = fobj.isDirectory();

       if(bRet == true)
       {
            System.out.println("Directory is present");

            File Arr[] = fobj.listFiles();
            System.out.println("Number of files in the directory are : "+Arr.length);

            String Header = null;

            for(int i=0; i<Arr.length; i++)
            {
                Header = Arr[i].getName()+ " " + Arr[i].length();
                System.out.println(Header);
            }
       }
       else
       {
            System.out.println("There is no such a directory");
       }

       sobj.close();
    }
}