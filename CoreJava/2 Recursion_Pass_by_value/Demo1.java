// example showing the concept of recursion
// factorial of a number
import java.util.Scanner;
class Demo1{
    // function definition 
    int fact(int n){
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        Demo1 obj = new Demo1();
        System.out.println("Factorial : "+obj.fact(num));// function calling
    }
}