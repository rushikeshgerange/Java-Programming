import java.util.*;

class Program518
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        System.out.println("Enter the word that you want to search : ");
        String word = sobj.nextLine();

        word = word.trim();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        str = str.replaceAll(word,"");

        str = str.replaceAll("\\s+"," ");
        str = str.trim();

        System.out.println("Updated string is : "+str);

        sobj.close();
    }
}