// example showing the concept of map
import java.util.*;
public class MapDemo1 {
    public static void main(String[] args) {
            HashMap map = new HashMap();
            map.put(101, "Andrew Anderson");
            map.put("Two", "Peter Parker");
            map.put(null,"Jack Jackson");
            map.put(101,"Simon Sim");
            
            System.out.println("Elements : "+map);
    }
}
