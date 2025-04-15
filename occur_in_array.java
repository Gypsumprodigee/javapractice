public class occur_in_array
{
    public static void main(String []args)
    {
        String a[] = {"rock","paper","paper","sicssors","rock","gun","gun","gun"};
        boolean [] visited = new boolean [a.length];
        for(int i = 0;i < a.length;i++)
        {
            if(visited[i])
            {
                continue;
            }
            int occur = 1;
            for(int j = i+1; j < a.length ;j++)
            {
                if(a[i] == a[j])
                {
                    visited[j] = true;  
                    occur++;
                }
            }
            if (true) 
            {
                System.out.println(a[i]+" ocurred "+occur+" times the array.");    
            }
        }
    }
}
