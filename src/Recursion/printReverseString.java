package Recursion;
import java.util.Scanner;

public class printReverseString {
    public static void print(String str,int length)
    {
        if(length==0)
        {
            System.out.print(str.charAt(0));
            return;
        }
        System.out.print(str.charAt(length));
        print(str,length-1);
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string=sc.nextLine();
        int length=string.length()-1;
        print(string,length);
    }
}
