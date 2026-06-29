import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        Set<Character> set = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
         set.add(ch);   
        }
        StringBuilder result= new StringBuilder();
        for(char ch: set){
            result.append(ch);
        }
        System.err.println(result);
        sc.close();
    }
}
