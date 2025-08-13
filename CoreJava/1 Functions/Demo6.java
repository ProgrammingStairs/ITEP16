// example showing the concept of function
// no argument with return type

import java.util.Scanner;
class Demo6{
    int power(){ // called function | no return type(void) 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and exponent : ");
        int b = sc.nextInt();
        int e = sc.nextInt();
        int num = 1;
        for(int i=1;i<=e;i++){
            num = num * b;
        }
        return num;
    }
    public static void main(String args[]){
        Demo6 obj = new Demo6();
        System.out.println("Result : "+obj.power()); // calling function | no argument
    }
}

