package Recursion;
import java.util.Scanner;

public class fibonacciTillN {

    public static void printFibonacci(int first,int second,int n){
          if(n==0) {
              return;
          }
              int third=first+second;
        System.out.print(third+" ");

              first = second;
              second = third;
              printFibonacci(first, second, n-1);


    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=0;
        int second=1;
        System.out.print(first+" "+second+" ");
        printFibonacci(first,second,n-2);
    }
}
