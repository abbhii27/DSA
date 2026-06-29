
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNum {
    public static void main(String[] args) {
    int[] arr = {10,50,30,80,20,10,20};
    Set<Integer> set = new HashSet<>();
    for(int num: arr){
        if(!set.add(num)){
            System.out.println(num);
        }
    }

     }
}
