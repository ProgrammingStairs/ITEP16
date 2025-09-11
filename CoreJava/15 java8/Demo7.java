// example showing the concept of lambda expression
// in lambda expression, we complete our incomplete method with the help of expression

import java.util.Scanner;
interface Showable{
    int calculate(int a, int b);
}
class Demo7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter values of a and b : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            
        Showable obj;
        obj = (a1,b1)->{
            a1+b1;
        };
        System.out.println("Result : "+obj.calculate(a,b));
    }
}