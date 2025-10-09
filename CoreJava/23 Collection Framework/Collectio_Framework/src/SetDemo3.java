import java.util.*;
public class SetDemo3 {
    public static void main(String[] args) {
       Set<Integer> set;
       long startTime,endTime; 
       
       set = new HashSet<>();
       startTime = System.nanoTime();
        for(int i=1;i<=100;i++){
            set.add(i);
        }
       endTime = System.nanoTime();
        System.out.println("Time taken by HashSet : "+(endTime-startTime));

       set = new LinkedHashSet<>();
       startTime = System.nanoTime();
        for(int i=1;i<=100;i++){
            set.add(i);
        }
       endTime = System.nanoTime();
        System.out.println("Time taken by LinkedHashSet : "+(endTime-startTime));

           set = new TreeSet<>();
       startTime = System.nanoTime();
        for(int i=1;i<=100;i++){
            set.add(i);
        }
       endTime = System.nanoTime();
        System.out.println("Time taken by TreeSet : "+(endTime-startTime));

    }
}
