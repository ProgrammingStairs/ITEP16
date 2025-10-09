
import java.util.*;

public class QueueExample1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(100);
        queue.add(200);
        queue.offer(120);
        queue.add(450);
        queue.offer(650);
        
        Iterator<Integer> itr =  queue.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+"\t");
        }
        
        System.out.println("Maximum : "+Collections.max(queue));
        System.out.println("Minimum: "+Collections.min(queue));
        ArrayList<Integer> list = new ArrayList<>(queue);
        Collections.sort(list);
        System.out.println("Sorted data : "+list);
    }
}
