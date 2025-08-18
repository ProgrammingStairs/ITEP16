// example showing the concept of recursion
// base and exponent
import java.util.Scanner;
class Demo2{
    // function definition 
    int power(int b,int e){
        if(e==0)
            return 1;
        else
            return b*power(b,e-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and exponent : ");
        int b = sc.nextInt();
        int e = sc.nextInt();
        Demo2 obj = new Demo2();
        System.out.println("Power : "+obj.power(b,e));// function calling
    }
}