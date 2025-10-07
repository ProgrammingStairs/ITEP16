import java.util.ArrayList;
import java.util.List;
public class ArrayList3 {
    public static void main(String[] args) {
           ArrayList<Integer> list = new ArrayList<>();
           System.out.println("size : "+list.size());
           System.out.println("isEmpty : "+list.isEmpty());
           
           Integer element = new Integer(100); 
           list.add(element);
           
           Integer elem = Integer.valueOf(200);
            list.add(elem);
            
            Integer entry = 300;
            list.add(entry);
            
            list.add(Integer.parseInt("400"));
            
            list.add(500);
            list.add(300);
            
            System.out.println("Elements : "+list); 
            list.add(2, 2000);
            System.out.println("Elements : "+list); 
            list.remove(2);
            System.out.println("Elements : "+list); 
            list.remove(new Integer(300));
            System.out.println("Elements : "+list); 
           System.out.println("size : "+list.size());
           System.out.println("isEmpty : "+list.isEmpty());
            
    }
}
