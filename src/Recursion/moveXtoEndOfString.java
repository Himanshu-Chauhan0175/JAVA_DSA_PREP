package Recursion;
import java.util.Scanner;

public class moveXtoEndOfString {
    public static void moveAllX(String str, int index, int count, String newStr)
    {
        if(index==str.length()){
            for(int i=0;i<count;i++)
            {
                newStr+='x';
            }
            System.out.print(newStr);
            return;
        }
        if(str.charAt(index)=='x'){
            count++;
            moveAllX(str,index+1,count,newStr);
        }else{
            newStr+=str.charAt(index);
            moveAllX(str,index+1,count,newStr);
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        moveAllX(str,0,0,"");
    }
}
