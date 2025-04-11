import java.util.Scanner;

public class PalindromeString {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or sentence : " );
        String s = sc.nextLine().toUpperCase();
        StringBuffer sb = new StringBuffer(String.valueOf(s));
        String rev = sb.reverse().toString();
        if (rev.equals(s))
            System.out.println("Palindrome String");
        else
            System.out.println("Not Palindrome String");
        
        //Other way
        String rev2 ="";
        for(int i = s.length()-1;i >= 0;i--)
        {
            rev2 =rev2+s.charAt(i);
        }
        if (rev2.equals(s) )
            System.out.println("Palindrome String");
        else
            System.out.println("Not Palindrome String");
        sc.close();
    }
}
