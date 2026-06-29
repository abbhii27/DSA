import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch: str.toCharArray() ){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);
        sc.close();
    }
}
