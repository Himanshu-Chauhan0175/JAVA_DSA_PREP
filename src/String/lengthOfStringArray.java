package String;
import java.util.Scanner;

public class lengthOfStringArray {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        String []arr=new String[size];

        for(int i=0;i<size;i++)
        {
            arr[i]=sc.next();
        }
        System.out.println();

        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        String string=arr[0];
        for(int i=1;i<size;i++)
        {
            string+=arr[i];
        }

        System.out.println(string);
        System.out.println();
        System.out.println("Length of the string of array elements is: "+string.length());
    }
}
