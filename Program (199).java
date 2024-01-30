import java.util.*;
import LB.Matrix;

class MyMatrix extends Matrix
{
    public MyMatrix(int A, int B)
    {
        super(A,B);
    }

    public int Frequency(int iNo)
    {
        int i = 0, j = 0, iCnt = 0;

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
               if(Arr[i][j] == iNo)
               {
                    iCnt++;
               }
            }
        }
        return iCnt;

    }
}

class Program403
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0, iCol = 0, iValue = 0;

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();    
        
        MyMatrix mobj = new MyMatrix(iRow,iCol);

        mobj.Accept();

        System.out.println("Enter the number that you want to search it : ");
        iValue = sobj.nextInt();
        
        mobj.Display();

        

        // Function Calls

        int iRet = mobj.Frequency(iValue);
        System.out.println("Frequency of number "+iValue+" is : "+iRet);

        sobj.close();
        mobj = null;
        System.gc();
    }
}