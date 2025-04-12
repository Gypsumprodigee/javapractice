import java.util.Scanner;
public class Prime {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        boolean flag = true;
        if (num <= 1)
        {
            System.out.println("Not a prime Number");
        }
        else
        {
            for(int i = 2;i <= Math.sqrt(num);i++)
            {
                if(num%i == 0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                System.out.println("Number is prime");
            }
            else
            {
                System.out.println("Number is not prime");
            }
        }
        sc.close();
    }
}
