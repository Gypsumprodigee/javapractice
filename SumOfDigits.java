// Count Sum Of Digits in a Number
import java.util.Scanner;
public class SumOfDigits 
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(temp != 0)
        {
            sum += temp%10;
            temp = temp/10;
        }
        System.out.println("Sum of Digits of "+num+" : "+sum);
        sc.close();
    } 
}
