import java.util.HashMap;
import java.util.Map;

public class NthNonRepeatedCh {
    public static void main(String[] args) {

        String str = "swiss";

        Map<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = 0;

        // Find second non-repeated character
        for (char ch : str.toCharArray()) {

            if (map.get(ch) == 1) {
                count++;

                if (count == 2) {
                    System.out.println("Second non repeated character: " + ch);
                    break;
                }
            }
        }
    }
}