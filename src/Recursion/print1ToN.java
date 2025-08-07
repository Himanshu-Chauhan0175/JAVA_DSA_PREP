package Recursion;
import java.util.Scanner;
public class print1ToN {

    public static void print(int x,int n)
    {
        if(x>n){
            return;
        }
        System.out.println(x);
        print(x+1,n);
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=1;

print(x,n);
    }
}
