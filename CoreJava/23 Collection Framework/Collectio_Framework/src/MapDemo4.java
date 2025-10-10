// example showing the concept of map
import java.util.*;
public class MapDemo4 {
    public static void main(String[] args) {
            HashMap<String,String> map = new HashMap<>();
            String str[][] = {
                {"Color1","Red"},
                {"Color2","Green"},
                {"Color3","Blue"}
            };
            
            for(String st[] : str){
                map.put(st[0],st[1]);
            }
            
            System.out.println(map);
    }
}
