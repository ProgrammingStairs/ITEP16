import java.util.Scanner;
public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        Operation obj = new Operation();
        System.out.println("Sum : "+obj.getSum(a, b));
        System.out.println("Sub : "+obj.getSub(a, b));
        System.out.println("Mul : "+obj.getMul(a, b));
        System.out.println("Div : "+obj.getDiv(a, b));
        System.out.println(" : "+obj.getMod(a, b));
    }
}
