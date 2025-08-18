package Recursion;
import java.util.Scanner;

public class firstLastOccurenceOfLetter {
    static int first=-1;
    static int last=-1;
    public static void printIndex(String string,int index,char ch){

        if(index==string.length()){
            System.out.println("First occurence is at: "+first);
            System.out.println("Last occurence is at: "+last);
            return;
        }
        if(string.charAt(index)==ch){
            if(first==-1)
            {
                first=index;
            }
            else{
                last=index;
            }
        }
        printIndex(string,index+1,ch);

    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String string=sc.next();
        System.out.println("Length of string index: "+(string.length()-1));
        char ch=sc.next().charAt(0);
        int index=0;


        printIndex(string,index,ch);

    }
}
