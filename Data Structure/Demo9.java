// example showing the concept of stack

import java.util.*;
class StackDemo{
    int arr[],size,top;
    public StackDemo(int size){
        this.size=size;
        this.top = -1;
        this.arr = new int[this.size];
    }
    public void pushDemo(int data){
        if(isFull())
            System.out.println("Stack is full");
        else{
            top++;
            arr[top] = data;
            System.out.println(arr[top]+" inserted successfully");
        }
    }
    public void popDemo(){
        if(isEmpty())
            System.out.println("Stack is Empty");
        else{
            System.out.println(arr[top]+" removed successfully");
            top--;
        }
    }
    public boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }
    public boolean isFull(){
        if(top==size-1)
            return true;
        else
            return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();

        StackDemo stack = new StackDemo(size);
        stack.pushDemo(100);
        stack.popDemo();
        stack.pushDemo(200);
        stack.pushDemo(300);
        stack.pushDemo(400);
        stack.popDemo();
        stack.pushDemo(500);
        stack.popDemo();
        stack.pushDemo(600);
        stack.pushDemo(700);
        stack.pushDemo(800);
        stack.pushDemo(900);
        stack.pushDemo(1000);
        // also put switch statement to customize input        

        System.out.println("Stack elements are : ");
        for(int i=stack.top;i>=0;i--)
            System.out.print(stack.arr[i]+"\t");
    }
}