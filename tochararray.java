import java.util.Scanner;
public class tochararray
{
    public static void main (String [] args)
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("You entered: " + str);
        //String str ="xyv";
        char[] a = str.toCharArray();
        for(int i = str.length()-1; i >= 0;i--)
        {
            System.out.print(a[i]);
        }
        sc.close();
    }
    
}