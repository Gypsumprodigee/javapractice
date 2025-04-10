//4 Ways of Reverse a Number
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();*/
      
        /*1. Using while loop to Reverse the Number
        // take example value : 120
        int temp = num; //temporary stores value for manipulation
        int rev = 0;
        System.out.print("Reversed NUmber :");
        while (temp != 0) // loop until temp not equal 0
        {
            rev = rev * 10 + (temp % 10);// reverse the digit: 1.0*10+(120%10)=0+0=0 Note:integer does not store leading  zero 2.0*10+(12%10)=0+2=2 3.2*10+(1%10)=20+1=21
            if(rev == 0) // check if rev has trailing 0 and prints it
            {
              System.out.print("0");
            }    
            temp = temp / 10;//1.12 2.1 3.0
        }
        System.out.println(rev);// print rest of number in reversed
        */

        /*2. Using String to Reverse the Number
        String str_num = Integer.toString(num); //some other way to convert int to string:1.String s = num+"";concatenation 2.String s = String.valueof(num); 3.String s = String.format("%d",num);
        for(int i = str_num.length()-1;i >= 0;i--)
        {
            System.out.print("Reversed NUmber :"str_num.charAt(i));
        }
        */
    
        /*3.Using StringBuffer class
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println("Reversed NUmber :"+rev);
        */
        
        /*4.Using StringBuilder class
        StringBuilder sb = new StringBuilder(String.valueOf(num)); //or sb.append(num)
        StringBuilder rev = sb.reverse();
        System.out.println("Reversed NUmber :"+rev);
        sc.close();
         */
       
    }
}
