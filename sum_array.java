
import java.util.Scanner;

// Find Sum of Elements in Array
public class sum_array 
{
    public static void main(String []args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of terms in the array :");
       int t = sc.nextInt();
       int arr []= new int [t];
       int sum = 0;
       System.out.println("Enter elements :");
       for(int i = 0;i < t;i++)
       {
            arr [i]=sc.nextInt();
           // sum = sum + arr [i];
       }
       //or
       for(int value : arr)
       {
            sum = sum + value;
       }
       System.out.print("Sum of Elements : "+sum);
    }
}
