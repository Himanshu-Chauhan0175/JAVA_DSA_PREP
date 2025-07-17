package Loops;
import java.sql.SQLOutput;
import java.util.Scanner;

public class primeOrNot {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean flag=true;

        for(int i=2;i<num;i++)
        {
            if(num%i==0) {
                System.out.println(num+" is not a prime number | Divisible by " + i);
                flag=false;
                break;
            }
        }
        if(flag)
        {
            System.out.println(num+" is a prime number.");
        }
    }
}
