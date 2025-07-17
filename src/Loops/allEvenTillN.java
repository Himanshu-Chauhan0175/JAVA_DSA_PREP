package Loops;
import java.util.Scanner;

public class allEvenTillN {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n<1)
        {
            System.out.println("Enter a positive intiger!");
        }
        else {
            for(int i=1;i<=n;i++)
            {
                if(i%2==0)
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
}
