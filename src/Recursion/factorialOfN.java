package Recursion;
import java.util.Scanner;

public class factorialOfN {
   public int factorial(int n){

       if(n==0 || n==1)
       {
           return 1;
       }

     int fact1=factorial(n-1);
     int fact=fact1*n;
     return fact;

    }

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        factorialOfN obj=new factorialOfN();
        System.out.println(obj.factorial(n));
    }
}
