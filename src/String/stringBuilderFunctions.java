package String;
import java.util.Scanner;

public class stringBuilderFunctions {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str=sc.next();
        StringBuilder sb=new StringBuilder(str);


        System.out.println(str);

        System.out.println("Enter index you want to search from 0 to "+(sb.length()-1)+": ");
        int in=sc.nextInt();

        System.out.println(sb.charAt(in));

        System.out.println("Enter your index and character you want to replace in String: ");
        int ind=sc.nextInt();
        char ch=sc.next().charAt(0);

        sb.setCharAt(ind,ch);

        System.out.println(sb);

        System.out.println("Enter the index and character you want to insert in your string: ");
        int index=sc.nextInt();
        char c=sc.next().charAt(0);

        sb.insert(index,c);
        System.out.println(sb);

        //Delete tha unwanted character or string

        System.out.println("Enter the indices for character or string you want to deleter: ");
        int ind1=sc.nextInt();
        int ind2=sc.nextInt();

        sb.delete(ind1,ind2);

        System.out.println(sb);

        System.out.println("Enter the string you want to add in the string: ");
        String str1=sc.next();
        sb.append(str1);
        System.out.println(sb);
    }
}

