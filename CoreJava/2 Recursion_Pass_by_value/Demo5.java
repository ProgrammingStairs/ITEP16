// example showing the concept of pass by reference

/*
Note : Java works on pass by value
Here in case of pass by reference, the reference is also handle and manage as a value
*/

import java.util.Scanner;
class Demo5{
    int a,b; // instance variable
    void setData(int a,int b){
        this.a=a;
        this.b=b;
    }
    void swap(Demo5 obj){
        int temp=obj.a;
        obj.a=obj.b;
        obj.b=temp;
        System.out.println("After Swapping in swap : \na : "+obj.a+"\nb : "+obj.b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Demo5 obj = new Demo5();
        obj.setData(a,b);
        System.out.println("Before Swapping : \na : "+obj.a+"\nb : "+obj.b);
            obj.swap(obj);
        System.out.println("After Swapping in main : \na : "+obj.a+"\nb : "+obj.b);
    }
}