// Print Even & Odd Numbers from an Array
import java.util.Arrays;

public class EvenOddArray
{
    @SuppressWarnings("UnnecessaryContinue")
    public static void main(String []args)
    {
        int arr[]={0,3,2,4,7,6,8,9};
        int even[]=new int[arr.length];
        int odd[]=new int[arr.length];
        int e=0,o=0;
        for (int i = 0;i < arr.length;i++)
        {
            if(arr[i] == 0)
            {
                continue;
            }
            else if(arr[i]%2 == 0)
            {
                even[e] = arr[i];
                e += 1;
            }
            else
            {
                odd[o] = arr[i];
                o += 1;
            }
        }
        //trim arrays to correct size
        even=Arrays.copyOf(even,e);
        odd=Arrays.copyOf(odd,o);
        System.out.println("Even elements in array :"+Arrays.toString(even));
        System.out.println("Odd elements in array :"+Arrays.toString(odd));
    }
}