
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(100);
        System.out.println("Element : "+queue);
        
//        System.out.println("remove : "+queue.remove());
//        System.out.println("Element : "+queue);
    
//        System.out.println("poll : "+queue.poll());
//        System.out.println("Element : "+queue);

//        System.out.println("peek : "+queue.peek());
//        System.out.println("Element : "+queue);

        System.out.println("element : "+queue.element());
        System.out.println("Element : "+queue);

    }
}
