package Sorting;
import java.util.Scanner;

public class selectionSort {

    public static void printArray(int n, int []arr)
    {
        System.out.println();
        System.out.print("The sorted array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();

        int []arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("The array is: ");

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }


        // Selection Sort
        // time complexity: O()

        int min;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i]){
                    min=arr[j];
                    arr[j]=arr[i];
                    arr[i]=min;

                }
            }
        }

        printArray(n,arr);
    }
}
