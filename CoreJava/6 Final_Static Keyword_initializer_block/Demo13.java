// example showing the concept of static
import java.util.Scanner;
class Student{
    int rno;
    String name;
    static String cname;

    // Parameterized constructor
    Student(int rno,String name){
        this.rno=rno;
        this.name=name;
    }
    void printData(){
        System.out.println(rno+"\t"+name+"\t"+cname);
    }
    static void getCollegeName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter College Name : ");
        cname = sc.nextLine();
    }
    static{
         getCollegeName();
    }
}
class Demo13{
    public static void main(String args[]){
        // Student.getCollegeName();
        Student s1 = new Student(101,"Andrew Anderson");
        Student s2 = new Student(102,"Peter Parker");

        System.out.println("############ Student Details ##########");
        s1.printData();
        s2.printData();
    }
}