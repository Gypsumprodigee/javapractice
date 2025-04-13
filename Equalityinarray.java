
import java.util.Arrays;

public class Equalityinarray
{
    public static void main(String[] args)
    {
        int a1[]={4,5,3,2,1};
        int a2[]={4,5,3,2,1};
        String s1 = Arrays.toString(a1);
        String s2 = Arrays.toString(a2);
        //1.
        if(s1.equals(s2))
        {
            System.out.println("Arrays are equal");
        }
        else
        {
            System.out.println("Arrays are not equal");
        }
        //2.
        if(Arrays.equals(a1,a2))
        {
            System.out.println("Arrays are equal");
        }
        else
        {
            System.out.println("Arrays are not equal");
        }
        //3.
        boolean status = true;
        if(a1.length == a2.length)
        {
            for(int i=0;i <= a1.length-1;i++)
            {
                if(a1[i] == a2[i])
                {
                    status = true;
                }
            }
        }
        else
        {
            status = false;
        }
        if(status)
        {
            System.out.println("Arrays are equal");
        }
        else
        {
            System.out.println("Arrays are not equal");
        }
    }
}