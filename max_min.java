
import java.util.Arrays;

public class max_min 
{
    public static void main(String []args)
    {
        int [] arr = {6,4,8,2,3,5};
        Arrays.sort(arr);
        System.out.println("Array :"+Arrays.toString(arr)+"\n Minimum :"+arr[0]+"\n Maximum :"+arr[arr.length - 1]);
    }
}
