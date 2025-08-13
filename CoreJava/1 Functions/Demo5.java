// example showing the concept of function
// no argument no return type

import java.util.Scanner;
class Demo5{
    void addition(){ // called function | no return type(void) 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Addition : "+c);
    }
    public static void main(String args[]){
        Demo5 obj = new Demo5();
        obj.addition(); // calling function | no argument
    }
}

