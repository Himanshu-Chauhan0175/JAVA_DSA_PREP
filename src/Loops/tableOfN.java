package Loops;
import java.util.Scanner;

public class tableOfN {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(i*n);
        }
    }
}
