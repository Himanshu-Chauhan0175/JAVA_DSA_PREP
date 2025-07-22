package Excercise1;
import java.util.Scanner;

public class countPositiveNegativeAndZero {

    public void countIntiger(){
        int pos=0;
        int neg=0;
        int zero=0;

        Scanner sc=new Scanner(System.in);

        char ch;

        do{
            System.out.println("Enter an intiger: ");
            int num=sc.nextInt();

            if(num<0)
            {
                neg+=1;
            }
            else if(num==0)
            {
                zero+=1;
            }
            else if(num>0)
            {
                pos+=1;
            }
            System.out.println("Enter y to continue and n to stop: ");
            ch=sc.next().charAt(0);
        }while(ch=='y');

        System.out.println("Positive Intigers: "+pos);
        System.out.println("Negative Intigers: "+neg);
        System.out.println("Zeros: "+zero);
    }

    public static void main(String []args)
    {

        countPositiveNegativeAndZero count=new countPositiveNegativeAndZero();

        count.countIntiger();
    }
}
