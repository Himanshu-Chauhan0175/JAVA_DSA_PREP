package Excercise1;
import java.util.Scanner;

public class sum1Ton {

    public static int sum(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(sum(n));
    }
}
