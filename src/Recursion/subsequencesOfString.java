package Recursion;
import java.util.Scanner;

public class subsequencesOfString {

    public static void subsequences(String str,int index,String newStr){
        if(str.length()==index)
        {
            System.out.println(newStr);
            return;
        }

        subsequences(str,index+1,newStr+str.charAt(index));

        subsequences(str,index+1,newStr);
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        subsequences(str,0,"");
    }
}
