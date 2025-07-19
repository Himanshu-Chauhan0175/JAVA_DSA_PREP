package Functions;
import java.util.Scanner;

public class checkEvenOdd {

    public static void checkNumber(int number)
    {
      if(number>2)
      {
          if(number%2==0)
          {
              System.out.println(number+ " is an even number.");
          }
          else{
              System.out.println(number+" is an odd number.");
          }
      }
      else{
          System.out.println("Enter number greater than 2.");
      }
    }
    public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();
       checkNumber(number);
    }
}
