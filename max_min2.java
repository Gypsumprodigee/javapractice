public class max_min2 
{
    public static void main (String []args)
    {
        int arr[] = {3,43,5,6,43,24,2,1};   
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length;i++)
        {
            for(int j = 1;j < arr.length;j++)
            {
                if(arr[j] > max)
                {
                    max = arr[j];
                }
                else if (arr[j] < min)
                {
                    min = arr[j];
                }
            }
        }
        System.out.println("max:"+max+"  min:"+min);
    }
}
