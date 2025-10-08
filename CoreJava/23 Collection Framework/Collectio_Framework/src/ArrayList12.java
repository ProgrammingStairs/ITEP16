// comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class StudentDemo2{
    int rno;
    String name;
    double per;

    public StudentDemo2(int rno, String name, double per) {
        this.rno = rno;
        this.name = name;
        this.per = per;
    }
    
    @Override
    public String toString(){
        return " { "+rno+" , "+name+" , "+per+" } ";
    }
}
class SortByRno implements Comparator<StudentDemo2>{
       @Override
       public int compare(StudentDemo2 s1,StudentDemo2 s2){
           return s1.rno-s2.rno;
       }
}
class SortByName implements Comparator<StudentDemo2>{
       @Override
       public int compare(StudentDemo2 s1,StudentDemo2 s2){
           return s1.name.compareTo(s2.name);
       }
}
class SortByPer implements Comparator<StudentDemo2>{
       @Override
       public int compare(StudentDemo2 s1,StudentDemo2 s2){
           if(s1.per>s2.per)
                    return 1;
           else if(s1.per<s2.per)
                    return -1;
           else
                    return 0;
       }
}
        
public class ArrayList12 {
    public static void main(String[] args) {
        StudentDemo2 s1 = new StudentDemo2(104, "Andrew Anderson", 97.34);
        StudentDemo2 s2 = new StudentDemo2(101, "Peter Parker", 97);
        StudentDemo2 s3 = new StudentDemo2(10, "Jack Jackson", 87.98);
        
       ArrayList<StudentDemo2> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("Elements are : ");
        for(StudentDemo2 s : list)
                System.out.println(s);
        
        System.out.println("Sorting based on roll number : ");
        Collections.sort(list, new SortByRno());
        for(StudentDemo2 s : list)
                System.out.println(s);
        
        System.out.println("Sorting based on name : ");
        Collections.sort(list, new SortByName());
        for(StudentDemo2 s : list)
                System.out.println(s);
        
        System.out.println("Sorting based on percentage: ");
        Collections.sort(list, new SortByPer());
        for(StudentDemo2 s : list)
                System.out.println(s);
        
    }
}








