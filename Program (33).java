import java.io.*;

class Buffered1
{
    public static void main(String args[])
    {
        try
        {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter first number : ");
            int No1 = Integer.parseInt(br.readLine());

            System.out.println("Enter second number : ");
            int No2 = Integer.parseInt(br.readLine());

            int Ans = No1 + No2;

            System.out.println("Addition is : "+Ans);
        }
        catch(Exception obj)
        {
            
        }
    }
}