
import java.util.*;

public class QueueExample3 {
    public static void main(String[] args) {
     ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(100);
        queue.add(200);
        queue.offer(120);
        queue.add(450);
        queue.offer(50);
        queue.offerFirst(650);
        queue.offerLast(950);
        
        Iterator<Integer> itr =  queue.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+"\t");
        }
        
        System.out.println("removeFirst : "+queue.removeFirst());
        System.out.println("removeLast : "+queue.removeLast());
        
        System.out.println("Queue elements : "+queue);
        
        System.out.println("pollFirst : "+queue.pollFirst());
        System.out.println("pollLast : "+queue.pollLast());
        System.out.println("Queue elements : "+queue);

    }
}
