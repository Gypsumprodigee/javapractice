//Count Number Of EVEN & ODD Digits in A Number
import java.util.Scanner;
public class CountEven_Odd
{
    public static void main(String []args)       
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        int digit = 0;
        int temp = num;
        int even_counter=0,odd_counter=0;
        while(temp != 0)
        {
            digit = temp%10;
            if(digit%2 == 0)
            {
                even_counter += 1;
            } 
            else
            {
                odd_counter += 1;
            }
            temp /= 10;
        }
        System.out.println("Number of even and odd digit in "+num+" : "+even_counter+" & "+odd_counter);
        String s = num+"";
        int len = s.length();
        int count = 0;
        int even_counter2 = 0,odd_counter2 = 0;
        int even = 0, odd = 0;
        for(int i = 0;i <= len-1;i++)
        {
            count=Character.getNumericValue(s.charAt(i));
            if(count%2 == 0)
            {  
                even = even*10 + count; 
                even_counter2+=1;
            }
            else
            {
                odd = odd*10 + count; 
                odd_counter2+=1;
            }
        }
        System.out.println("Number of even and odd digit in "+num+" : "+even_counter2+" & "+odd_counter2);
        System.out.println("even and odd digits in "+num+" : "+even+" & "+odd);
        sc.close();
    }
}

