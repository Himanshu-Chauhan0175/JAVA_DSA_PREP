package ConditionalStatements;
import java.util.Scanner;

public class OptAnyOne {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

          char ch;
        do {

            System.out.println("Choose any one: \n 1 || 2 || 3");

            int opt = sc.nextInt();

            switch (opt) {
                case 1: {
                    System.out.println("Namaste");
                }
                break;
                case 2: {
                    System.out.println("Hello");
                }
                break;
                case 3: {
                    System.out.println("Bonjour");
                }
                break;
                default: {
                    System.out.println("Please select any one option!");
                }


            }
            System.out.println("Do you want to continue: y or n");
            ch=sc.next().charAt(0);
        }
            while (ch == 'y') ;

        }
    }

