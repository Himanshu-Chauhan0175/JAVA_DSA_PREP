package String;
import java.util.Scanner;

public class usernameFromEmail {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String email=sc.nextLine();

        StringBuilder username=new StringBuilder();
        boolean flag=true;

        for(int i=0;i<email.length();i++)
        {
            if(email.charAt(i)=='@')
            {
                flag=false;
                break;
            }
        }

        if(flag==false){
            for(int i=0;i<email.length();i++)
            {
                if(email.charAt(i)=='@')
                {
                    break;
                }
                else{
                    username.append(email.charAt(i));
                }
            }
            System.out.println(username);
        }
        else{
            System.out.println("Enter email correctly!");
        }
    }
}
