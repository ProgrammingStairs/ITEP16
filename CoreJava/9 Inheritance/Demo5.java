// example showing the concept of Hierarchical inheritance

import java.util.Scanner;
class Person{
    int age;
    String name;
    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter Age : ");
        age = sc.nextInt();
    }
    void showDetails(){
        System.out.println("\nName : "+name);
        System.out.println("Age : "+age);
    }
}
class Student extends Person{
    int fees;
    String course;
    void getStudDetails(){
        getDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Course Name : ");
        course = sc.nextLine();
        System.out.println("Enter Fees : ");
        fees = sc.nextInt();
    }
    void showStudDetails(){
        showDetails();
        System.out.println("Course Name : "+course);
        System.out.println("Fees : "+fees);
    }
}
class Employee extends Person{
    int salary;
    String desig;
    void getEmpDetails(){
        getDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Designation : ");
        desig = sc.nextLine();
        System.out.println("Enter Salary : ");
        salary = sc.nextInt();
    }
    void showEmpDetails(){
        showDetails();
        System.out.println("Designation : "+desig);
        System.out.println("Salary : "+salary);
    }
}
class Demo5{
    public static void main(String args[]){
        Student sobj = new Student();
        sobj.getStudDetails();
        Employee eobj = new Employee();
        eobj.getEmpDetails();
        System.out.println("###### Details #######");
        sobj.showStudDetails();
        eobj.showEmpDetails();
    }
}
