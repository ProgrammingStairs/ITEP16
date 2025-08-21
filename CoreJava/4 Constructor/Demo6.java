// example showing the concept of parameterized constructor

import java.util.Scanner;
class Student{
    int rno;
    double per;
    String name;

    // parameterized constructor
    Student(Student obj){ // here this.rno, this.per, this.name is of new Object objNew
        this.rno = obj.rno;
        this.per = obj.per;
        this.name = obj.name;
    }
    // parameterized constructor
    Student(String name,int rno,double per){
        this.rno=rno;
        this.per=per;
        this.name=name;
    }
    void display(){
        System.out.println("Student Details : ");
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
    }
}
class Demo6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Roll Number : ");
        int rno = sc.nextInt();
        
        System.out.println("Enter Percentage : ");
        double per = sc.nextDouble();

        Student obj = new Student(name,rno,per);
        Student objNew = new Student(obj);

        obj.display();
        System.out.println("\nAfter copying : \n");
        objNew.display();
    }
}