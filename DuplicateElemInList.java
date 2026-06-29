
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElemInList {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10, 20, 30, 20, 40, 10, 50);
        Set<Integer> set= new HashSet<>();
        for(int num: list){
            if(!set.add(num)){
                System.out.println(num);
            }
            
        }
    }
}
