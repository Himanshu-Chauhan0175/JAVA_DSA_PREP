package Recursion;
import java.util.Scanner;

public class xToThePowerN_logN {

    public static int powerFn(int x, int n)
    {
        if(x==0)
        {
            return 0;
        }
        if (n==0)
        {
            return 1;
        }

        // if n is even
        if(n%2==0)
        {
            return powerFn(x,n/2)*powerFn(x,n/2);
        }
        else // if n is odd
        {
            return powerFn(x,n/2)*powerFn(x,n/2)*x;
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();

        System.out.println(powerFn(x,n));
    }
}
