package Loops;
import java.util.Scanner;
public class print0ToN {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=n);
    }
}
