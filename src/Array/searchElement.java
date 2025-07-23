package Array;
import java.util.Scanner;

public class searchElement {
    public static void search(int arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the element you want to serach: ");
        int element=sc.nextInt();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            {
                System.out.println("Index of the element is: "+i+" ");
            }
        }
    }

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int []arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }

        search(arr);
    }
}
