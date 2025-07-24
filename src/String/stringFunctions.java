package String;
import java.util.Scanner;

public class stringFunctions {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println(str1);
        System.out.println("Enter string2: ");
        String str2=sc.nextLine();

        System.out.println("//Concatination");



        String string = str1+str2;
        System.out.println(string);

        System.out.println("// Length of String: "+string.length());
        System.out.println();

        System.out.println("Access characters of String: ");
        for(int i=0;i<string.length();i++)
        {
            System.out.print(string.charAt(i)+" ");
        }

        System.out.println("//Compare two strings: ");
        int comp=str1.compareTo(str2);

        if(comp>0)
        {
            System.out.println("Str1 is greater than str2");
        }
        else if(comp<0)
        {
            System.out.println("Str1 is less than str2");
        }
        else if(comp==0){
            System.out.println("Both str1 and str2 are equal.");
        }

        System.out.println();

        System.out.println("Substring");

        System.out.println("Enter substring points from 0 to "+(string.length()-1));

        int start=sc.nextInt();
        int end=sc.nextInt();

        System.out.println("Your substring is: "+string.substring(start,end));

        System.out.println("ParseInt method of Intiger class: Integer.parseInt() and Integer.toString()");

        System.out.println("Enter a string of numbers: ");
        String numString=sc.next();

        int num=Integer.parseInt(numString);
        System.out.println(num);

        System.out.println("Converting number to string: ");
        String stringNum=Integer.toString(num);
        System.out.println(stringNum);
    }
}

