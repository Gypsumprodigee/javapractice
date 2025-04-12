//Generate Fibonacci series
import java.util.Scanner;
public class Fibonacci
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int a = 0;
        int b = 1;
        int c = 0;
        int sum = a + b + c;
        System.out.println("Enter number of terms of fibonnacci  :");
        int term = sc.nextInt();
        switch (term) {
            case 1 -> System.out.print("Fibonnacci Series : "+a);
            case 2 -> System.out.print("Fibonnacci Series : "+a+"+"+b);
            default -> System.out.print("Fibonnacci Series : "+a+"+"+b);
        }
        for (int i = 3;i <= term;i++)
        {
            if(i <= term)
            {
                System.out.print("+");
            }
            c = a + b;
            a = b;
            b = c;
            System.out.print(c);
            sum += c;
        }
        System.out.println("\n Sum of Series : "+sum);
        sc.close();
    }
}
