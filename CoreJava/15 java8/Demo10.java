// example showing the concept of method reference
// in method reference, we complete our incomplete method with the help of method
/*
    Method Reference : 
        a. Reference to an instance method
        b. Reference to a static method 
        c. Reference to a constructor
*/
//  b. Reference to a static method 

import java.util.Scanner;
interface Showable{
    int calculate(int a, int b);
    static int show(int a,int b){
        System.out.println("interface......");
        return a+b;
    }
}
class Demo10{    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter values of a and b : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
        Showable obj = Showable :: show;
        System.out.println("Result : "+obj.calculate(a,b));            
    }
}