package Excercise1;
import java.util.Scanner;

public class votingEligiblity {

    public static void eligibleToVote(int age)
    {
        if(0<=age && age<=18)
        {
            System.out.println("You are not eligible to vote.");
        }
        else if(age>18 && age<150){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("Enter a valid age!");
        }
    }

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        eligibleToVote(age);
    }
}
