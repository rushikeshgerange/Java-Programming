class CommandLine1
{
    public static void main(String arg[])
    {
        System.out.println("Number of command line arguments are : " +arg.length);

        int No1 = Integer.parseInt(arg[0]);
        int No2 = Integer.parseInt(arg[1]);

        int Ans = No1 + No2;

        System.out.println("Addition is : "+Ans);
    }
}