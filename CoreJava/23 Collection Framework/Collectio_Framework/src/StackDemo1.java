import java.util.*;
 
public class StackDemo1 {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack);
        stack.push(100);
        System.out.println(stack);
        stack.push(200);
        System.out.println(stack);
        stack.push(300);
        System.out.println(stack);
        stack.push(400);
        System.out.println(stack);
        stack.push(500);
        System.out.println(stack);        
    }
}