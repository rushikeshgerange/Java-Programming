import java.util.*;
import java.io.*;

class Program326
{
    public static void main(String args[]) throws Exception
    {
        boolean bRet = false;
        byte Buffer[] = new byte[1024];
        int iRet = 0;
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

            FileOutputStream fCombine = new FileOutputStream(PackedFile);
;
            // Travel Directory
            for(int i=0; i<Arr.length; i++)
            {
                Header = Arr[i].getName()+ " " + Arr[i].length();
                
                for(int j=Header.length(); j<100; j++)              // Creating header with size = 100
                {
                    Header = Header + " ";                          // Add extra white spaces
                }

                // Convert string header into byte array
                byte hArr[] = Header.getBytes();

                // Write header into packed file
                fCombine.write(hArr,0,100);

                FileInputStream fiobj = new FileInputStream(Arr[i]);

                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    fCombine.write(Buffer,0,iRet);
                }

                 fiobj.close();
 
            }
            fCombine.close();
       }
       else
       {
            System.out.println("There is no such a directory");
       }

       sobj.close();
    }
}