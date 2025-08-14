// example showing the concept of function
import java.util.Scanner;
class Demo11{
    int a,b; // instance variable 
    void setData(int a1,int b1){
        a = a1;
        b = b1;
    }
    void add(){
        System.out.println("Add : "+(a+b));
    }
    void sub(){
        System.out.println("Sub : "+(a-b));
    }
    void mul(){
        System.out.println("Mul : "+(a*b));
    }
    void div(){
        System.out.println("Div : "+(a/b));
    }
    void mod(){
        System.out.println("Mod : "+(a%b));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Demo11 obj = new Demo11();
        obj.setData(a,b);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.mod();
    }
}


/*
instance variable
int a=10,b=10;

Object 
Demo10 obj1 = new Demo10();
obj1 => a=10,b=10

obj1.a = 200
obj1 => a=200,b=10

Demo10 obj2 = new Demo10();
obj2 => a=10,b=10

*/












