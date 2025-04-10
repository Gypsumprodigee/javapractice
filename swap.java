public class swap
{
     public static void main(String [] args)
    {
        int a = 10;
        int b = 20;
        System.out.println("Orginal value of a & b : "+ a +" & "+ b);
        
        //5 ways of swapping two numbers
        /*1.Using third variable 
        int c = a;   //c=10
        a = b;       //a=20
        b = c;       //b=10
        */
       
        /*2.Using + and - 
        a = a + b;   //a=30
        b = a - b;   //b=30-20=10
        a = a - b;   //a=30-10=20
        */

        /*3.Using / and *
        a = a * b;   //a=200
        b = a/b;     //b=200/20=10
        a = a/b;     //a=200/10=20
         */
       
        /*4.Using bitwise Xor ^ 
        a = a ^ b;    //a=10100^1010=11110 30
        b = a ^ b;    //b=11110^1010=10100 10
        b = a ^ b;    //c=11110^10100=01010 20
        */
        /*5.IN single statement
        a = a + b - (b = a); //a= 30-20 b=10
         */
        a = a + b - (b = a);
        System.out.println("Swapped value of a & b : "+ a +" & "+ b);
    }
}