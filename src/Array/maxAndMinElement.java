package Array;
import java.util.Scanner;

public class maxAndMinElement {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int min=arr[0];

        for (int i=1;i<size;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println();
        System.out.println("The minimum element in array is "+min);

        int max=arr[0];
        for(int i=1;i<size;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum element in array is "+max);
    }
}
