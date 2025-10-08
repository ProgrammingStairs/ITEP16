// comparator
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
class StudentDemo3{
    int rno;
    String name;
    double per;

    public StudentDemo3(int rno, String name, double per) {
        this.rno = rno;
        this.name = name;
        this.per = per;
    }
    
    @Override
    public String toString(){
        return " { "+rno+" , "+name+" , "+per+" } ";
    }
}
class SortByRno1 implements Comparator<StudentDemo3>{
       @Override
       public int compare(StudentDemo3 s1,StudentDemo3 s2){
           return s1.rno-s2.rno;
       }
}
class SortByName1 implements Comparator<StudentDemo3>{
       @Override
       public int compare(StudentDemo3 s1,StudentDemo3 s2){
           return s1.name.compareTo(s2.name);
       }
}
class SortByPer1 implements Comparator<StudentDemo3>{
       @Override
       public int compare(StudentDemo3 s1,StudentDemo3 s2){
           if(s1.per>s2.per)
                    return 1;
           else if(s1.per<s2.per)
                    return -1;
           else
                    return 0;
       }
}
        
public class LinkedList2 {
    public static void main(String[] args) {
        StudentDemo3 s1 = new StudentDemo3(104, "Andrew Anderson", 97.34);
        StudentDemo3 s2 = new StudentDemo3(101, "Peter Parker", 97);
        StudentDemo3 s3 = new StudentDemo3(10, "Jack Jackson", 87.98);
        
       LinkedList<StudentDemo3> list = new LinkedList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        System.out.println("Elements are : ");
        for(StudentDemo3 s : list)
                System.out.println(s);
        
        System.out.println("Sorting based on roll number : ");
        Collections.sort(list, new SortByRno1());
        for(StudentDemo3 s : list)
                System.out.println(s);
        
        System.out.println("Sorting based on name : ");
        Collections.sort(list, new SortByName1());
        for(StudentDemo3 s : list)
                System.out.println(s);
        
        System.out.println("Sorting based on percentage: ");
        Collections.sort(list, new SortByPer1());
        for(StudentDemo3 s : list)
                System.out.println(s);
        
    }
}








