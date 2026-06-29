
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSortedArr {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        int[] b= {3,4,5,6,7};
        Set<Integer> set= new HashSet<>();
        for(int num: a){
            set.add(num);
        }
        for(int num: b){
            set.add(num);
        }
        System.out.println(set);
    }
}
