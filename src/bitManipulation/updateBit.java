package bitManipulation;
import java.util.Scanner;

public class updateBit {
    int p;
    public static void main(String []args)
    {

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String binary=Integer.toBinaryString(num);
        System.out.println("Binary number is: "+binary);

        System.out.println("Enter the position to update bit from "+0+" to "+(binary.length()-1));
        int pos=sc.nextInt();

        int bitMask=1<<pos;
        int notbitMask=~bitMask;

        int out=0;
        for(int i=binary.length()-1;i>=0;i--)
        {
            if (i == pos) {

                if(binary.charAt(i)=='1'){

                    out=num & notbitMask;
                    break;
                }
                else if(binary.charAt(i)=='0'){
                    out=num | bitMask;
                    break;
                }
            }

        }
        System.out.println("Updated number is "+out+" and updated binary number is "+Integer.toBinaryString(out));


    }
}
