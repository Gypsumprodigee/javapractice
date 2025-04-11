// Count Number Of Digits in A Number
import java.util.Scanner;
public class count 
{
   public static void main(String []args)
   {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        String s =Integer.toString(num);
        System.out.println(s.length()+" digits in "+num);
        sc.close();
        //or 
        int temp = num;
        int count = 0;
        while (temp != 0)
        {
            count = count+1;
            temp /= 10;
        }   
        System.out.println(count);
   }
}
