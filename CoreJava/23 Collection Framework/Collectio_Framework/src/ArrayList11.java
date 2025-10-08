// comparable
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;
class StudentDemo1 implements Comparable<StudentDemo1>{
    int rno;
    String name;
    double per;

    public StudentDemo1(int rno, String name, double per) {
        this.rno = rno;
        this.name = name;
        this.per = per;
    }
    
    @Override
    public String toString(){
        return " { "+rno+" , "+name+" , "+per+" } ";
    }
/*
    @Override
    public int compareTo(StudentDemo1 s){
//        System.out.println(rno+"  ---  "+s.rno);
        //return rno - s.rno; // ascending order
        return s.rno-rno; // descending order
    }
*/
    /*
        @Override
    public int compareTo(StudentDemo1 s){
        return name.compareTo(s.name); // ascending order
    }
*/
            @Override
    public int compareTo(StudentDemo1 s){
        if(per>s.per)
               return 1;
        else if(per<s.per)
                return -1;
        else 
                return 0;
    }

}
public class ArrayList11 {
    public static void main(String[] args) {
        StudentDemo1 s1 = new StudentDemo1(104, "Andrew Anderson", 97.34);
        StudentDemo1 s2 = new StudentDemo1(101, "Peter Parker", 97);
        StudentDemo1 s3 = new StudentDemo1(10, "Jack Jackson", 87.98);
        
       ArrayList<StudentDemo1> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("Elements are : ");
        for(StudentDemo1 s : list)
                System.out.println(s);
        
        Collections.sort(list);
//        System.out.println("Sorting based on Roll number : ");
//        System.out.println("Sorting based on Name : ");
System.out.println("Sorting based on Percentage : ");

        for(StudentDemo1 s : list)
                System.out.println(s);
        
    }
}








