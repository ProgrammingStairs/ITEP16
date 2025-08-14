// example showing the concept of function
// this keyword can also be passed as an argument in method call

import java.util.Scanner;
class Demo{
    int num;
    void display(Demo demoObj){
        System.out.println("display method called : "+demoObj);
    }
    void printData(Demo demoObj){
        System.out.println("num : "+demoObj.num);
    }
    void show(){
        System.out.println("show method called");
        this.num=100;
        printData(this); // this.printData(this);
        display(this);
    }
}
class Demo15{
    public static void main(String args[]){
        Demo obj = new Demo();
        obj.show();
    }
}

/*
class_name@Integer.toHexString(hashCode())
Demo@45a4b4
*/
