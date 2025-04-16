
import java.util.Arrays;


public class binary_search
{
    public static void main(String[] args) 
    {
        int [] a = {23,34,76,54,15,56,85,29};
        Arrays.sort(a);
        int key = 56;
        boolean found = false;
        int l = 0;
        int u = a.length-1;
        while(u >= l)
        {
            int mid = (u+l)/2;
            if (key == a[mid])
            {
                System.out.println("Element founded in array at "+mid+" index.");
                found =true;
                break;
            }
            else if (key > a[mid])
            {
                l = mid + 1;
            }
            else
            {
                u = mid - 1;
            }
        }
        if(!found){
        System.out.println("not found");}  
    }
}