public class linear_search 
{   
    public static void main(String []args)
    {
        int [] a = {4,5,3,6,2,1,9,21};
        int key = 2;
        boolean flag = false;
        for(int i = 0 ;i < a.length ; i++)
        {
            if (a[i] == key)
            {
                System.out.println(key+" is found at "+i+" position in array.");
                flag = true;
                break;
            }
        }
        if (!flag) 
        {
            System.out.println(key+" not found in the array.");
        }
    }
}
