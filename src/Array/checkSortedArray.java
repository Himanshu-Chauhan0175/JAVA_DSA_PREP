package Array;
import java.util.Scanner;

public class checkSortedArray {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        boolean flag=true;
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++) {
                if (arr[j] < arr[i]) {
                    flag = false;
                    break;
                }
            }


        }
        if(flag==false){
            System.out.println("Array is not in ascending order.");
        }
        else{
            System.out.println("Array is in ascending order.");
        }
    }
}
