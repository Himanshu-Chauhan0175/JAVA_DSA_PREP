package Recursion;
import java.util.Scanner;


public class checkSortedArray {
    public static boolean checkSort(int arr[],int index){
        if(index==arr.length-1){
         return true;
        }
      if(arr[index]<=arr[index+1]){
         return checkSort(arr,index+1);
      }
      else{
          return false;
      }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        if(checkSort(arr,0)){
            System.out.println("Array is sorted.");
        }
        else{
            System.out.println("Array is not sorted.");
        }

    }
}
