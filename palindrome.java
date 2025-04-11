//palindrome number remains same even after being reversed
import java.util.Scanner;
public class palindrome {
    boolean palindrome_way_1(int num)
    {
        int rev = 0;
        int temp = num;
        while(temp!=0)
        {
            rev=rev*10+temp%10; 
            temp/=10;
        }
        if(rev == num)
            return true;
        else 
            return false;
    }
    boolean palindrome_way_2(int num)
    {
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        String rev = sb.reverse().toString();
        String o = String.valueOf(num);
        return o.equals(rev); 
    }
        public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        palindrome ob = new palindrome();
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        //boolean result=ob.palindrome_way_1(num);
        boolean result=ob.palindrome_way_2(num);
        if (result)   
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
        sc.close();
    }
}
