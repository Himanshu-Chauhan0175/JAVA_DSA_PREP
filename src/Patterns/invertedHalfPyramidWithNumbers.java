package Patterns;
import java.util.Scanner;

public class invertedHalfPyramidWithNumbers {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
