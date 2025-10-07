import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArrayList4 {
    public static void main(String[] args) {
           ArrayList<Integer> list = new ArrayList<>();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter size : ");
           int size = sc.nextInt();
           System.out.println("Enter Elements : ");
           for(int i=0;i<size;i++){
               list.add(sc.nextInt());
           }
           System.out.println("Elements are : "+list);
    }
}
