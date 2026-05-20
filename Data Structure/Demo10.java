// example showing the concept of queue

import java.util.*;
class QueueDemo{
    int arr[],capacity,scale=0,front,rear;
    public QueueDemo(int size){
        this.capacity=size;
        this.rear = -1;
        this.front = 0;
        this.arr = new int[this.capacity];
    }
    public void inDemo(int data){
        if(isFull())
            System.out.println("Queue is full");
        else{
            rear++;
            arr[rear] = data;
            System.out.println(arr[rear]+" inserted successfully");
            scale++;
        }
    }
    public void deDemo(){
        if(isEmpty())
            System.out.println("Queue is Empty");
        else{
            front++;
            System.out.println(arr[front-1]+" removed successfully");
            scale--;
        }
    }
    public boolean isEmpty(){
        if(scale==0)
            return true;
        else
            return false;
    }
    public boolean isFull(){
        if(rear==capacity-1)
            return true;
        else
            return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();

        QueueDemo queue = new QueueDemo(size);
        queue.inDemo(100);
        queue.deDemo();
        queue.inDemo(200);
        queue.inDemo(300);
        queue.inDemo(400);
        queue.deDemo();
        queue.inDemo(500);
        queue.deDemo();
        queue.inDemo(600);
        // queue.inDemo(700);
        // queue.inDemo(800);
        // queue.inDemo(900);
        // queue.inDemo(1000);
        // also put switch statement to customize input        

        System.out.println("Queue elements are : ");
        for(int i=queue.front;i<=queue.rear;i++)
            System.out.print(queue.arr[i]+"\t");
    }
}