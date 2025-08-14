// example showing the concept of function
import java.util.Scanner;
class Demo10{
    void add(int a1,int b1){
        System.out.println("Add : "+(a1+b1));
    }
    void sub(int a1,int b1){
        System.out.println("Sub : "+(a1-b1));
    }
    void mul(int a1,int b1){
        System.out.println("Mul : "+(a1*b1));
    }
    void div(int a1,int b1){
        System.out.println("Div : "+(a1/b1));
    }
    void mod(int a1,int b1){
        System.out.println("Mod : "+(a1%b1));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Demo10 obj = new Demo10();
        obj.add(a,b);
        obj.sub(a,b);
        obj.mul(a,b);
        obj.div(a,b);
        obj.mod(a,b);
    }
}

