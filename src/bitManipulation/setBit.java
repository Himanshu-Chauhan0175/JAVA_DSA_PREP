package bitManipulation;

import java.util.Scanner;

public class setBit {
    public static void main(String []args)

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        String str=Integer.toString(num);
        System.out.println("Enter the position to set bit.");
        int pos=sc.nextInt();

        int bitmask=1<<pos;

        System.out.println(bitmask);

        int out=num | bitmask;

        System.out.println(out);
    }
}
