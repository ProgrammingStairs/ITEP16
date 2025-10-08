
import java.util.ArrayList;
import java.util.Collections;
class Student{
    int rno;
    String name;
    double per;

    public Student(int rno, String name, double per) {
        this.rno = rno;
        this.name = name;
        this.per = per;
    }
    
    @Override
    public String toString(){
        return " { "+rno+" , "+name+" , "+per+" } ";
    }
}
public class ArrayList10 {
    public static void main(String[] args) {
        Student s1 = new Student(104, "Andrew Anderson", 97.34);
        Student s2 = new Student(112, "Peter Parker", 68.32);
        Student s3 = new Student(101, "Jack Jackson", 87.98);
        
       ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("Elements are : ");
        for(Student s : list)
                System.out.println(s);
    }
}








