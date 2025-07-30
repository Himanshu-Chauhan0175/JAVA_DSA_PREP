package String;
import java.util.Scanner;

public class reverseString {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        StringBuilder sb=new StringBuilder(str);

        System.out.println(sb);


//        for(int i=(sb.length()-1);i>=0;i--)
//        {
//
//            System.out.print(sb.charAt(i));
//        }


        for(int i=0;i<sb.length()/2;i++)
        {
            char front=sb.charAt(i);
            char back=sb.charAt(sb.length()-1-i);

            sb.setCharAt(i,back);
          sb.setCharAt((sb.length()-1-i),front);


        }
        System.out.println(sb);
    }
}
