package Functions;
import java.util.Scanner;

public class factorialOfNumber {

    public static int factorial(int n)
    {
        int fact=1;
        if(n<0){
            System.out.println("Invalid Number!");
            return 0;
        }
        else if(n==0)
        {
            return 1;
        }
        else{
        for(int i=n;i>0;i--)
        {
            fact=fact*i;
        }

        return fact;
        }
    }

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(factorial(n));
    }
}
