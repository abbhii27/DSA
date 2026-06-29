package Collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {
    public static void main(String[] args) {
        //Hashmap represent key value pairs <k,V>
        Map<String, Integer> map = new HashMap<>();

        map.put("Naveen", 35);
        map.put("Shweta", 9);
        map.put("Himanshu", 45);
        map.put("Anuj", 37);
        map.put("Rajput", 20);

        System.out.println(map.keySet());

        for(String key: map.keySet()){
            System.out.println(key+ " :" + map.get(key));
        }

    }
}
