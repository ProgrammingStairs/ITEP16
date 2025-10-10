// example showing the concept of map
import java.util.*;
public class MapDemo5 {
    public static void main(String[] args) {
           HashMap<Integer,String> map = new HashMap<>();
           map.put(101, "Soap");
           map.put(102, "Fairness Cream");
           
           HashMap<Integer,Map> innerMap = new HashMap<>();
           innerMap.put(1001, map);
           
           for(Map.Entry<Integer,Map> entry :  innerMap.entrySet()){
               System.out.println("Key : "+entry.getKey() +" value : "+entry.getValue());
               
             Map<Integer,String> en= entry.getValue();
               for(Map.Entry value :  en.entrySet()){
                   System.out.println("Main Key : "+entry.getKey()+" key : "+value.getKey()+" value : "+value.getValue());
               }
           }
           
    }
}
