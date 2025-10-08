import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.*;
public class VectorDemo1 {
    public static void main(String[] args) {
           Vector<Integer> vec = new Vector<>();
            vec.add(100);
            vec.add(200);
            vec.add(300);
            vec.add(400);
            vec.addElement(500);
            
//            System.out.println("Elements : "+vec); 
            System.out.println("Elements are : ");
            Enumeration<Integer> e =  vec.elements();
            while(e.hasMoreElements()){
                System.out.print(e.nextElement()+"\t");
            }
            
            System.out.println("\nElements are : ");
            Iterator<Integer> e1 =  vec.iterator();
            while(e1.hasNext()){
                System.out.print(e1.next()+"\t");
            }
            
                 Collections.sort(vec);
            System.out.println("Elements : "+vec); 
            
//            ArrayList<Integer> list = new ArrayList(vec);
 ArrayList<Integer> list = new ArrayList();
            for(int i=0;i<vec.size();i++){
                list.add(vec.get(i));
            }
            System.out.println("Elements : "+list);
    }
}
