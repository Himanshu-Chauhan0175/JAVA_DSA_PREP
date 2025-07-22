package Excercise1;
import java.util.Scanner;

public class average3numbers {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        float avg=((a+b+c)/3f);

        System.out.println("Average of "+a+" "+b+" "+c+" is "+avg);
    }
}
