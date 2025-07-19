package Functions;
import java.util.Scanner;

public class checkPrimeNumber {
    public static void checkPrime(int number){

        boolean flag=true;
        if(number>0) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
        else{
            System.out.println("Enter a valid number!.");
        }
    }

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        checkPrime(number);
    }
}
