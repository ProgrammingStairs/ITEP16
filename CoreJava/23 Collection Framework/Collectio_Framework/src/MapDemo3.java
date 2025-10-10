// example showing the concept of map
import java.util.*;
public class MapDemo3 {
    public static void main(String[] args) {
//            HashMap<Integer,String> map = new HashMap<>();
//            LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
            TreeMap<Integer,String> map = new TreeMap<>();
            
            map.put(145, null);
            map.put(102, "Peter Parker");
            map.put(123,"Simon Sim");
            System.out.println(map);
            
//            for(Integer entry : map.keySet()){
//                System.out.println(entry);
//            }

            for(Map.Entry entry : map.entrySet()){
                //System.out.println(entry);
                System.out.println("Key : "+entry.getKey()+" value : "+entry.getValue());
            }

    }
}
