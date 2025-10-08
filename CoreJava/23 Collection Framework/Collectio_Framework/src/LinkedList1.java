
import java.util.Collections;
import java.util.LinkedList;
public class LinkedList1 { 
    public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>();
            /*
            list.offer(100);
            list.offer(200);
            list.offer(300);
            list.offerFirst(400);
            list.offerLast(500);
            System.out.println("Elements : "+list); 
            */
            list.add(100);
            list.offer(200);
            list.add(300);
            list.addFirst(1000);
            list.addLast(2000);
            list.offerFirst(400);
            list.offerLast(500);
            
            System.out.println("Elements : "+list); 
            Collections.sort(list);
            System.out.println("Elements : "+list); 
            
    }
}