package Excercise1;
import java.util.Scanner;

public class commonDivisorOf2 {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int divisor=1;
        if(a>0 && b>0) {
            if (a <= b) {
                for (int i = 1; i < a; i++) {
                    if (a % i == 0 && b % i == 0) {
                        divisor = i;
                    }
                }
            } else if (b < a) {
                for (int i = 1; i < b; i++) {
                    if (a % i == 0 && b % i == 0) {
                        divisor = i;
                    }
                }
            }
            System.out.println("Greatest Common divisor is: "+divisor);
        }
        else{
            System.out.println("Enter positive intigers.");
        }
    }
}
