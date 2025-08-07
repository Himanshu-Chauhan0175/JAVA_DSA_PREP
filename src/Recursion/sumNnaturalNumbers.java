package Recursion;
import java.util.Scanner;
public class sumNnaturalNumbers {

    public static void calculateSum(int x,int n,int sum)
    {
        if(n==x)
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
        int n=sc.nextInt();
        int sum=0;

        calculateSum(0,n,sum);
    }
}
