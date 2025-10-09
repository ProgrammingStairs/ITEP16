import java.util.*;
public class SetDemo2 {
    public static void main(String[] args) {
            HashSet<String> fruitstore = new HashSet<>();
            LinkedHashSet<String> fruitmarket = new LinkedHashSet<>();
            TreeSet<String> fruitbuzz = new TreeSet<>();
            
            String fruits[] = {"Banana","Apply","Mango"};
            for(String fruit : Arrays.asList(fruits)){
                fruitstore.add(fruit);
                fruitmarket.add(fruit);
                fruitbuzz.add(fruit);
            }
            
            System.out.println("Hashset (random order) : "+fruitstore);
            System.out.println("LinkedHashset (insertion order) : "+fruitmarket);
            System.out.println("Treeset (Sorted order | Ascending order) : "+fruitbuzz);
            
    }
}
