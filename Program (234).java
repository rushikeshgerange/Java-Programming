
import java.util.*;

class Program522
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s","");
        str = str.toLowerCase();

        char Arr[] = str.toCharArray();

        int iFrequency[] = new int[26];
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iFrequency[((int)Arr[iCnt]) - 'a']++;   
        }

        System.out.println("Frequency of each letter is : ");

        for(iCnt = 0; iCnt < iFrequency.length; iCnt++)
        {
            System.out.println((char)(iCnt + 'a')+ " occurs "+ iFrequency[iCnt]+ " times");
        }

        sobj.close();
    }
}