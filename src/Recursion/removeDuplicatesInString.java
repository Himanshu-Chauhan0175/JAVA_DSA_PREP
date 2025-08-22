package Recursion;
import java.util.Scanner;
public class removeDuplicatesInString {

    public static boolean []arr=new boolean[26];

    public static void removeDuplicates(String str,int index,String newStr)
    {
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }
        if(arr[str.charAt(index)-'a']){
            removeDuplicates(str,index+1,newStr);
        }else{
            newStr+=str.charAt(index);
            arr[str.charAt(index)-'a']=true;
            removeDuplicates(str,index+1,newStr);
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        removeDuplicates(str,0,"");
    }
}
