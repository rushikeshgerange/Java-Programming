import java.util.*;

class Matrix
{
    public int Summation(int Arr[][])
    {
        int i = 0, j = 0;
        int iSum = 0;

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                iSum = iSum + Arr[i][j];
            }
            System.out.println();
        }
        return iSum;
    }


    public void Display(int Arr[][])
    {
        int i = 0, j = 0;

        System.out.println("Elements of the matrics are : ");

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

class Program391
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0, iCol = 0, i = 0, j = 0;
        int iRet = 0;

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter the elements: ");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        Matrix mobj = new Matrix();
        mobj.Display(Arr);

        iRet = mobj.Summation(Arr);
        System.out.println("Addition of all elements is : "+iRet);

    }
}