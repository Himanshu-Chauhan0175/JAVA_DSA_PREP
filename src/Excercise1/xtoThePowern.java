package Excercise1;
import java.util.Scanner;

public class xtoThePowern {

    public int xPowerY(){

        Scanner sc=new Scanner(System.in);
        int value=1;
        System.out.println("Enter X: ");
        int x=sc.nextInt();
        System.out.println("Enter N: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            value*=x;
        }
        return value;
    }
    public static void main(String []args){
        xtoThePowern x=new xtoThePowern();
        System.out.println("The value is:"+x.xPowerY());
    }
}
