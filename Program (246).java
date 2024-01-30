import java.io.*;

class WriteFile
{
    public static void main(String Arg[]) 
    {
        try
        {
            String Data = "Marvellous Infosystems";
            byte Arr[] = Data.getBytes();

            FileOutputStream  fobj = new FileOutputStream("PPA.txt");
            fobj.write(Arr);
        }
        catch(Exception obj)
        {
            
        }
    }
}