package Recursion;
import java.util.Scanner;
public class sumNnaturalNumbers {

    public static void calculateSum(int x,int n,int sum)
    {
        if(x==n)
        {
            sum+=x;
            System.out.println(sum);
            return;
        }
      sum+=x;
      calculateSum(x+1,n,sum);

    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number greater than 1: ");
        int n=sc.nextInt();

        int sum=0;
        calculateSum(1,n,sum);
    }
}
