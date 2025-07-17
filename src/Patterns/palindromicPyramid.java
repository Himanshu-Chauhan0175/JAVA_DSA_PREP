package Patterns;
import java.util.Scanner;

public class palindromicPyramid {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            for(int j=0;j<num-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=i;j>0;j--)
            {
                System.out.print(j+" ");
            }
            if(i>1)
            {
                for(int j=2;j<=i;j++)
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
