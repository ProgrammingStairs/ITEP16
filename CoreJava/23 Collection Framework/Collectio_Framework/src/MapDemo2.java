// example showing the concept of map
import java.util.*;
public class MapDemo2 {
    public static void main(String[] args) {
            HashMap<Integer,String> map = new HashMap<>();
            map.put(101, "Andrew Anderson");
            map.put(102, "Peter Parker");
//            map.put(null,"Jack Jackson");
            map.put(103,"Simon Sim");
            //System.out.println("Elements : "+map);
            Set set =  map.entrySet();
            Iterator itr  = set.iterator();
            while(itr.hasNext()){
                //System.out.println(itr.next());
                Map.Entry entry = (Map.Entry)itr.next();
                System.out.print("\nKey : "+entry.getKey()+" Value : "+entry.getValue());
                if(entry.getKey().equals(new Integer(102)))
                        System.out.print("\t------------Ranker---------------");
            }
    }
}
