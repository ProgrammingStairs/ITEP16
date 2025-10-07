
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList9 {
    public static void main(String[] args) {
       ArrayList<Double> list = new ArrayList<>();
       list.add(23.45);
       list.add(21.32);
       list.add(78.456);
       list.add(678.3);
       list.add(2.89);
       System.out.println("Elements : "+list);
        System.out.println("Minimum Element : "+Collections.min(list));
        System.out.println("Maximum Element : "+Collections.max(list));
        Collections.shuffle(list);
        System.out.println("Shuffle Elements : "+list);
        Collections.sort(list);
        System.out.println("Sort Elements : "+list);
        Collections.reverse(list);
        System.out.println("Reverse Elements : "+list);
        
    }
}








