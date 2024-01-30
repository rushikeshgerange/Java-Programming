import java.util.*;

class Matrix
{
    protected int Arr[][];

    public Matrix(int A, int B)
    {
        Arr = new int[A][B];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0, j = 0;

        System.out.println("Enter the elements : ");

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
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

    protected void finalize()
    {
        Arr = null;
    }

}

class MyMatrix extends Matrix
{
    public MyMatrix(int A, int B)
    {
        super(A,B);
    }

    public int Summation()
    {
        int i = 0, j = 0, iSum = 0;

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr.length; j++)
            {
                iSum = iSum + Arr[i][j];
            }
        }
        return iSum;
    }

    public int Maximum()
    {
        int i = 0, j = 0;
        int iMax = Arr[0][0];

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr.length; j++)
            {
                if((Arr[i][j] > iMax))
                {
                    iMax = Arr[i][j];
                }
            }
        }
        return iMax;
    }

    public int Minimum()
    {
        int i = 0, j = 0;
        int iMin = Arr[0][0];

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr.length; j++)
            {
                if((Arr[i][j] < iMin))
                {
                    iMin = Arr[i][j];
                }
            }
        }
        return iMin;
    }
}

class Program396
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0, iCol = 0;
        int iRet = 0;

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();

        MyMatrix mobj = new MyMatrix(iRow,iCol);
        mobj.Accept();
        mobj.Display();
        
        iRet = mobj.Summation();
        System.out.println("Addition of all elements is : "+iRet);

        int iMax = mobj.Maximum();
        System.out.println("Maximum number is : "+iMax);

        int iMin = mobj.Minimum();
        System.out.println("Minimum number is : "+iMin);

        sobj.close();
        mobj = null;
        System.gc();
    }
}