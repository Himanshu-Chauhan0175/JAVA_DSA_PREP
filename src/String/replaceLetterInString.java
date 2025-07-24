package String;
import java.util.Scanner;

public class replaceLetterInString {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();

        StringBuilder result=new StringBuilder();
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)=='e')
            {
                result.append('i');
            }
            else{
                result.append(str1.charAt(i));
            }
        }

        System.out.println("The resulted string is: "+result);
    }
}
