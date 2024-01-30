import java.util.*;
import java.io.*;

class Program354
{
    public static void main(String args[]) throws Exception
    {
        byte Header[] = new byte[100];
        int FileSize = 0;
        String str = null;
        String Hstr = null;
        int iRet = 0;
        int iCnt = 0;

        System.out.println("-------------------------------------------------------------------");
        System.out.println("-------------------Marvellous Packer Unpacker-----------------------");
        System.out.println("-------------------------------------------------------------------");

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of packed file that you want to unpacked ");
        String PackedFile = sobj.nextLine();    

        File fobj = new File(PackedFile);
        FileInputStream fiobj = new FileInputStream(fobj);


        while((iRet = fiobj.read(Header,0,100)) > 0)
        {

            Hstr = new String(Header);

            str = Hstr.trim();

            String Tokens[] = str.split(" ");

            File NewFile = new File(Tokens[0]);
            NewFile.createNewFile();  
            
            FileSize = Integer.parseInt(Tokens[1]);

            byte Buffer[] = new byte[FileSize];

            fiobj.read(Buffer,0,FileSize);

            FileOutputStream foobj = new FileOutputStream(NewFile);
            foobj.write(Buffer,0,FileSize);
            iCnt++;

            foobj.close();
        }

        System.out.println("Unpacking activity is completed");
        System.out.println("Total files unpacked successfully : " +iCnt); 

        System.out.println("-------------------------------------------------------------------");
        System.out.println("------------Thank You For Using Marvellous Packer Unpacker-----------");
        System.out.println("-------------------------------------------------------------------");

        fiobj.close();
        sobj.close();
    }
}