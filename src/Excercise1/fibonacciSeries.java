package Excercise1;
import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        int first=0;
        if(n<3)
        {
            System.out.println("Enter a number greater than 2.");
        }
        else if(n>2)
        {
            int first=0;
            int second=1;
            System.out.print("0 "+"1 ");
            for(int i=1;i<n-1;i++)
            {
                int fib=first+second;
                System.out.print(fib+" ");
                first=second;
                second=fib;
            }
        }
    }
}
