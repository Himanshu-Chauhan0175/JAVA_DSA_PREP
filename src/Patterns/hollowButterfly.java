package Patterns;
import java.util.Scanner;

public class hollowButterfly {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=0;j<n-1-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n-1-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(j==0 || j==n-1-i)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++)
            {
                if(j==0 || j==n-1-i) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
