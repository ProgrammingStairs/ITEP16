// example showing the concept of constructor chaining

import java.util.Scanner;
class Student{
    int rno;
    double per;
    String name;

    // no-argument constructor
    Student(){
        this(101); // this can also be used to invoke current class constructor
        System.out.println("no-argument constructor called");
    }
    // parameterized constructor
    Student(int rno){
        this(rno,78.78);
    }
    Student(int rno,double per){
        this(rno,per,"Jack Jackson");
    }
    Student(int rno,double per,String name){
        this.rno=rno;
        this.per=per;
        this.name=name;
        this.display();
    }
    void display(){
        System.out.println("Student Details : ");
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
    }
}
class Demo4{
    public static void main(String args[]){
       new Student();
    }
}