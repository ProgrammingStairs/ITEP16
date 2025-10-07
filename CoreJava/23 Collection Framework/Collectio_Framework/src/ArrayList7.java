import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
public class ArrayList7 {
    public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();
          list.add(100);
          list.add(200);
          list.add(300);
          list.add(400);
          list.add(500);
          System.out.println("Elements : "+list);
          
          int arr[] = new int[list.size()];
          for(int i=0;i<arr.length;i++){
              arr[i] = list.get(i);
          }
          System.out.println("Array elements are : ");
          for(int element : arr){
              System.out.print(element+"\t");
          }
    }
}








