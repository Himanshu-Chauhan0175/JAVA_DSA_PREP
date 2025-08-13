package Recursion;
import java.util.Scanner;
public class xToThePowerN {

    public static int powerFn(int x,int n)
    {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int pownm1=powerFn(x,n-1);
        int pown=x*pownm1;
        return pown;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x: ");
        int x=sc.nextInt();
        System.out.println();
        System.out.print("Enter n: ");
        int n=sc.nextInt();


        System.out.println(powerFn(x,n));
    }
}
