import java.util.*;

class Program510
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        char Arr[] = str.toCharArray();
        int i = 0;
        int spaceCnt = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i]) == ' ')
            {
                spaceCnt++;
            }
        }

        System.out.println("Number of words in the string are : "+(spaceCnt+1));

        sobj.close();
    }
}