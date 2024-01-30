
import java.util.*;

class Program525
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s","");
        str = str.toLowerCase();

        char Arr[] = str.toCharArray();

        int iCnt = 0;
        int iFrequency = 0;

        HashMap <Character, Integer> hobj = new HashMap<>();

        for(char ch : Arr)
        {
            if(hobj.containsKey(ch))
            {
                iFrequency = hobj.get(ch);
                hobj.put(ch, iFrequency+1);
            }
            else
            {
                hobj.put(ch,1);
            }
        }

        System.out.println(hobj);

        sobj.close();
    }
}