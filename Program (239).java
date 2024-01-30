
import java.util.*;

class Program527
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s","");
        str = str.toLowerCase();

        char Arr[] = str.toCharArray();

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

        Set<Character> setobj = hobj.keySet();

        for(char ch1 : setobj)
        {
            System.out.println(ch1+" occurs "+hobj.get(ch1)+" times");
        }

        sobj.close();
    }
}