
import java.util.Arrays;

// Find Missing Number in an Array between lowest and highest value
public class miss_array 
{
    public static void main(String []args)
    {
        int [] arr = {2,3,4,7,8};
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        int min = arr[0];
        System.out.println("Array :"+Arrays.toString(arr));
        for (int i = min;i <= max;i++) 
        {
            boolean found = false;
            for (int j = 0;j <= arr.length-1;j++) 
            {
                if(arr[j] == i)
                {
                    found = true;
                    break;
                }
                else
                {
                    found = false;
                }
            }
            if(!found)
            {
                System.out.print(i+" ");
            }
            
        }
        
      
    }    
}
