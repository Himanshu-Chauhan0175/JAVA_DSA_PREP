package ConditionalStatements;
import java.util.Scanner;

public class calculator {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        char ch;

    do{
        int a=sc.nextInt();
        System.out.println("Select any operation: \n / | * | + | -");
        char op=sc.next().charAt(0);
        int b=sc.nextInt();

        switch(op)
        {
            case '/':
            {
                System.out.println(a/b);
            }
            break;
            case '*':
            {
                System.out.println(a*b);
            }
            break;
            case '+':
            {
                System.out.println(a+b);
            }
            break;
            case '-':
            {
                System.out.println(a-b);
            }
            break;
            default:
            {
                System.out.println("Choose correct operation!");
            }

        }
        System.out.println("Do you want to continue? y or n");
        ch=sc.next().charAt(0);
    }
    while(ch=='y');
}
}
