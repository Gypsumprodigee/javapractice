// How To Generate Random Numbers & Strings 
import java.util.Random;
import java.util.Scanner;
public class random 
{
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Generate a random number :");
        int n = rand.nextInt(100);
        System.out.println(n);
        System.out.println("Generate a random String code");  
        System.out.println("Enter code of how many digits");  
        int y = sc.nextInt();
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char s;
        for(int i = 0;i < y;i++)
        {
            s = str.charAt(rand.nextInt(50));
            System.out.print(s);
        }
    }
}
