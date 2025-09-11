// example showing the concept of lambda expression
// in lambda expression, we complete our incomplete method with the help of expression

import java.util.Scanner;
interface Showable{
    int calculate(int a, int b);
}
class Demo6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter values of a and b : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            
        Showable obj = (int a1,int b1)->{
            return a1+b1;
        };
        System.out.println("Result : "+obj.calculate(a,b));
    }
}