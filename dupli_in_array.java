//Find Duplicate Elements in Array
public class dupli_in_array 
{
    public static void main(String []args)
    {
        int arr[] = {1,1,3,5,4,3,1,7,6,6,6};
        boolean visited[] = new boolean[arr.length];
        int duplicate_count = 0;
        for(int i = 0;i < arr.length;i++)
        {
            if(visited[i])
            {
                continue;
            }
            else
            {
                for(int j = i+1 ;j < arr.length;j++)
                {
                    if (arr[i] == arr[j]) 
                    {
                        visited[j] = true;
                        duplicate_count++;
                    }
                }
            }
            if(duplicate_count > 0)
            {
                System.out.println(arr[i]+" has "+duplicate_count+" duplicate values in array.");
            }
            duplicate_count = 0;
        }
    }
}
