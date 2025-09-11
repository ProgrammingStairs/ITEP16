// example showing the concept of lambda expression
// in lambda expression, we complete our incomplete method with the help of expression

import java.util.Scanner;
interface Showable{
    void calculate();
}
class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter values of a and b : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            
        Showable obj = ()->{
            System.out.println("Sum : "+(a+b));
        };
        obj.calculate();
    }
}