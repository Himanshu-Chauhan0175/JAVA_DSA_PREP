package Loops;
import java.util.Scanner;

public class marksDefiner {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int ch;

        do{
            System.out.println("Enter your marks: ");
            int marks=sc.nextInt();
            if (0<=marks && marks<=59)
            {
                System.out.println("This is good as well.");
            }
            else if(60<=marks && marks<=89)
            {
                System.out.println("This is also good.");
            }
            else if(90<=marks && marks<=100)
            {
                System.out.println("This is good.");
            }
            System.out.println("Do you want to continue.\n Enter 1 for yes and 0 for no:");
            ch=sc.nextInt();
        }while(ch==1);
    }
}
