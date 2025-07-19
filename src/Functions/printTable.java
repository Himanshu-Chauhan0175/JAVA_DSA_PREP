package Functions;
import java.util.Scanner;

public class printTable {

    public static void table(int num)
    {
        for(int i=1;i<11;i++)
        {
            System.out.println(i*num);
        }
        return;
    }

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        table(num);
    }
}
