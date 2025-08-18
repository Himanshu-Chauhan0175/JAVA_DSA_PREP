package Recursion;
import java.util.Scanner;

public class towerOfHanoi {

    static int step=0;

    public static void hanoi(int n, String source, String helper, String destination){

        if(n==1)
        {
            step++;
            System.out.println("Step "+(step)+": Transfer disk "+n+" from "+source+" to "+destination+".");
            return;
        }

        hanoi(n-1,source,destination,helper);
        step++;
        System.out.println("Step "+step+": Transfer disk "+n+" from "+source+" to "+destination+".");

        hanoi(n-1,helper,source,destination);


    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n=sc.nextInt();

        hanoi(n,"S","H","D");

    }
}
