import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatedCh {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch: str.toCharArray() ){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(char ch: str.toCharArray()){
            if(map.get(ch) == 1){
                System.err.println(ch);
                break;
            }
        sc.close();
        }
    }
}
