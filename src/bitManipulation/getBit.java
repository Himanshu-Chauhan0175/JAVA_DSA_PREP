package bitManipulation;
import java.util.Scanner;

public class getBit {
    public static void main(String []args)

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter binary number: ");
        int num=sc.nextInt();

        String str=Integer.toString(num);
        System.out.println("Enter the position to get bit from "+0+" to "+str.length());
        int pos=sc.nextInt();

        int bitmask=1<<pos;

        System.out.println(bitmask);

        int out=num & bitmask;

        if(out>0)
        {
            System.out.println("Bit at position "+pos+" is "+1);
        }
        else{
            System.out.println("Bit at position "+pos+" is "+0);
        }
    }
}
