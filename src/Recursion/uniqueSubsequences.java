package Recursion;
import java.util.*;

public class uniqueSubsequences {

    public static void subsequences(String str,int index,String newStr,HashSet set){
        if(str.length()==index)
        {
            if(set.contains(newStr)){
                return;
            }
            else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        subsequences(str,index+1,newStr+str.charAt(index),set);

        subsequences(str,index+1,newStr,set);
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        HashSet<String> set=new HashSet();

        subsequences(str,0,"",set);
    }
}
