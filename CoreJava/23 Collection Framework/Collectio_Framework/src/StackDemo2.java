import java.util.*;

import java.util.Scanner;
public class StackDemo2 {
    static void printData(Stack<Integer> stack){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. elements : ");
            int num = sc.nextInt();
            System.out.println("Insert Elements : ");
            System.out.println(stack);
            for(int i=0;i<num;i++){
                    stack.push(sc.nextInt());
                    System.out.println(stack);
            }
            System.out.println("peek operation takes place : "+stack.peek());
            System.out.println("search operation takes place : "+stack.search(100));
            
            System.out.println("pop operation takes place : ");
            for(int i=0;i<num;i++){
                System.out.println(stack.pop());
                System.out.println(stack);
            }
//            System.out.println(stack.pop());
    }
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        printData(stack);
    }
}