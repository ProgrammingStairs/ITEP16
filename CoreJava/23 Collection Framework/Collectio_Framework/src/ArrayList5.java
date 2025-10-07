import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
public class ArrayList5 {
    public static void main(String[] args) {
           ArrayList<String> list = new ArrayList<>();
          list.add("Andrew");
          list.add("Peter");
          list.add("Mathew");
          list.add(null);
          list.add("Simon");
          list.add("Jackson");
          
          System.out.println("Element : "+list.get(3));
          System.out.println("Element : "+list.get(list.size()-1));
          
          // Method-I
//          System.out.println("Elements : "+list);
            
            // Method-II
            /*
            Iterator itr = list.iterator();
            while(itr.hasNext()){
                System.out.print(itr.next()+"\t");
            }
            */
            
            // Method-III
            /*
            for(Iterator itr = list.iterator();itr.hasNext();){
                System.out.print(itr.next()+"\t");
            }
            */
            
            // Method-IV
//            for(String str : list){
//                System.out.print(str+"\t");
//            }

            // Method-V
            /*
            ListIterator itr = list.listIterator();
            System.out.println("Forward direction : ");
            while(itr.hasNext()){
                    System.out.print(itr.next()+"\t");
            }
            
            System.out.println("\nBackward direction : ");
            while(itr.hasPrevious()){
                    System.out.print(itr.previous()+"\t");
            }
            */
            /*
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i)+"\t");
            }
            */
          for(int i=list.size()-1;i>=0;i--){
                System.out.print(list.get(i)+"\t");
            }

    }
}








