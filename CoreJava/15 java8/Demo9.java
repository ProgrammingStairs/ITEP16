// example showing the concept of method reference
// in method reference, we complete our incomplete method with the help of method
/*
    Method Reference : 
        a. Reference to an instance method
        b. Reference to a static method 
        c. Reference to a constructor
*/
// a. Reference to an instance method

import java.util.Scanner;
interface Showable{
    int calculate(int a, int b);
    default int show(int a,int b){
        System.out.println("interface......");
        return a+b;
    }
}
class Demo9 implements Showable{
    @Override
    public int calculate(int a,int b){return 0;}
    
    // public int show(int a,int b){
    //     System.out.println("Demo9......");
    //     return a+b;
    // }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter values of a and b : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
        Showable obj1 = new Demo9();
        Showable obj = obj1 :: show;
        System.out.println("Result : "+obj.calculate(a,b));            
    }
}