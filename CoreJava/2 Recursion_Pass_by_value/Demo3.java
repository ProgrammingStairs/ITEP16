// example showing the concept of pass by value

/*
Pass by value : 
    a. In pass by value, calling is done by passing values
    b. In pass by value, copy of original data is going to be pass
    c. In pass by value, changes made on copied data does not reflect on original data

Note : Java works on pass by value
Here in case of pass by reference, the reference is also handle and manage as a value
*/

import java.util.Scanner;
class Demo3{
    void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping in swap : \na : "+a+"\nb : "+b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Demo3 obj = new Demo3();
        System.out.println("Before Swapping : \na : "+a+"\nb : "+b);
            obj.swap(a,b);
        System.out.println("After Swapping in main : \na : "+a+"\nb : "+b);
    }
}