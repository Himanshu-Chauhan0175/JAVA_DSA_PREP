package Array;
import java.util.Scanner;

public class searchIn2DArray {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();

        int [][]arr=new int[row][col];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter element to serach: ");
        int element=sc.nextInt();

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(arr[i][j]==element)
                {
                    System.out.print("("+i+","+j+")"+" ");
                }
            }
        }
    }
}
