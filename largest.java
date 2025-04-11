import java.util.Scanner;
public class largest 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter three Number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int l = Math.max(a,Math.max(b,c));
        System.out.println("Largest :"+l);
        // 2nd way
        if(a > b && a > c)
        System.out.println("Largest :"+a);
        else if(b > c && b > c)
        System.out.println("Largest :"+b);
        else
        System.out.println("Largest :"+c);
        // 3rd way
        int l2 =a>b && a>c ? a : b > c ? b : c;
        System.out.println("largest :"+l2);
        sc.close();
    }
}
