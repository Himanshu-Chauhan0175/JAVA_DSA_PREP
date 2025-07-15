package ConditionalStatements;
import java.util.Scanner;

public class oddOReven {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int  num=sc.nextInt();

        if(num>0 && num!=0)
        {
            if(num%2==0)
            {
                System.out.println(num+" is an even number.");
            }
            else if(num%2!=0)
            {
                System.out.println(num+" is an odd number.");
            }
        }
        else{
            System.out.println(num+" is less than 1.");
        }
    }
}
