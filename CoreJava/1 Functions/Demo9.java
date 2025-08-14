// example showing the concept of function
import java.util.Scanner;
class Demo9{
    void operation(int a1,int b1){
        System.out.println("Add : "+(a1+b1));
        System.out.println("Sub : "+(a1-b1));
        System.out.println("Mul : "+(a1*b1));
        System.out.println("Div : "+(a1/b1));
        System.out.println("Mod : "+(a1%b1));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Demo9 obj = new Demo9();
        obj.operation(a,b);
    }
}

