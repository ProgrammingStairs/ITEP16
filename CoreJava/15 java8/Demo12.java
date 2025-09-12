// example showing the concept of method reference
// in method reference, we complete our incomplete method with the help of method
/*
    Method Reference : 
        a. Reference to an instance method (class + interface)
        b. Reference to a static method 
        c. Reference to a constructor
*/
// c. Reference to a constructor

import java.util.Scanner;
interface Showable{
    void calculate(int a, int b);
}
class Demo12{
    Demo12(int a,int b){
        System.out.println("Sum : "+(a+b));
    }    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter values of a and b : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
        Showable obj = Demo12 :: new;
        obj.calculate(a,b);            
    }
}