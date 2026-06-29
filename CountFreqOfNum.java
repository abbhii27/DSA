
import java.util.HashMap;
import java.util.Map;

public class CountFreqOfNum {
    public static void main(String[] args) {
        int[] arr = {5, 2, 5, 3, 2, 5, 4, 3};
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
}
        
    }
}
