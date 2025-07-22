package Excercise1;
import java.util.Scanner;

public class circumferenceOfCircle {

    public static float circumference(float r)
    {
        float circumference=(2*3.14f*r);

        return circumference;
    }

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        float r=sc.nextInt();

        if(r<=0)
        {
            System.out.println("Enter a valid radius!");
        }
        else {
            System.out.println(circumference(r));
        }
    }
}
