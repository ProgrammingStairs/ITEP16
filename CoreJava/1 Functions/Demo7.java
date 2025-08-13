// example showing the concept of function
// with argument no return type

import java.util.Scanner;
class Demo7{
    void power(int b,int e){ // parameter | formal parameter  | formal argument
        int num = 1;
        for(int i=1;i<=e;i++){
            num = num * b;
        }
        System.out.println("Result : "+num);
    }
    public static void main(String args[]){
        Demo7 obj = new Demo7();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and exponent : ");
        int b = sc.nextInt();
        int e = sc.nextInt();
        obj.power(b,e); // argument | actual parameter | actual argument
    }
}

