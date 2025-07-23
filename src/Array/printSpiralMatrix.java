package Array;
import java.util.Scanner;

public class printSpiralMatrix {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();

        int arr[][]=new int[row][col];
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

        System.out.println();

        int rowStart=0;
        int rowEnd=row-1;
        int colStart=0;
        int colEnd=col-1;

        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int i=colStart;i<=colEnd;i++)
            {
                System.out.print(arr[rowStart][i]+" ");
            }
            rowStart++;

            for(int i=rowStart;i<=rowEnd;i++)
            {
                System.out.print(arr[i][colEnd]+" ");
            }
            colEnd--;

            if(rowStart<=rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    System.out.print(arr[rowEnd][i] + " ");
                }
                rowEnd--;
            }

            if(colStart<=colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(arr[i][colStart] + " ");
                }
                colStart++;
            }

        }
    }
}
