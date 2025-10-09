
import java.util.*;

public class SetDemo1 {

    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();

        set.add(100);
        set.add(30);
        set.add(100);
//        set.add(null);
        set.add(430);

        System.out.println("Elements : " + set);
        System.out.println("Maximum : "+Collections.max(set));
        System.out.println("Minimum : "+Collections.min(set));
        
        Iterator itr =  set.iterator();
        List<Integer> list = new ArrayList<>();      
        while(itr.hasNext()){
            list.add((Integer)itr.next());
        }
        Collections.sort(list);
        System.out.println("sorted data : "+list);
        
        
    }
}
