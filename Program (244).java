import java.util.*;

class AgeInvalid extends Exception
{
    public AgeInvalid(String str)
    {
        super(str);
    }
}
  
class UserDefined
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter Your Age : ");
        int iAge = sobj.nextInt();

        try
        {
            if(iAge < 18)
            {
                throw new AgeInvalid("Your age is below 18");
            }
            else
            {
                System.out.println("Login Successfully");
            }
        }

        catch (AgeInvalid obj)
        {
            System.out.println("Inside catch block");
            System.out.println(obj);
        }
    }
}